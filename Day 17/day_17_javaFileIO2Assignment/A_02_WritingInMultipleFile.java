package day_17_javaFileIO2Assignment;

import java.io.FileWriter;
//Write a code to write and create multiple files in java and write them
public class A_02_WritingInMultipleFile 
{

	public static void main(String[] args) 
	{
		try 
		{
				for(int i =0 ; i<5 ; i++)
				{
					String fileName = "D:\\Java IO DebugShala\\A\\doodle"+i+".txt";
					FileWriter writer = new FileWriter(fileName);
					writer.write("This is dummy data with file path of "+fileName);
					System.out.println(fileName+" Created....!");
					writer.close();
				}
		}
		catch(Exception e)
		{
			System.out.println("Some error : "+e);
		}
	}
}
