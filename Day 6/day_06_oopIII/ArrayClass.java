package day_06_oopIII;

import java.util.Scanner;

public class ArrayClass {
	
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);

//		System.out.println("Enter The size of array");
//		int n = sc.nextInt();
//		//Declaration 
//		int [] arr;
//		int[] arr1;
//		int []arr2;
//		int arr3 [];
//		int [] a, b;//b is considered as variable
		
		//Initilization
//		arr = new int [n];//size specify at time of initilization
		
		
		//Instiatation 
		//1 way
//		arr[0]=2; // arr[index]=value;
//		arr[1]=3; // arr[index]=value;
//		arr[2]=4; // arr[index]=value;
//		arr[3]=6;
//		arr[4]=5;
		//arr[5]=9; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		
	
		//to provide the element in array
//		System.out.println("Enter the "+(n-1)+"  values in array");
//		for(int i=0 ; i<arr.length;i++)
//		{
//			arr[i]=sc.nextInt();
//		}
//		
//		//Access the array using for loop
//		for(int i=0 ; i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
		
		
		//short way of array declARATION
		int manas [] = {1,2,3,4,5};//
//		//Access the array using for loop
		int sum=0;//15
				for(int i=0 ; i<manas.length;i++)
				{
					sum = sum+manas[i];
				}
		System.out.println("sum :"+sum);		
//		
//		
//		int arr[]= {1,2,3,4,5};
//		int sum1=0;
//		int avg=0;
//		for(int i=0 ; i<arr.length;i++)
//		{
//			sum1 = sum1+arr[i];
//			avg = sum1 / arr.length;	
//		}
//		System.out.println("avg :"+avg);		
//
//		
//		int arr2[]= {1,2,3,4};
//		int mul=1;
//		for(int i=0; i<arr2.length;i++)
//		{
//			mul = mul * arr2[i];
//		}
//		System.out.println("multi :"+mul);
//		
		
		
		int ishan [] = {22,88,55,11,33};
		
		int min = ishan[0];
		for(int i =1 ; i<ishan.length ; i++)
		{
			if(min > ishan[i])//22<11
			{
				min = ishan[i];
			}
		}
		System.out.println("Min :"+min);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		//Declaration of array 
		int [] arr ;
		//Array creation on heap on size 5		
		
		//initialization with 5 size of array
		arr= new int [5];
		
		System.out.println("Enter 5 array elements ");
		for(int i=0; i<arr.length ; i++)
		{
			arr[i] =sc.nextInt();
		}
		
		System.out.println("\n Array elements");
		//for accessing the element of array
				for(int i=0 ; i<arr.length ; i++)
				{
					System.out.println(arr[i]);
				}
			/*
				System.out.println("\n Array elements");
				//print in same line
				for(int i=0 ; i<arr.length ; i++)
				{
					System.out.print(arr[i]+" , ");
				}
				
				System.out.println("\n Array elements");
				//short way of declaring the array 
				int [] arr1 = {12,23,34,4,5,6};
				for(int i=0 ; i<arr1.length ; i++)
				{
					System.out.println(arr1[i]);
				}
		
				
				
				int [] a = {12,23,14,34,26,34};
				
				int max =a[0];
				for(int i=0; i<a.length ; i++)
				{
					if(max < a[i])
					{
						max = a[i];
					}
				}
				System.out.println("Max element: ");
		
		
		
		
		//if u want to print horizontly escape ln in .println method.
		int [] arr2 = {1,2,3,4,5,6};
		for(int i=0 ; i<arr2.length ; i++)
		{
			System.out.print(arr2[i]+" , ");
		}
		
		//if we want to sum of all array values
		int sum=0;
		for(int i=0 ; i<arr2.length ;i++) //0<=5  1<=5  2<=5  3<=5  4<=5  5<=5
		{
			sum = sum +arr2[i]; //0+1=1  1+2=3  3+3=6  6+4=10  10+5=15   15+6=21 
		}
		System.out.println("Sum :- "+sum);
		
		
		
		//we can also declare like this 
		for(int i=0 ; i<arr2.length ;i++) //0<=5  1<=5  2<=5  3<=5  4<=5  5<=5
		{
			sum += arr2[i]; //0+0=0  0+1=1  1+2=3  3+3=6  6+4=10  10+5=15   15+6=21 
		}
		System.out.println("Sum :- "+sum);
		
		//U can do multiply of all these nos.
		int mul=1;
		for(int i=0 ; i<arr2.length ;i++) //0<=5  1<=5  2<=5  3<=5  4<=5  5<=5
		{
			mul = mul * arr2[i]; //0+1=1  1+2=3  3+3=6  6+4=10  10+5=15   15+6=21 
		}
		System.out.println("Sum :- "+mul);
	
		//You can also declare array like this.
		int [] numbers = new int [] {2, 4, 6, 8, 10, 12,15,13,12,15};
		int max = numbers[0];
		//U can find max value in these elements
		for(int i=0 ; i<numbers.length;i++)
		{
			if(max < numbers[i])
			{
				max = numbers[i];
			}
		}
		System.out.println("Maximum :- "+max);
		//U can find min value in these elements
		//U can find average value in these 
		int sum=0;
		int avg=0;
		for( int i=0 ;i<numbers.length ;i++)
		{
			sum = sum + numbers[i]; 
			avg = sum / numbers.length;
		}
		System.out.println("Average:- "+avg);
		 
*/
		
//		System.out.println("\n 2d array ");
//		//if u want print 2d array or matrix print
//		int [][]matrix = {{1,2,3},{4,5,6},{1,2,3}};
//		for(int i=0 ; i<3 ; i++)
//		{
//			for(int j=0 ; j<matrix[i].length ; j++)
//			{
//				System.out.print(matrix[i][j]+" ");//00 01 02  10 11 12 
//			}
//			System.out.println();
//		}
//		
//		System.out.println("\n second 2d array ");
//		//if u want print 2d array or matrix print
//		int [][]matrix1 = {{1},{4,5},{1,2,3}};
//		for(int i=0 ; i<3 ; i++)
//		{
//			for(int j=0 ; j<matrix1[i].length ; j++)
//			{
//				System.out.print(matrix1[i][j]+" ");
//			}
//			System.out.println();
//		}
//		
//		
		
		
		
		
		/*
		//sum of all array elements
//		int sum=0;
//		for(int i=0 ; i<arr.length ; i++)
//		{
//			sum = sum+arr[i];
//			System.out.println(sum);
//		}
 
				
				//if i want to create date objects array
				Date [] datearr ;
				datearr = new Date[3];//array of 3 date object
				datearr[0]= new Date();//default cons
				datearr[1]= new Date(11,12,2024);//para cons
				datearr[2]= new Date(12,11,2022);//para cons
				for(int i=0 ; i<datearr.length ; i++)
				{
					datearr[i].showDate();
				}*/
	}

}
