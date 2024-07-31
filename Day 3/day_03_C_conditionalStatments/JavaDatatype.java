package day_03_C_conditionalStatments;

public class JavaDatatype {

	public static void main(String[] args) {
	
		/*
		 Java Data Types
		As explained in the previous chapter, a variable in Java must be a specified data type:
		Example
		 */
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		
		/*
		Data types are divided into two groups:
		Primitive data types - includes byte, short, int, long, float, double, boolean and char
		Non-primitive data types - such as String, Arrays and Classes (you will learn more about
		 these in a later chapter)
		 */
		/*
		Byte
		The byte data type can store whole numbers from -128 to 127. This can be used 
		instead of int or other integer types 
		to save memory when you are certain that the value will be within -128 and 127:
		 */
		byte myNum1 = 100;
		System.out.println(myNum1);
		//Short
		//The short data type can store whole numbers from -32768 to 32767:
		short myNum2 = 5000;
		System.out.println(myNum2);
		/*
		 Int
		The int data type can store whole numbers from -2147483648 to 2147483647. In general,
		int data type is the preferred data type when we create variables with a numeric value.
		 */
		int myNum3 = 100000;
		System.out.println(myNum3);
		/*Long
		The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
		This is used when int is not large enough to store the value. Note that you should 
		end the value with an "L":
		Example*/
		long myNum4 = 15000000000L;
		System.out.println(myNum4);
		/*
		 The float and double data types can store fractional numbers. Note that you should end the
		  value with an "f" for floats and "d" for doubles:
		 */
		float myNum5 = 5.75f;
		System.out.println("floating value :-  "+myNum5);
		double myNum6 = 19.99d;
		System.out.println("double value:-  "+myNum6);
		
		/*
		 Use float or double?
		 The precision of a floating point value indicates how many digits the value can have 
		 after the decimal point. The precision of float is only six or seven decimal digits,
		 while double variables have a precision of about 15 digits. Therefore it is safer to
		 use double for most calculations.
		 */
		
		float f1 = 35e3f;
		double d1 = 12E4d;
		System.out.println(f1);
		System.out.println(d1);
		
		/*
		 Very often in programming, you will need a data type that can only have one of two values, like:
		YES / NO
		ON / OFF
		TRUE / FALSE
		For this, Java has a boolean data type, which can only take the values true or false:
		 */
		boolean isJavaFun = true;
		boolean isFishTasty = false;
		System.out.println(isJavaFun);     // Outputs true
		System.out.println(isFishTasty);   // Outputs false
		
		/*
		 Characters
		 The char data type is used to store a single character. The character must be surrounded
		  by single quotes, like 'A' or 'c':
		 */
		char myGrade = 'B';
		System.out.println(myGrade);
		//Alternatively, if you are familiar with ASCII values, you can 
		//use those to display certain characters:
		char myVar10 = 65, myVar20 = 66, myVar30 = 67;
		System.out.println(myVar10);
		System.out.println(myVar20);
		System.out.println(myVar30);
		
		//The String data type is used to store a sequence of characters (text).
		//String values must be surrounded by double quotes:
		String greeting = "Hello Manas";
		System.out.println(greeting);
	}

}
