package day_10_inheritanceAssignment;

import java.util.Scanner;

public class RegCustomerDemo {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter type of customer (1 - Regular Customer, 2 - Customer):");
	        int type = scanner.nextInt();
	        scanner.nextLine(); // Consume newline character

	        System.out.println("Enter email address:");
	        String email = scanner.nextLine();

	        System.out.println("Enter address:");
	        String address = scanner.nextLine();

	        if (type == 1) 
	        {
	            // Regular Customer
	            System.out.println("Enter registration number:");
	            int regNo = scanner.nextInt();

	            System.out.println("Enter shopping price:");
	            double shoppingPrice = scanner.nextDouble();

	            // Create Regular Customer object
	            RegCustomer regCustomer = new RegCustomer(email, address, regNo);
	            regCustomer.giveDiscount(shoppingPrice);
	        } 
	        else if (type == 2) {
	            // Customer
	            System.out.println("Enter shopping price:");
	            double shoppingPrice = scanner.nextDouble();

	            // Create Customer object
	            Customer customer = new Customer(email, address);
	            customer.giveDiscount(shoppingPrice);
	        }
	        else 
	        {
	            System.out.println("Invalid customer type.");
	        }

	        scanner.close();

	}

}
