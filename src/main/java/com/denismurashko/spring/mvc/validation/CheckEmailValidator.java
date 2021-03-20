package com.denismurashko.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.lang.annotation.Annotation;

public class CheckEmailValidator
        implements ConstraintValidator<CheckEmail,String> {
//указываем анотацию и тип данных к которому применяем анотацию
 private String endOfEmail;
    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail=checkEmail.value();//value из анотации
    }

    @Override
    public boolean isValid(String enteredValue, ConstraintValidatorContext constraintValidatorContext) {

        return enteredValue.endsWith(endOfEmail);
    }
}
