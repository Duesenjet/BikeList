import tools.CommandList;

import java.util.*;

public class Application {
    /*
    Mittels Kommandozeile Bikelist erstellen und bearbeiten
     */
    private static Scanner scanner = new Scanner(System.in);
    public static CommandList command = new CommandList();
    public static List<String> commandList = command.getCommandList();

    public static void sepl(){System.out.println("-".repeat(80));}


    public static void main(String[] args) {
        String commandInput = "";
        String header = "Bike- and Carlist Maker \nType in <help> for all commands";
        System.out.println(header);
        do {

            System.out.print("> ");
            commandInput = scanner.nextLine();
            commandInput = commandInput.trim();

            if (command.isCommand(commandInput)) {
                command.executeCommand(commandInput);

            }else
                System.out.println("command not found! type 'help' for all commands");


        } while (!commandInput.equals("shutdown"));

    }
}
