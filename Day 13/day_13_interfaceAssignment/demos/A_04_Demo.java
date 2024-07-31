package day_13_interfaceAssignment.demos;

import java.util.Arrays;
import java.util.Scanner;

import day_13_interfaceAssignment.entities.A_04_MeritComparer;
import day_13_interfaceAssignment.entities.A_04_NameComparer;
import day_13_interfaceAssignment.entities.A_04_RollComparer;
import day_13_interfaceAssignment.entities.A_04_Student;
import day_13_interfaceAssignment.utils.A_04_Comparer;

public class A_04_Demo {
	public static void main(String[] args) {
		 A_04_Student[] students = {
		            new A_04_Student(3, "Alice", 85.5),
		            new A_04_Student(1, "Bob", 90.2),
		            new A_04_Student(2, "Charlie", 88.9)
		        };

		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Choose sorting criteria:");
		        System.out.println("1. Roll Number");
		        System.out.println("2. Name");
		        System.out.println("3. Marks");
		        System.out.print("Enter your choice (1-3): ");
		        int choice = scanner.nextInt();
		        A_04_Comparer comparer;

		        switch (choice) {
		            case 1:
		                comparer = new A_04_RollComparer();
		                break;
		            case 2:
		                comparer = new A_04_NameComparer();
		                break;
		            case 3:
		                comparer = new A_04_MeritComparer();
		                break;
		            default:
		                System.out.println("Invalid choice.");
		                return;
		        }

		        sortStudents(students, comparer);
		        System.out.println("Sorted students:");
		        for (A_04_Student student : students) {
		            System.out.println(student);
		        }

		        scanner.close();
		    }

		    public static void sortStudents(A_04_Student[] students, A_04_Comparer comparer) {
		        Arrays.sort(students, (s1, s2) -> comparer.compare(s1, s2));
		    	}
}
