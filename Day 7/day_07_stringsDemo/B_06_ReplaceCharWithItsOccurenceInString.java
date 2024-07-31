package day_07_stringsDemo;

import java.util.Arrays;

//Wap to replace char with its occurence in String
//Input : opentext
//Output : open1ex2

public class B_06_ReplaceCharWithItsOccurenceInString 
{
	public static void main(String[] args) 
	{
		String input = "opentext";
		//expected output : open1ex2
		char charToReplace = 't';
		
		//check char is present in String or not 
		if(input.indexOf(charToReplace)== -1)
		{
			System.out.println("Given Character is not available in Input String....!");
			System.exit(0);//stop executing further logic
		}
		
		//logic to replace char occurence in String 
		char [] ch = input.toCharArray();
		int cnt =1;
		for(int i=0 ; i<ch.length;i++)//o p e n t e x t 
		{
			if(ch[i] == charToReplace)//o==t p==t e==t n==t t==t e==t x==t t==t
			{
				ch[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(Arrays.toString(ch));
	}
}







/*
String input = "opentext tarun rathore";
		char charToReplace = 't';
		//expected output : open1ex2
		
		//check char is present in string or not 
		if(input.indexOf(charToReplace)==-1)
		{
			System.out.println("Given Character not available in Input String.....");
			System.exit(0);
		}
		
		//logic to replace char occurence in String
		char []  arr = input.toCharArray();// o p e n 1 e x 2 
		int cnt = 1;
		for(int i=0 ; i<arr.length ; i++)
		{
			if(arr[i]==charToReplace)//o==t p==t e==t n==t t==t 
			{
				//arr[i]=cnt;
				arr[i] = String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(arr));

*/