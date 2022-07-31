package tools.kata.beanvalidators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;


import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private Car sut;
    private static Validator validator;

    @BeforeEach
    void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void whenManufacturerIsNull() {
        //When
        var car = new Car(null, "RV07YFG", 4);
        //Then
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }
}