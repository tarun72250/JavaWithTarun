package day_06_oopIII;

import java.util.Scanner;

public class A_11_BoxDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height size:");
		int height = sc.nextInt();
		System.out.println("Enter weidth size:");
		int weidth = sc.nextInt();
		System.out.println("Enter depth size:");
		int depth = sc.nextInt();
		
		A_11_Box box = new A_11_Box();
		int b =box.calVolume();
		A_11_Box box1 = new A_11_Box(height,weidth,depth); //initialized of Box array
		int b1 =box1.calVolume();
		
		if(b > b1)
			System.out.println("Default box volume value is greater");
		else
			System.out.println("Parametrized box volume value is greater");
			
	}

}
