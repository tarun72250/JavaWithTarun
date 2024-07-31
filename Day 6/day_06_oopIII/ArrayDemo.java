package day_06_oopIII;

public class ArrayDemo {
	
	public static void main(String[]args)
	{
		/*//declaration of array
		int [] arr;
		//initilization of array
		arr = new int[5]; 
		
		//for accesing the indexes 
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//#Instiatation:-
		arr [0] =1;  //arr[index]=value;
		arr [1] =2;  //arr[index]=value;
		arr [2] =3;  //arr[index]=value;
		arr [3] =4;  //arr[index]=value;
		arr [4] =5;  //arr[index]=value;

		//for accesing the indexes 
		for(int i=0 ; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		//#we can also declare and initilize both at same time

		int [] arr1 = {11,22,33,44,55};	//5 size array will be created and initialize
		//for accesing the indexes 
		for(int i=0 ; i<arr1.length; i++)
		{
			System.out.println(arr1[i]);
		}
		*/
		//2 D array
		//#Matrix:Array of Array,2d array:-
		//#Declartion:-
	     int [][] matrix;
	     //#Initilization:-
	     matrix = new int [3][3];//3 row 3 column
	     for(int i=0 ; i<3 ; i++)
			{
				for(int j=0 ; j<matrix[i].length ; j++)
				{
					System.out.print(matrix[i][j]+" ");
				}
				System.out.println();
			}
	     
	     //Instiation of array
	     matrix[0][0] = 1;
	     matrix[0][1] = 2;
	     matrix[0][2] = 3;
	     matrix[1][0] = 4;
	     matrix[1][1] = 5;
	     matrix[1][2] = 6;
	     matrix[2][0] = 7;
	     matrix[2][1] = 8;
	     matrix[2][2] = 9;
	     
	     
	     for(int i=0 ; i<matrix.length;i++)//0 1 2
	     {
	    	 for( int j=0 ; j<matrix[i].length ; j++)//00 01 02  |10 11 12 | 20 21 22
	    	 {
	    		 System.out.print(matrix[i][j]+" ");//00
	    	 }
	    	 System.out.println();
	     }
	    
		 
	     int [][] matrix1 = {{1,4},{5},{9,7}};
	     for(int i=0 ; i<3;i++)//0 1 2
	     {
	    	 for( int j=0 ; j<matrix1[i].length ; j++)//00 01 02  |10 11 12 | 20 21 22
	    	 {
	    		 System.out.print(matrix1[i][j]+" ");//00
	    	 }
	    	 System.out.println();
	     }
	     
	   
	}

}
/*
 for(int i=0 ; i<3 ; i++)
	     {
	    	 for(int j=0 ; j<matrix[i].length ; j++)
	    	 {
	    		 System.out.print(matrix[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
	     
	     //short way of 2d array declaration
	     int [][] matrix1 = {{1,2,3}, {4,5,6}};        //3cloumn 2rows
	     int [][] matrix2 = {{1,2,3}, {4}, {7}}; 
	     for(int i=0 ; i<3 ; i++)
	     {
	    	 for(int j=0 ; j<matrix2[i].length ; j++)
	    	 {
	    		 System.out.print(matrix2[i][j]+" ");
	    	 }
	    	 System.out.println();
	     }
	     
	   //if i want to create date objects array
	   //declaration
	     Date [] datearr;
	     datearr = new Date[3];//initialized of date array
	     datearr [0] = new Date();//deafult cons calling
	     datearr [1] = new Date(12,11,2024);//deafult cons calling
	     datearr [2] = new Date(11,11,2022);//deafult cons calling
		 for(int i=0 ; i<datearr.length ; i++)
		 {
			datearr[i].showDate();
		 }
		 
*/