package day_16_javaFileIOAssignment;

import java.io.File;
import java.util.Date;
//This code checks if the directory f1 exists. If so, it lists the contents of the directory, printing the names of all files and subdirectories within it.
public class A_03_UsingFileClass {
	public static void main(String[] args)
	{
		
		/*File f = new File("D:\\Java IO DebugShala");
		System.out.println("Exists :"+f.exists());
		System.out.println("Directory :"+f.isDirectory());
		System.out.println("is file : "+f.isFile());
		System.out.println("readable : "+f.canRead());
		System.out.println("executable : "+f.canExecute());
		System.out.println("Size : "+f.length());
		Date d = new Date(f.lastModified());
		System.out.println("Last modified :"+d);
		
		*/
		
		File f = new File("D:\\Java IO DebugShala");
		if(f.isDirectory())
		{
			System.out.println("Directory Contents :");
			File [] file = f.listFiles();
			
			for(File f1 :file)
			{
				if(f1.isDirectory())
				{
					File [] f2 = f1.listFiles();
					for(File files :f2)
					{
						System.out.println("...."+files.getName());
					}
				}
				else if(f1.isFile())
				{
					System.out.println(f1.getName());
				}
			}
			
		}
		
	}
}


/*
String fname = args[0];
		File f= new File(fname);
		
		//or 
		//File f= new File("D:/Java IOProject Programs");
		System.out.println("Exists : "+f.exists());
		System.out.println("is directory : "+f.isDirectory());
		System.out.println("is file : "+f.isFile());
		System.out.println("readable : "+f.canRead());
		System.out.println("executable : "+f.canExecute());
		System.out.println("Size : "+f.length());
		Date d = new Date(f.lastModified());
		System.out.println("last modified time : "+d);
		
		//For seen the content in this directory
		File f1 = new File("D:/Java IOProject Programs");
		if(f1.isDirectory())
		{
			System.out.println("Directory contents : ");
			File [] files = f1.listFiles();
			for( File file : files )
			{
				if(file.isDirectory())
				{
					File [] files1 = file.listFiles();
					for( File file1 : files1  )
					{
						System.out.println("....."+file1.getName());
					}
				}
				else if(file.isFile())
					System.out.println(file.getName());
			}
				
		}

*/