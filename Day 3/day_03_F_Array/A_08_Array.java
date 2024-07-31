package day_03_F_Array;


//Write a program to sort the given array using Bubble Sort
public class A_08_Array 
{
	
	public static void bubbleSort(int [] array)
	{			//0			//5
		for (int i = 0 ; i < array.length-1 ; i++ )//2  
		{		//0         //4
			for(int j = 0 ; j<array.length-i-1 ; j++)//0<2
			{
				if(array[j] > array[j+1])//1>7
				{
					//swaping elements if they afre wrong order
					int temp = array[j];//
					array[j] = array[j+1];//1
					array[j+1] = temp;//5
				}
			}
		}
	}

	public static void main(String[] args) 
	{				
					 
		int array[] = {5,2,7,1,9,3};
		
		//Sortiing the array use bubble sort techniques
		bubbleSort(array);
		
		//printing the array
		System.out.println("Print the array :-");
		for(int n :array)
		{
			System.out.print(n+" ");
		}
		
	}

}
