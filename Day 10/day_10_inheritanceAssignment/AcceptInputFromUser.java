package day_10_inheritanceAssignment;

import java.util.Scanner;

import day_06_oopIII.Date;

public class AcceptInputFromUser {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Accept integer value :");
//		int no = sc.nextInt();
//		System.out.println("Integer value :"+no);
		
//		System.out.println("Accept String value :");
//		String msg = sc.next();
//		System.out.println("String value :"+msg);
//		
//		System.out.println("Accept Floating value :");
//		float fl = sc.nextFloat();
//		System.out.println("String value :"+fl);
		
		System.out.println("Accept integer value :");
		int dd = sc.nextInt();
		int mm = sc.nextInt();
		int yy = sc.nextInt();
		
		Date d = new Date(dd,mm,yy);
		d.showDate();
		
	}

}
