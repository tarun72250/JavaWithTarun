package day_03_C_conditionalStatments;

import java.util.Scanner;

public class A_07_AcceptInputFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value :");
		int n = sc.nextInt();
		System.out.println("int value :"+n);
		
		System.out.println("Enter String value :");
		String str = sc.next();
		System.out.println("String value :"+str);
		
		System.out.println("Enter boolean value :");
		boolean bool = sc.nextBoolean();
		System.out.println("Boolean value :"+bool);

		System.out.println("Enter float value :");
		float fvar = sc.nextFloat();
		System.out.println("float value :"+fvar);

		System.out.println("Enter double value :");
		double dvar = sc.nextDouble();
		System.out.println("double value :"+dvar);
	}
}
