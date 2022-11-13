package tools.kata.beanvalidators.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckCaseValidator implements ConstraintValidator<CheckCase, String> {
    CaseMode caseMode;

    @Override
    public void initialize(CheckCase constraintAnnotation) {
        caseMode = constraintAnnotation.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) return true;
        if (CaseMode.UPPERCASE.equals(caseMode)) {
            return value.equals(value.toUpperCase());
        } else return value.equals(value.toLowerCase());
    }
}
