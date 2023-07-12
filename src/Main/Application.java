package Main;

import java.util.*;

public class Application {
    /*
    Mittels Kommandozeile Bikelist erstellen und bearbeiten
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void help(){
        String text = "All commands:";
        String commands = "ls";
    }


    public static void main(String[] args) {
        String commandInput = "";
        String header = "Bikelist Maker \nType in <help> for all commands";
        do {
            System.out.print("> ");
            commandInput = scanner.nextLine();

            if (commandInput.equals("help")){
                help();
            }


        }while (!commandInput.equals("shutdown"));

    }
}
