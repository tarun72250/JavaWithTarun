package day_07_stringsDemo;

public class B_01_ReverseWordsCode {

	public static void main(String[] args) {

		 String s[] = "Learning Java In Debugshala".split(" ");
		 String ans = "";
		 for (int i = s.length - 1; i >= 0; i--) 
		 	  {
		       ans += s[i] + " ";
		      }
		         
		  System.out.println(
		  ans.substring(0, ans.length() - 1));
	}

}
