package day_16_javaFileIOAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;

//1.This code reads characters from the standard input stream (System.in)means console using a BufferedReader
public class A_01_AcceptCharacter {
	
	public static void main(String[] args) 
	{
			
		
		BufferedReader br = null;
		try {
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 'q' to quit");
		
		
			int n ;
		
			while((n = br.read()) !='q' )
			{
				System.out.println((char)n);
			}
		
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
				
	}
}






/*
 
		//From getting input from console or temp memory in os 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//or
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(isr); 
		
		//BufferedReader class in Java that allows you to efficiently read text from character-input stream. It's particularly useful when you're reading text from a source like a file, a socket, or the console.thats y we use BufferedReader
			
		BufferedReader br = null;
		try {
			//1.open the stream
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to quit ...!");
			
			int n;
			
			while(( n = br.read()) !='q')
			{
				System.out.print((char)n);
			}
			
			
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				//3.close stream
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
 */


















