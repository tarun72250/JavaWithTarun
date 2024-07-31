package day_17_javaFileIO2Assignment;

import java.io.File;

public class A_03_DeleteParticularFile {

	public static void main(String[] args) {
		try {
			
			File file = new File("D:\\Java IO DebugShala\\A\\c.txt");
			file.delete();
			System.out.println("Deleted succesfully ...!");

		}
		catch(Exception e)
		{
			System.out.println("Some error :"+e);
		}
		
	}
}
