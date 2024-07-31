package day_13_interfaceAssignment.entities;

import day_13_interfaceAssignment.utils.A_05_StringOperations;

public class A_05_StringOperationsImpl implements A_05_StringOperations{

	//Logic for reverse a String
	@Override
    public void reverse(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        System.out.println("Reversed String: " + reversed.toString());
    }

	
	
	//Logic for UpperCase a String
    @Override
    public void toUpperCase(String str) {
        StringBuilder upperCase = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                upperCase.append((char) (ch - 32));
            } else {
                upperCase.append(ch);
            }
        }
        System.out.println("Uppercase String: " + upperCase.toString());
    }


	//Logic for Find a length of String
    @Override
    public int length(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        System.out.println("Length of String: " + length);
        return length;
    }


	//Logic for Cshecking a String is Pallindrome or not
    @Override
    public boolean isPalindrome(String str) {
        int n = str.length();
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                System.out.println("Is Palindrome: false");
                return false;
            }
        }
        System.out.println("Is Palindrome: true");
        return true;
    }


	//Logic for Appending one String to another String
    @Override
    public String append(String str1, String str2) {
        StringBuilder appended = new StringBuilder();
        appended.append(str1);
        for (int i = 0; i < str2.length(); i++) {
            appended.append(str2.charAt(i));
        }
        System.out.println("Appended String: " + appended.toString());
        return appended.toString();
    }
}
