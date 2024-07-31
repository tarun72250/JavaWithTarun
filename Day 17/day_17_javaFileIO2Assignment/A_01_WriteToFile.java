package day_17_javaFileIO2Assignment;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
//1.write a program to create a Person object and save its data to a text file.
public class A_01_WriteToFile {

	public static void main(String[] args) {
        // Create a Person object
		A_01_Student person = new A_01_Student("John Doe", 30, "123 Main St, Anytown, USA");

        // Define the file path
        String filePath = "D:\\Java IO DebugShala\\person_info.txt";

        // Write the Person object's data to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) 
        {
            writer.write(person.toString());
            System.out.println("Person information saved to " + filePath);
        } 
        catch (IOException e) 
        {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
