package day_13_interfaceAssignment.demos;

import java.util.Scanner;
import day_13_interfaceAssignment.entities.A_05_StringOperationsImpl;
import day_13_interfaceAssignment.utils.A_05_StringOperations;

public class A_05_StringOperationsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        A_05_StringOperations stringOps = new A_05_StringOperationsImpl();
        boolean exit = false;

        while (!exit) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Get Length of String");
            System.out.println("4. Check if Palindrome");
            System.out.println("5. Append Strings");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a string to reverse: ");
                    String reverseString = scanner.nextLine();
                    stringOps.reverse(reverseString);
                    break;
                case 2:
                    System.out.print("Enter a string to convert to uppercase: ");
                    String upperCaseString = scanner.nextLine();
                    stringOps.toUpperCase(upperCaseString);
                    break;
                case 3:
                    System.out.print("Enter a string to get its length: ");
                    String lengthString = scanner.nextLine();
                    int length = stringOps.length(lengthString);
                    System.out.println("Length of the string: " + length);
                    break;
                case 4:
                    System.out.print("Enter a string to check if it's a palindrome: ");
                    String palindromeString = scanner.nextLine();
                    boolean isPalindrome = stringOps.isPalindrome(palindromeString);
                    System.out.println("Is palindrome: " + isPalindrome);
                    break;
                case 5:
                    System.out.print("Enter the first string to append: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string to append: ");
                    String str2 = scanner.nextLine();
                    stringOps.append(str1, str2);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Exiting program.");
        scanner.close();
    }
}
