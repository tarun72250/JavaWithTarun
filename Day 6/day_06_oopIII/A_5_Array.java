package day_06_oopIII;

import java.util.Scanner;

public class A_5_Array {
	
	public static void main(String[]arsg)
	{
		int a []=new int[5];
		a[0]=20;
		a[1]=30;
		a[2]=40;
		a[3]=50;
		a[4]=60;
		
		for (int i=0;i<a.length;i++)
			System.out.println("value of index are:"+a[i]);
		
		//For maximum value found 
		int max=a[0];
		for (int i=0;i<a.length;i++)
		{	
			if(max<a[i])
				max=a[i];
		}
		System.out.println("Maximum value:"+max);
		
		//For minimum value found
		int min=a[0];
		for (int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Minimum value:"+min);
		
		//For average found 
		int avg=0;
		int sum=0;
		for (int i=0;i<a.length;i++)
		{
			sum=a[i]+sum;// 20 30 40 50 60 =200
			avg=sum/a.length;
			//  200/5=40	
		}
		System.out.println("Average is :"+avg);

	}

	/*public static void min(int[] arr)
	{
		
	//int[] arr={2,4,6,8,10};
	int min=arr[0];
	
	for(int i=0;i<5;i++)
		{
		if(arr[i]<min)
		  min=arr[i];
		}
		System.out.println("Minimum value is:"+min);
	}
	

	public static void max(int []arr)
	{
	int max=arr[0];
	for(int i=0;i<5;i++)
		{
		if(arr[i]>max);
		max=arr[i];
		}
	System.out.println("Maximum value is:"+max);
	}
	
	public static void average(int[] arr)
	{
	double avg=0;
	int sum=0;
	for(int i=0;i<5;i++)
	{
	
	sum+=arr[i];
	}
	avg=sum/5;
	System.out.println("Average is:"+avg);
	}
	
	public static void main(String args[])
	{
	Scanner ob=new Scanner(System.in);
	int[]arr=new int[5];
	System.out.println("Enter value of array");
	for(int i=0;i<5;i++)
	{
		arr[i]=ob.nextInt();
		
	}
	//in same class we cannot use class name as well.
	min(arr);
	max(arr);
	average(arr);
	}*/
}
