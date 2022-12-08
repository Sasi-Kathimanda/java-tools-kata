package tools.kata.beanvalidators.custom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tools.kata.beanvalidators.Car;

import javax.validation.Validation;
import javax.validation.Validator;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CheckCaseValidatorTest {
    private static Validator validator;
    private static final LocalDate regDate = LocalDate.of(2017, 3, 19);

    @BeforeEach
    void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void givenLowercase_ShouldReturnViolation_Message() {
        //given
        var car = new Car("Audi A7", "rv07yfg", 4, regDate, "sk@sk.com", BigDecimal.ZERO, "(999)888-1234");
        //when
        var violations = validator.validate(car);
        //then
        assertEquals(1, violations.size());
        assertEquals("invalid Case supplied", violations.iterator().next().getMessage());
    }

    @Test
    void givenUppercase_ShouldNotReturnViolation_Message() {
        //given
        var car = new Car("Audi A7", "RV07YFG", 4, regDate, "sk@sk.com", BigDecimal.ZERO, "(999)888-1234");
        //when
        var violations = validator.validate(car);
        //then
        assertEquals(0, violations.size());
    }
}