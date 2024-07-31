package day_03_C_COndtionalQuestions;
/*
 2.Write a Java program that reads an integer representing a person's age and prints out their age category:

"Child" if age is between 0 and 12 (inclusive).
"Teenager" if age is between 13 and 19 (inclusive).
"Adult" if age is between 20 and 64 (inclusive).
"Senior" if age is 65 or older.
"Invalid age" if the age is negative.

 */
public class A_02_PersonAge {
	
	public static void main(String[] args) {
		
		int age =11010;
		
		if(age >= 0 && age <=12)
		{
			System.out.println("Child");
		}
		else if(age >=13 && age <= 19)
		{
			System.out.println("Teenager");
		}
		else if(age >-20 && age <= 64)
		{
			System.out.println("Adult");
		}
		else if(age >=80)
		{
			System.out.println("Senior");
		}
		else 
		{
			System.out.println("Invalid age...!");
		}
		
	}

}
