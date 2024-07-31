package day_03_A_Datatypes;
 
public class DataTypeDemo {

	public static void main(String[]args)
	{
		
		System.out.println("Gautam Nikum");//String print " "
		System.out.println(1+2);//integer addition
		System.out.println("Learning "+1+" Java");//Concatenation String with integer value
		System.out.println("A"+" "+"B");//Concatenation String with space 		
		System.out.println(3+(2*3));
		
		//Single liner comments
		/*
		 Multiple liner comments
		 */
		
		/*
		Java Variables
		Variables are containers for storing data values.
		Create a variable called name of type String and assign it the value "John":
		*/
		
		
		//numeric value
		byte b = 1;//b is container of type byte
		System.out.println(b);
		
		short s = 2;//s is container of type short
		System.out.println(s);
		
		int n = 5;
		System.out.println(n+s);//7
		
		long l = 8;
		System.out.println(l+b);//9
		
		System.out.println(b+" "+s+" "+n+" "+l);//concatenation
		
		String str = "Gautam";
		str = "Nikum";
		System.out.println(str);//Nikum
		
		int gautam  =5;
		gautam = 8;//reassigned values
		System.out.println(gautam);//8
		
		float f = 2.4f;
		System.out.println(f);
		
		double d = 5.7;
		System.out.println(d);
		
		char c = 'a';
		System.out.println(c);
		
		boolean bvar = true;
		System.out.println(bvar);
		
		
	}
	
}
