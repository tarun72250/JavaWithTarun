package day_07_stringsDemo;


//Wap to to remove all white spaces from gives String.
//Input :     j  a  va  s  ta  r   
//Output : javastar 
public class B_03_RemoveAllWhieSpaces {

	public static void main(String[] args) {
	
		String str ="    s u    mi    t  r Gh    u w  an  sh  hi   ";
		
//		String newStr = str.trim();
//		System.out.println(newStr);
			
		String newStr = str.replaceAll("\\s", "");
		System.out.println(newStr);
		
	}

}
/*
String str ="    j  a  va  s  ta  r   ";
		
		String newStr = str.trim();//these will remove only side spaces  what about inner spaces in given String 
		System.out.println(newStr);
		
		String str1 = str.replaceAll("\\s", "");
		System.out.print(str1);
*/