package day_06_oopIII;

import java.util.Scanner;

public class ArrayClass4 {

	public static void main(String[] args) {
	
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//		    arr[i] = (int)(Math.random()*10);
//		}
//		
//	
//		for(int i=0; i<arr.length; i++)
//		{
//		    System.out.println(arr[i]);	
//		}
		
		//declartion of array
		/*int [] arr;
		arr = new int[5];//initilization 
				
		Scanner sc = new Scanner(System.in);//for taking input from user 
		
		//for dumpvalue in each index in array
		for(int i=0;i<arr.length;i++)	  
		{
		    System.out.println("Enter the value : ");
		    arr[i] = sc.nextInt();
		}
		
		
		// for retrieve value from each index in array
	        System.out.println("Array elements : ");
	        for(int i=0;i<arr.length;i++)
		{
		    System.out.println(arr[i]);	
		} 
	        
	     */   
		
		Account [] acc_arr;
		acc_arr = new Account[3];   //array of accounts   initialize the array of size 
		acc_arr[0] = new Account();    //creating one element ,default constructor
		acc_arr[1] = new Account(); 
		acc_arr[2] = new Account(); 
		
		for(int i=0;i<acc_arr.length;i++)
			acc_arr[i].calBalance();
		
	
		//short way for cerating array
		int [] arr = {23, 45, 32, 11, 67};
		 for(int i=0;i<arr.length;i++)
			{
			    System.out.println(arr[i]);	
			} 
		 
		 
		 
		Date [] datearr = {
				new Date(), 
				new Date(11,11,1999), 
				new Date(13,12,2000)
							};
		
		for(int i=0;i<datearr.length;i++)
		{
		    //System.out.println(datearr[i].isLeapYear());	
		} 
		
		

	}

}
