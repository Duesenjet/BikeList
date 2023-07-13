package tools;

import java.util.List;
import java.util.*;

public class CommandList {

    private static List<String> commandList = new ArrayList();

    static {                                                            //List for all commands
        commandList.add("help");    //shows all commands
        commandList.add("ls");      //prints the bikelist
        commandList.add("new bike");    //creates a new Bike
        commandList.add("rm bike");
        commandList.add("shutdown");    //kills the programm


    }

    private BikeList bikeList = new BikeList();

    public CommandList() {

    }

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
                break;
            case "new bike":
                bikeList.createNewBike();
                break;

            case "rm bike":
                bikeList.removeBikeFromList();
        }

    }

    public List getCommandList() {
        return commandList;
    }

    public void printCommandList() {
        String text = "";
        for (int i = 0; i < commandList.size(); i++) {
            text += commandList.get(i) + "\n";
        }
        System.out.print(text);

    }


}
