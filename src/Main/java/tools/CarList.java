package tools;



import java.util.*;

public class CarList {
    Scanner scanner = new Scanner(System.in);

    Car car = new Car();
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("KTM", "XBox GT XR", 500, 2023));
        carList.add(new Car("BMW", "M2", 510, 2022));
        carList.add(new Car("Audi", "R8", 600, 2021));
    }

    public CarList() {
    }

    public void addCarToList(Car car) {
        carList.add(car);
    }

    public void removeCarFromList() {
        boolean checkRemoved = false;
        System.out.print("Modell, or stop   ----> ");
        String carName = scanner.nextLine();
        carName = carName.trim();
        if (!carName.equals("stop")) {
            for (int i = 0; i < carList.size(); i++) {
                if (carName.equals(carList.get(i).getCarName())) {
                    carList.remove(i);
                    car.lowerCarCounter();
                    checkRemoved = true;
                    break;
                }
            }
            if (checkRemoved)
                System.out.println("Car removed!");
            else
                System.out.println("Car not found!");
        }else
            System.out.println("canceled!");
    }

    public void createNewCar() {                //method for creating a new car for the list

        String brand;
        String carName;
        int horsepower = 0;
        int releaseYear = 0;
        boolean check1 = true;
        boolean check2 = true;

        System.out.print("creating new car \n");
        System.out.print("Brand: ");
        brand = scanner.nextLine();
        System.out.print("Carname: ");
        carName = scanner.nextLine();

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
        System.out.println("New car added!");
        addCarToList(new Car(brand, carName, horsepower, releaseYear));
    }


    public void printCarList() {
        String text = "";
        for (int i = 0; i < carList.size(); i++) {
            text += "Brand: " + carList.get(i).getBrand() + ", Modell: " + carList.get(i).getCarName() +
                    ", Leistung: " + carList.get(i).getHorsePower() + ", Erscheinungsjahr: " +
                    carList.get(i).getReleaseYear() + "\n";
        }
        text += "cars: " + car.getNumberOfCars() + "\n";
        sepl();
        System.out.println("    Cars");
        sepl();
        System.out.print(text);
        sepl();
    }

    public static void sepl(){System.out.println("-".repeat(80));}

}
