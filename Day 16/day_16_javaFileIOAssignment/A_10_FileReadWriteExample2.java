package day_16_javaFileIOAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//10.the complete Java code that reads from a file using BufferedReader and writes to a file using 
//PrintWriter. The PrintWriter will take a FileWriter as an argument to facilitate the writing 
//operation. We'll read the content from one file and write it to another file, while appending 
//a specific line at the end.

public class A_10_FileReadWriteExample2 
{

    public static void main(String[] args) 
    {
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            // Reading from the input file
            FileReader fr = new FileReader("D:\\Java IO DebugShala\\input.txt");
            br = new BufferedReader(fr);
            
            // Writing to the output file , if file is not created , created that file automatically
            FileWriter fw = new FileWriter("D:\\Java IO DebugShala\\output.txt", true); // append mode
            pw = new PrintWriter(fw);
            
            String line;
            while ((line = br.readLine()) != null) {
                // Writing each read line to the output file
                pw.println(line);
            }
            
            // Appending a specific line at the end of the file
            pw.println("This is an appended line.");

            System.out.println("File reading and writing completed successfully.");
        } 
        catch(IOException e)
        {
            System.out.println("An error occurred during file operations.");
            e.printStackTrace();
        } 
        finally 
        {
            try 
            {
                if (br != null) br.close();
                if (pw != null) pw.close();
            } 
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
