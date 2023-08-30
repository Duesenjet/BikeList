package tools;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

//Listen in Objekte Listen machen als Methoden

public class FileHandler {

    BikeList bikeList = new BikeList();
    CarList carList = new CarList();
    static FileReader fileReader;
    static BufferedReader bufferedReader;
    public FileHandler(){

    }

    public static void getCarList(){
        String fileName = "CarList.txt";
        String text = "";


        try (BufferedReader buffer = new BufferedReader(new FileReader(fileName))){
            String input = "";
            while ((input = buffer.readLine()) != null){
                    text += input;
            }

        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }






}
