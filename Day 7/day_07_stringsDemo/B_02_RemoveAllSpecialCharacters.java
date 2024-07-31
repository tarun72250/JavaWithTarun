package day_07_stringsDemo;
//Wap to remove all special characters from given String
//Input : $ja!va$st%ar
//Output :javastar


public class B_02_RemoveAllSpecialCharacters {

	public static void main(String[] args) {
		
		String str ="@Su^mi&t!";
		String newStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(newStr);
			
	}
}


/*
String str = "$ja!va$st%ar";
		
		//Approach 1.
		String plainStr = str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(plainStr);
		
		//Appraoch 2.

*/
