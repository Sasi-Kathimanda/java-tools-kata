package tools.kata.beanvalidators;


import tools.kata.beanvalidators.custom.CaseMode;
import tools.kata.beanvalidators.custom.CheckCase;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Car {
    @NotNull
    private final String manufacturer;
    @Size(min = 4, max = 14)
    @CheckCase(CaseMode.UPPERCASE)
    private final String licencePlate;
    @Min(2)
    private final int seatCount;
    @Past
    @NotNull
    private final LocalDate registrationDate;
    @Email
    private final String driverEmail;
    @Digits(integer = 4, fraction = 2)
    private final BigDecimal price;
    @Pattern(regexp="\\(\\d{3}\\)\\d{3}-\\d{4}")
    private final String phoneNumber;
    public Car(@NotNull String manufacturer, String licencePlate, int seatCount, LocalDate registrationDate, String driverEmail, BigDecimal price, String phoneNumber) {
        this.manufacturer = manufacturer;
        this.licencePlate = licencePlate;
        this.seatCount = seatCount;
        this.registrationDate = registrationDate;
        this.driverEmail = driverEmail;
        this.price = price;
        this.phoneNumber = phoneNumber;
    }
}
