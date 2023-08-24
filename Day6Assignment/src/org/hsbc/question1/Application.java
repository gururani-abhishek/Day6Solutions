package org.hsbc.question1;

import org.hsbc.question1.question2.StoreFactory;
import org.hsbc.question1.question2.StoreFactoryImp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.print("Enter fileName : "); // -> prompt the user to enter filename
        Scanner scannerObj = new Scanner(System.in); // -> create a scanner object to take user input from the console
        String fileName = scannerObj.nextLine(); // -> input the filename that will be created

        // -> idea : I'm asking the user to enter a prose with 'n' number of lines

        try {
            StoreFactory storeFactory = new StoreFactoryImp();
            Storage proseStorageFileImpl = storeFactory.createStorageFileObject(fileName);
            System.out.print("How many lines do your prose have : "); // -> ask the user for number of lines in the prose
            int numberOfLines = scannerObj.nextInt(); // -> input number of lines
            scannerObj.nextLine(); // -> to eat the escape character entered by the user after entering number of lines
            System.out.println("-----Please enter your lines-----");

            String[] lines = new String[numberOfLines]; // -> String array to store the lines entered by the user
            // -> looping to take input lines by the user
            for(int idx = 0; idx < numberOfLines; idx++) {
                lines[idx] = scannerObj.nextLine();
            }
            // calling the addProseToTheFile method of StorageFileImpl class
            proseStorageFileImpl.addProseToTheFile(lines, fileName);
        }
        catch (IOException eObject) {
            System.out.println("error in proseStorageFileImpl object creation"); // IO exception thrown from StorageFileImpl object creation
        }
        finally {
            scannerObj.close(); // cleaning the resources
        }
    }
}
