package day_10_inheritanceAssignment;

import java.util.Scanner;

public class A_03_RegCustomerDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter type of address (1-RCus , 2-Cus)");
		int type = sc.nextInt();
		
		System.out.println("Enter email :");
		String email = sc.next();
		System.out.println("Enter address :");
		String address = sc.next();
		
		
		if(type == 1)
		{
			System.out.println("Enter Regno :");
			int regno= sc.nextInt();
			
			System.out.println("Enter Shopping Price :");
			double sprice= sc.nextDouble();
			
			A_03_RegCustomer rc = new A_03_RegCustomer(email,address,regno);
			rc.giveDiscount(sprice);
			
		}
		
		else if(type ==2)
		{
			
			System.out.println("Enter Shopping Price :");
			double sprice= sc.nextDouble();
			
			A_03Customer c = new A_03Customer(email,address);
			c.giveDiscount(type);
		}
		else
		{
			System.out.println("Invalid type");
		}

	}

}
/*
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
	            A_03_RegCustomer a_03_RegCustomer = new A_03_RegCustomer(email, address, regNo);
	            a_03_RegCustomer.giveDiscount(shoppingPrice);
	        } 
	        else if (type == 2) {
	            // Customer
	            System.out.println("Enter shopping price:");
	            double shoppingPrice = scanner.nextDouble();

	            // Create Customer object
	            A_03Customer a_03Customer = new A_03Customer(email, address);
	            a_03Customer.giveDiscount(shoppingPrice);
	        }
	        else 
	        {
	            System.out.println("Invalid customer type.");
	        }

	        scanner.close();
*/