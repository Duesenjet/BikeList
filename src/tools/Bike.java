package tools;

public class Bike {

    private String bikeName;
    private String brand;
    private int horsePower;
    private int releaseYear;
    private static int numberOfBikes = 0;

    public Bike() {

    }

    public Bike(String brand, String bikeName, int horsePower, int releaseYear) {
        this.bikeName = bikeName;
        this.brand = brand;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        numberOfBikes++;
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

    public String getBikeName() {
        return bikeName;
    }

    public int getNumberOfBikes() {
        return numberOfBikes;
    }

    public void lowerBikeCounter() {
        numberOfBikes--;
    }
}
