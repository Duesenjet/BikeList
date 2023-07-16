package tools;

import java.util.*;

public class BikeList {

    Scanner scanner = new Scanner(System.in);
    Bike bike = new Bike();
    private static List<Bike> bikeList = new ArrayList<>();

    static {
        bikeList.add(new Bike("KTM", "690 SMCR", 70, 2020));
        bikeList.add(new Bike("BMW", "M 1000 RR", 214, 2023));
        bikeList.add(new Bike("KTM", "EXC 300", 63, 2021));
    }

    public BikeList() {
    }

    public void addBikeToList(Bike bike) {
        bikeList.add(bike);
    }

    public void removeBikeFromList() {
        boolean checkRemoved = false;
        System.out.print("Modell, or stop   ----> ");
        String bikeName = scanner.nextLine();
        bikeName = bikeName.trim();
        if (!bikeName.equals("stop")) {
            for (int i = 0; i < bikeList.size(); i++) {
                if (bikeName.equals(bikeList.get(i).getBikeName())) {
                    bikeList.remove(i);
                    bike.lowerBikeCounter();
                    checkRemoved = true;
                    break;
                }
            }
            if (checkRemoved)
                System.out.println("Bike removed!");
            else
                System.out.println("Bike not found!");
        }else
            System.out.println("canceled!");
    }

    public void createNewBike() {

        String brand;
        String bikeName;
        int horsepower = 0;
        int releaseYear = 0;
        boolean check1 = true;
        boolean check2 = true;

        System.out.print("creating new Bike \n");
        System.out.print("Brand: ");
        brand = scanner.nextLine();
        System.out.print("Bikename: ");
        bikeName = scanner.nextLine();

        while (check1) {
            try {
                System.out.print("Horsepower: ");
                String input = scanner.nextLine();
                horsepower = Integer.parseInt(input);
                check1 = false;
            } catch (NumberFormatException e) {
                System.out.println("wrong format!");
            }
        }
        while (check2) {
            try {
                System.out.print("Releaseyear: ");
                String input = scanner.nextLine();
                releaseYear = Integer.parseInt(input);
                check2 = false;
            } catch (NumberFormatException e) {
                System.out.println("wrong format!");
            }
        }
        System.out.println("New bike added!");
        addBikeToList(new Bike(brand, bikeName, horsepower, releaseYear));
    }


    public void printBikeList() {
        String text = "";
        for (int i = 0; i < bikeList.size(); i++) {
            text += "Brand: " + bikeList.get(i).getBrand() + ", Modell: " + bikeList.get(i).getBikeName() + ", Leistung: " + bikeList.get(i).getHorsePower() + ", Erscheinungsjahr: " + bikeList.get(i).getReleaseYear() + "\n";
        }
        text += "bikes: " + bike.getNumberOfBikes() + "\n";
        System.out.print(text);
    }

}
