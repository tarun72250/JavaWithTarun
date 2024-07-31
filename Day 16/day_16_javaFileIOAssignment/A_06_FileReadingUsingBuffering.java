package day_16_javaFileIOAssignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//6.Develop a Java program that reads the content of a text file using BufferedReader,
//prints each line with a line number, and identifies the longest line in the file, 
//along with its line number.
public class A_06_FileReadingUsingBuffering {
	
	public static void main(String[] args) {
		BufferedReader br = null;
		try
		{
			br = new BufferedReader(new FileReader("D:\\Java IO DebugShala\\c.txt"));
			
			String line ;
			String maxLine="";
			int max =0;
			int count =0;
			int maxLineNo=0;
			
			while((line = br.readLine()) != null)
			{
				if(max < line.length())
					{
						max = line.length();
						maxLine = line;
						maxLineNo=count;
					}
				System.out.println(count+". "+line);
				count++;	
			}
			System.out.println("Result :- "+maxLineNo+". "+maxLine);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}

/*
br = new BufferedReader(new FileReader("D:\\Java IOProject Programs\\FileOutputStream.txt"));
			String line;
			int count=1;
			int max=0;
			int maxLineNo=0;
			String maxLine="";
			while((line = br.readLine()) != null)
			{
				if(max<line.length())
				{
					max=line.length();
					maxLine=line;
					maxLineNo=count;
							
				}
				System.out.println(count+". "+line);
				count++;				
			}
 */
//Buffer :- Reserved memory area
//read /write operation time will be reduced , so performance increases.
//read data from a memory area is known as buffer.


//Buffer Stream classes

//BufferedInputStream 
//BufferedOutputStream 
//BufferedReader
//BufferedWritter