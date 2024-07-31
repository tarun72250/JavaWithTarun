package day_16_javaFileIOAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//This Java program reads lines of input from the user until the user enters "stop", and then it prints longest line entered.
public class A_02_AcceptLines {

	public static void main(String[] args) {
		
		BufferedReader br =null;
		try 
		{
			//1.open the stream
			//This line creates new BufferedReader object, which reads standard input stream (System.in). It's wrapped in InputStreamReader to convert bytes into characters.
			br = new BufferedReader( new InputStreamReader(System.in));
			
			String line;
			System.out.println("Enter 'stop' to quit");
			
			int max =0;//5 7
			String maxLine ="";//tarun rathore
			//2.uses the streams
			while(!(line = br.readLine()).equals("stop"))
			{
				System.out.println(line);
				if(max < line.length())
				{
					max = line.length();
					maxLine = line; 
				}
			}
			System.out.println("Longest String :"+maxLine);
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try {
				br.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}

/*
//BufferedReader will be used to read input from the user.
		BufferedReader br=null;
		try 
		{
			//This line creates new BufferedReader object, which reads standard input stream (System.in). It's wrapped in InputStreamReader to convert bytes into characters.
			br = new BufferedReader(new InputStreamReader(System.in));
			String line ;
			System.out.println("Enter 'stop' to quit");
			
			int max =0;
			String maxLine ="";
			//This loop reads lines of input from user until user enters "stop". Each line read using br.readLine() and stored in variable line.
			while(!((line = br.readLine()).equals("stop")))
			{
				System.out.println(line);
				//code checks if length of current line gt the length of the longest line seen so far (max). If it is, it updates max and stores the line in maxLine.
				if(max < line.length())
				{
					max = line.length();
					maxLine = line;
				}
			}
			//After the loop exits (when the user enters "stop"), the longest line entered (maxLine) is printed.
			System.out.println(maxLine);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				br.close();
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
*/