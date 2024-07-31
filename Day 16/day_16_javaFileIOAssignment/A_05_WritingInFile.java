package day_16_javaFileIOAssignment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
//5.Develop a Java program that takes input from the user via the console and writes it to a specified file 
//using OutputStream. The program should continue to take input until the user types "stop", at which point 
//it should terminate and save the content to the file. If the file already exists, the new content should be 
//appended to the existing content.
public class A_05_WritingInFile
{
	public static void main(String[] args) {
		OutputStream os =null;//writting your input into file
		BufferedReader br = null;//for taking input from user 
		try
		{
			br = new BufferedReader(new InputStreamReader(System.in));
			//os = new FileOutputStream("D:\\Java IO DebugShala\\c.txt");
			os = new FileOutputStream("D:\\Java IO DebugShala\\d.txt",true);
			
			System.out.println("Enter 'stop' to quit");
			
			String line;
			
			while( !((line = br.readLine()).equals("stop")))
			{
				os.write((line + System.lineSeparator()).getBytes());//append in newly line
				//os.write(line.getBytes());
			}		
			System.out.println("Printing Succesfully done....");
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not present");
		}
		catch(IOException e)
		{
			System.out.println("IO Error");
		}		
		finally
		{
			try 
			{
				br.close();
				os.close();
			} 
			catch(IOException e)
			{
				e.printStackTrace();
			}
			
		}

	}
}
