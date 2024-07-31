package day_07_stringsDemo;


//Wap to reverse a String 
//4 different way to reverse a String
//Input : Hello
//Output : olleH

//1. Using toCharArray() method
//2. Using charAt(int index) method
//3. Using java.lang.StringBuffer class provided reverse() method
//4. Using java.lang.StringBuilder class provided reverse() method
public class B_01_ReversedStringDemo {

	public static void main(String[] args) {
		
		String str = "Hello";
		//Appraoch 1.
		char [] ch =str.toCharArray();
//		ch[0]= 'H';
//		ch[1] = 'e';
//		ch[2]= 'l';
//		ch[3] = 'l';
//		ch[4]= 'o';
		for(int i = ch.length-1 ; i >=0  ; i--)
		{
			System.out.print(ch[i]);
		}
		
		
		System.out.println();
		//Apraoch 2.
		for(int i = str.length()-1; i >= 0; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		//Approach 3.
		StringBuffer sbuffer = new StringBuffer(str);
		System.out.print(sbuffer.reverse());
		
		
		System.out.println();
		//Approach 4.
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.print(sbuilder.reverse());
	}
}

/*
int length = str.length();
		
		//Approach 1.
		char [] ch = str.toCharArray();
		
		for(int i =ch.length-1 ; i>=0 ; i--)
		{
			System.out.print(ch[i]);
		}
		
		System.out.println();
		//Approach 2.
		for(int i=str.length()-1 ; i>=0 ; i--)
		{
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		//Approach 3.
		StringBuffer sbuffer = new StringBuffer(str);
		System.out.print(sbuffer.reverse());
		
		System.out.println();
		//Approach 4.
		StringBuilder sbuilder = new StringBuilder(str);
		System.out.print(sbuilder.reverse());
		
 */