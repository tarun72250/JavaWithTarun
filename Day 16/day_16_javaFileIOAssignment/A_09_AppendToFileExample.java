package day_16_javaFileIOAssignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//9.If you want to append the new data to the existing content of the file instead of overwriting it,.
public class A_09_AppendToFileExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        // Appending to the file
        try (FileWriter fileWriter = new FileWriter("D:\\Java IO DebugShala\\a.txt", true)) 
        {
        	System.out.println("Enter the text you want to append to the file: ");
            String userInput = scanner.nextLine();
        	fileWriter.write(userInput + System.lineSeparator());
            System.out.println("Successfully appended to the file.");
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } 
        finally 
        {
            scanner.close();
        }
    }
}
