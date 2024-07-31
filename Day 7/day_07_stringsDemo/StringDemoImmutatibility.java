package day_07_stringsDemo;

public class StringDemoImmutatibility {

	public static void main(String[] args) {

		String str = new String("Welcome");
		str.concat("Java");
		
		System.out.println(str);
		
		
		String s = str.concat(" Java");
		System.out.println(s);
		
	}

}
