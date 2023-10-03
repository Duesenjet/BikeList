package tools;

import java.util.*;

public class Car {
    private String carName;
    private String brand;
    private int horsePower;
    private int releaseYear;
    private static int numberOfCars = 0;

    public Car() {

    }

    public Car(String brand, String carName, int horsePower, int releaseYear) {
        this.carName = carName;
        this.brand = brand;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        numberOfCars++;
    }

    public String getBrand() {
        return brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCarName() {
        return carName;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void lowerCarCounter() {
        numberOfCars--;
    }
}
