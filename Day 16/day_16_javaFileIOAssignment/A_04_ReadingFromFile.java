package day_16_javaFileIOAssignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
//This code demonstrates reading data from a file using Java's input/output (IO) classes.
public class A_04_ReadingFromFile {
	
	public static void main(String[] args) throws IOException 
	{
		//how to read characters from a file using the FileInputStream
		//1. way
//		InputStream i = new FileInputStream("D:\\Java IO DebugShala\\a.txt");
//		
//		int n;
//		
//		while((n = i.read())!= -1)
//		{
//			System.out.print((char)n);
//		}
//		
//		i.close();
//		
		
		//2.way
//		Reader r = new FileReader("D:\\\\Java IO DebugShala\\\\b.txt");
//
//		int n;
//
//		while((n = r.read())!= -1)
//		{
//			System.out.print((char)n);
//		}
//		
//		r.close();
		
		
		//3.way Take input from console and write that in File
		OutputStream o = new FileOutputStream("D:\\Java IO DebugShala\\c.txt");
		
		//Writer w = new FileWriter("D:\\Java IO DebugShala\\c.txt"); 
		String output = "Welcome Hello All Learning Java  by Changing input";
		
		String text = output + System.lineSeparator();

		o.write(text.getBytes());
		//w.write("Rajat");
		
		
		System.out.println("Printed Succesfully....!");
		o.close();
		//w.close();

		
		
	}

}

/*

//      how to read characters from a file using the FileInputStream
		InputStream i = new FileInputStream("D:\\Java IOProject Programs\\Demo.txt");
//		int n; 
//		while( (n = i.read()) != -1 )
//			System.out.print((char)n);
//		i.close();
		
		//This line creates a Reader r by opening a FileReader to read from the same file. FileReader is a subclass of Reader specialized for reading character streams from files.
		Reader r = new FileReader("D:\\Java IOProject Programs\\Demo.txt");
//		int n; //Declares an integer variable n to store the data read from the file.
//		while( (n = r.read()) != -1 )//This loop reads characters from the file using the read() method of the Reader object r. It continues reading until the end of the file is reached (read() returns -1), at which point the loop terminates.
//			System.out.print((char)n);//Inside the loop, each character read from the file is converted to a char and printed to the console using System.out.print().
//		r.close();// Closes the Reader object r to release system resources after reading from the file is completed.
*/
