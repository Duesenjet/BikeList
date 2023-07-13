package tools;

import java.util.*;

public class BikeList {

    private static List<Bike> bikeList = new ArrayList<>();
    static {
        bikeList.add(new Bike("KTM", "690 SMCR", 70, 2020));
        bikeList.add(new Bike("BMW", "M 1000 RR", 214, 2023));
        bikeList.add(new Bike("KTM", "EXC 300", 63, 2021));
    }

    public BikeList(){

    }

    public void addBikeToList(Bike bike){
        bikeList.add(bike);
    }
    public void removeBikeFromList(){

    }
    public void printBikeList(){
        String text = "";
        for (int i = 0; i < bikeList.size(); i++){
            text += "Brand: " + bikeList.get(i).getBrand() + ", Modell: " + bikeList.get(i).getBikeName() + ", Leistung: " + bikeList.get(i).getHorsePower() + ", Erscheinungsjahr: " + bikeList.get(i).getReleaseYear() + "\n";
        }
        System.out.print(text);
    }


}
