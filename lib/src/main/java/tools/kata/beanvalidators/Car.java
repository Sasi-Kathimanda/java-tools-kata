package tools.kata.beanvalidators;


public class Car {
    private String manufacturer;
    private String licencePlate;
    private int seatCount;

    public Car(String manufacturer, String licencePlate, int seatCount) {
        this.manufacturer = manufacturer;
        this.licencePlate = licencePlate;
        this.seatCount = seatCount;
    }
}
