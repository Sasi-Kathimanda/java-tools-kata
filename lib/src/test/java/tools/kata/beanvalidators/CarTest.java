package tools.kata.beanvalidators;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import javax.validation.Validation;
import javax.validation.Validator;
import java.math.BigDecimal;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;


class CarTest {
    private Car sut;
    private static Validator validator;
    private static final LocalDate regDate = LocalDate.of(2017, 3, 19);

    @BeforeEach
    void setUp() {
        validator = Validation.buildDefaultValidatorFactory().getValidator();
    }

    @Test
    void whenManufacturerIsNull() {
        //When
        var car = new Car(null, "RV07YFG", 4, regDate, null, BigDecimal.ZERO, "(999)888-1234");
        //Then
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }

    @Test
    void whenLicencePlateIsOutOfRange() {
        var car = new Car("Benz", "ARG", 4, regDate, null, BigDecimal.ZERO, "(999)888-1234");
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }

    @Test
    void whenSeatNumberIsLessThanRecommended() {
        var car = new Car("Audi Q7", "RV07YFG", 1, regDate, null, BigDecimal.ZERO, "(999)888-1234");
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }

    @Test
    void whenRegDateIsInFuture() {
        LocalDate futureDate = LocalDate.of(2027, 3, 19);
        var car = new Car("Audi Q7", "RV07YFG", 2, futureDate, null, BigDecimal.ZERO, "(999)888-1234");
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }

    @Test
    void whenDriverEmailIsNotValid() {
        var car = new Car("Audi Q7", "RV07YFG", 2, regDate, "xyz", BigDecimal.ZERO, "(999)888-1234");
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }

    @Test
    void whenCarPriceIsNotValid() {
        var car = new Car("Audi Q7", "RV07YFG", 2, regDate, "xyz@xyz.com", new BigDecimal("9999.789"), "(999)888-1234");
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }

    @Test
    void whenThePhoneNumberIsNotValid() {
        var car = new Car("Audi Q7", "RV07YFG", 2, regDate, "xyz@xyz.com", new BigDecimal("9999.78"), "1234567890");
        var violations = validator.validate(car);
        assertEquals(1, violations.size());
    }
}