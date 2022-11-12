package tools.kata.beanvalidators.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CaseCheckValidator implements ConstraintValidator<CaseCheck, String> {

    @Override
    public void initialize(CaseCheck constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return false;
    }
}
