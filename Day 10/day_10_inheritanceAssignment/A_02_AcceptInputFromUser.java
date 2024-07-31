package day_10_inheritanceAssignment;

import java.util.Scanner;

public class A_02_AcceptInputFromUser {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
//	System.out.println("Enter integer value :");
//	int n = sc.nextInt();
//	
//	System.out.println("Enter String value :");
//	String var = sc.next();
//	
//	System.out.println("Enter Floating Value :");
//	float fvar = sc.nextFloat();
//	
//	System.out.println("Enter Boolean value :");
//	boolean bvar = sc.nextBoolean();
//	
//	System.out.println(n +" : "+var+" : "+fvar+" : "+bvar);
	
	System.out.println("Enter Name");
	String name = sc.next();
	
	System.out.println("Enter age :");
	int age = sc.nextInt();
	
	A_01_Person p = new A_01_Person(name,age);
	p.display();
	
	
	
	
	
	sc.close();
	
		
	}

}

/*
Scanner sc ; // refrence variable 
	sc = new Scanner(System.in);
	
	System.out.println("Enter integer value :");
	int num = sc.nextInt();
	
	System.out.println("Enter Float value :");
	float floatNum = sc.nextFloat();
	
	System.out.println("Enter Boolean value :");
	boolean booleanValue = sc.nextBoolean();
	System.out.println("Enter String value :");
	String str = sc.next();
	
	System.out.println("Integer Value :"+num);

	System.out.println("Float Value :"+floatNum);

	System.out.println("Boolean Value :"+booleanValue);

	System.out.println("String Value :"+str);
	
	System.out.println("Enter 1 no :");
	int x = sc.nextInt();
	System.out.println("Enter 2 no :");
	int y = sc.nextInt();
	
	
	A_05_Point p = new A_05_Point(x,y);
	System.out.println(p.toString());
		
		
		
 */