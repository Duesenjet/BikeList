package tools;

import java.util.List;
import java.util.*;

public class CommandList {

    private static List<String> commandList = new ArrayList();

    static {                                                            //List for all commands
        commandList.add("help");    //shows all commands
        commandList.add("ls");      //prints the bikelist and carlist
        commandList.add("ls bike");    //prints only bike list
        commandList.add("ls car");     //prints only car list
        commandList.add("new bike");    //creates a new Bike
        commandList.add("new car");     //creates a new car
        commandList.add("rm car");      //removes car
        commandList.add("rm bike");     //rm bike
        commandList.add("shutdown");    //kills the programm

    }

    private BikeList bikeList = new BikeList();
    private CarList carList = new CarList();

    public CommandList() {}

    public boolean isCommand(String command) {
        if (!command.equals("shutdown")) {
            for (int i = 0; i < commandList.size(); i++) {
                if (command.equals(commandList.get(i)))
                    return true;
            }
            return false;
        } else
            return false;
    }

    public void executeCommand(String command) {

        switch (command) {
            case "help":
                printCommandList();
                break;
            case "ls":
                bikeList.printBikeList();
                carList.printCarList();
                break;
            case "ls car":
                carList.printCarList();
                break;
            case "ls bike":
                bikeList.printBikeList();
                break;
            case "new bike":
                bikeList.createNewBike();
                break;
            case "new car":
                carList.createNewCar();
                break;
            case "rm car":
                carList.removeCarFromList();
                break;
            case "rm bike":
                bikeList.removeBikeFromList();
                break;


        }

    }

    public List getCommandList() {
        return commandList;
    }

    public void printCommandList() {
        String text = "";
        for (int i = 0; i < commandList.size(); i++) {
            if (!commandList.get(i).equals("help"))
            text += commandList.get(i) + "\n";
        }
        System.out.print(text);

    }


}
