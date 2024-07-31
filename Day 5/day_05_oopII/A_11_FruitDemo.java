package day_05_oopII;

import java.util.Scanner;

public class A_11_FruitDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the fruit name:");
		String fruit = sc.next();
		System.out.println("Enter weather the fruit is sedded or not:");
		boolean seeded = sc.nextBoolean();
		System.out.println("Enter the Vitamin contained:");
		char vitamin = sc.next().charAt(0);
		A_11_Fruit f = new A_11_Fruit(fruit,seeded,vitamin);
		f.messages();

	}

}
