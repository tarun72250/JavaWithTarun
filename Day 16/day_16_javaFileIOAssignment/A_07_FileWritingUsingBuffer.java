package day_16_javaFileIOAssignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
//7.Write a Java program that reads lines of text from the user and appends them to a specified file. 
//The program should continue reading input until the user types "stop". 

public class A_07_FileWritingUsingBuffer {
	
	public static void main(String[] args) throws Exception
	{
		File f = new File("D:\\Java IO DebugShala\\c.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f,true));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line ;
		System.out.println("Enter 'stop' to quit");
		while( !((line = br.readLine()).equals("stop")))
		{
			bw.write(line);
			bw.newLine();
		}
		System.out.println("Writting in file completed successfully");
		bw.flush();
		bw.close();  //automatically flushes
		br.close();
	}
}
