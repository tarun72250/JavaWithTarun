package day_01_debugShala;

public class A_02_Datatypes {

	public static void main(String[] args)
	{
		
		
		
		
		/*
		 Java Variables
		Variables are containers for storing data values.
		Create a variable called name of type String and assign it the value "John":
		*/
		
		String name = "John";
		System.out.println(name);
		
		//Create a variable called myNum of type int and assign it the value 15:
		int myNum = 15; // Java is case sensitive because myNum or mynum both are different.
		System.out.println(myNum);
			
		int sourabh;//declaration
		sourabh = 10;
		System.out.println("old sourabh value :"+sourabh);
		
		sourabh =15;
		System.out.println("new sourabh value :"+sourabh);
		
		
		/*
		 Final Variables
		 If you don't want others (or yourself) to overwrite existing values, 
		 use the final keyword (this will declare the variable as "final" or "constant",
		 which means unchangeable and read-only):
		 */
		final int sumit1 =9;
		//sumit1 = 8;  // will generate an error: cannot assign a value to a final variable
		
		/*
		 Other Types
		 A demonstration of how to declare variables of other types:
		 */
		int sourabh1 = 5;
		float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		System.out.println(sourabh1+":"+myFloatNum+":"+myLetter+":"+myBool+":"+myText);
		
		/* String concatenations.
		Display Variables
		The println() method is often used to display variables.
		To combine both text and a variable, use the + character:
		 */
		String msg = "Suraj";
		System.out.println("Hello " + msg);   // Hello Suraj
		
		//You can also use the + character to add a variable to another variable:
		String firstName = "Sourabh ";
		String middleName = "Kumar ";
		String lastName = "Rajput ";
		String fullName = (firstName + middleName + lastName) ;
		System.out.println(fullName);//Sourabh Kumar Rajput 
		
		//For numeric values, the + character works as a mathematical 
		//operator (notice that we use int (integer) variables here):
		int x = 5;
		int y = 6;
		System.out.println((y+x)); // Print the value of x + y
		
		/*
		Declare Many Variables
		To declare more than one variable of the same type, you can use a comma-separated list:
		ExampleGet your own Java Server
		Instead of writing:
		 */
		int x1 = 5;
		int y1 = 6;
		int z1 = 50;
		System.out.println(x1 + y1 + z1);
		int a , b , c;


		//You can simply write:
		int x2 = 5, y2 = 6 , z2 = 50 ;
		System.out.println(x2 + y2 + z2);
				
		//You can simply write:
		int x3, y3, z3;
		x3 = y3 = z3 = 50;
		System.out.println(x3 + y3 + z3);

		/*
		Identifiers
		All Java variables must be identified with unique names.
		These unique names are called identifiers.
		Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).
		Note: It is recommended to use descriptive names in order to create understandable and maintainable code:
		 */
		// Good
		int minutesPerHour = 60; //camelCasing 

		// OK, but not so easy to understand what m actually is
		int m = 60;

		//Names are case sensitive ("myVar" and "myvar" are different variables) example
		String name5 = "manas";
		String Name5 = "Sumit"; // this will be differ from above expression
		
		/*
		The general rules for naming variables are:
			Names can contain letters, digits, underscores, and dollar signs
			Names must begin with a letter
			Names should start with a lowercase letter and it cannot contain whitespace(packages , variables ,methods)
			Names can also begin with $
			Names are case sensitive ("myVar" and "myvar" are different variables)
			Reserved words (like Java keywords, such as int or boolean) cannot be used as names
		 */
	}
}
