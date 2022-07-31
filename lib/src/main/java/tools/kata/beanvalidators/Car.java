package tools.kata.beanvalidators;


import javax.validation.constraints.NotNull;

public class Car {
    @NotNull
    private String manufacturer;
    private String licencePlate;
    private int seatCount;

    public Car(String manufacturer, String licencePlate, int seatCount) {
        this.manufacturer = manufacturer;
        this.licencePlate = licencePlate;
        this.seatCount = seatCount;
    }
}
