package day_02_debugShalaJava;

import java.util.Scanner;

public class Hello {
	
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//1 way to see the command line arguements
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		System.out.println(args[3]);
//		System.out.println(args[4]);
		
		
		//2 way to see the command line arguements
		for(int i=0 ;i<args.length ; i++)
		{
			System.out.println(args[i]);
		}
		

	}

}
