package day_17_javaFileIO2Assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class A_04_PersonDemoWrittingInFile {

	public static void main(String[] args) {
		
		A_04_Person []p;
		p = new A_04_Person[3];
		
		p[0]= new A_04_Person("Balkrishna",22,"Indore");
		p[1]=new A_04_Person();
		p[2]=new A_04_Person("Rajat",24,"Pune");
		
		String filePath ="D:\\Java IO DebugShala\\person info.txt";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath,true)))
		{
			for(int i=0 ; i<p.length;i++)
			{
				writer.write(p[i].toString()+System.lineSeparator());

			}
			System.out.println("Student info save to :-"+filePath);
			System.out.println("Printed succesfully...!");
		}
		catch(IOException e)
		{
			System.out.println("An error to be occured during writing the file"+e.getMessage());
		}
	}
}
