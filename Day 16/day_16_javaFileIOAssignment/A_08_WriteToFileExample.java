package day_16_javaFileIOAssignment;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
//8.Write a simple Java program that takes input from the user and writes it to a file. 
public class A_08_WriteToFileExample {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

     

        // Writing to the file
        try (FileWriter fileWriter = new FileWriter("D:\\\\Java IO DebugShala\\\\a.txt")) 
        {
        	System.out.println("Enter the text you want to write to the file: ");
        	String userInput = scanner.nextLine();
            
        	fileWriter.write(userInput);
            System.out.println("Successfully wrote to the file.");
        } 
        catch(IOException e) 
        {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally 
        {
            scanner.close();
        }
    }
}
