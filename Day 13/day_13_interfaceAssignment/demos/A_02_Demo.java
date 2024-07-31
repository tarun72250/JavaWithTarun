package day_13_interfaceAssignment.demos;

import java.util.Scanner;
import day_13_interfaceAssignment.entities.A_02_MyNumber;

public class A_02_Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        A_02_MyNumber myNumber = new A_02_MyNumber();
        int choice;
        
        do {
            System.out.println("Choose a method to call:");
            System.out.println("1. Check if the number is Odd");
            System.out.println("2. Check if the number is Even");
            System.out.println("3. Check if the number is Prime");
            System.out.println("4. Calculate Factorial");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5):");
            choice = scanner.nextInt();
            
            if (choice == 5)
            {
                break;
            }

            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            
            switch (choice) 
            {
                case 1:
                    System.out.println(num + " is Odd? " + myNumber.isOdd(num));
                    break;
                case 2:
                    System.out.println(num + " is Even? " + myNumber.isEven(num));
                    break;
                case 3:
                    System.out.println(num + " is Prime? " + myNumber.isPrime(num));
                    break;
                case 4:
                    System.out.println("Factorial of " + num + " is " + myNumber.calFactorial(num));
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        } while (choice != 5);
        
        System.out.println("Exiting program.");
        scanner.close();
    }
}
