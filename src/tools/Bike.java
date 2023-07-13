package tools;

public class Bike {

    private String bikeName;
    private String brand;
    private int horsePower;
    private int releaseYear;

    public Bike(){

    }
    public Bike(String brand, String bikeName, int horsePower, int releaseYear){
        this.bikeName = bikeName;
        this.brand = brand;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
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
}
