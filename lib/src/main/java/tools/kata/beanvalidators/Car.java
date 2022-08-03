package tools.kata.beanvalidators;


import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class Car {
    @NotNull
    private final String manufacturer;
    @Size(min = 4, max = 14)
    private final String licencePlate;
    @Min(2)
    private final int seatCount;
    @Past
    @NotNull
    private final LocalDate registrationDate;
    @Email
    private final String driverEmail;

    public Car(@NotNull String manufacturer, String licencePlate, int seatCount, LocalDate registrationDate, String driverEmail) {
        this.manufacturer = manufacturer;
        this.licencePlate = licencePlate;
        this.seatCount = seatCount;
        this.registrationDate = registrationDate;
        this.driverEmail = driverEmail;
    }
}
