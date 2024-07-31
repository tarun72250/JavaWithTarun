package day_11_polymorphismAssignment;

import java.util.Scanner;

public class A_03_BookTypeDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many books info u maintained");
		int n = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character
    		   
		A_03_Book[] books = new A_03_Book[n];
        for (int i = 0; i < books.length; i++) 
        {    
            System.out.print("Enter title of the book: ");
            String title = scanner.nextLine();
            System.out.print("Enter author of the book: ");
            String author = scanner.nextLine();
            System.out.print("Enter cost of the book: ");
            double cost = Double.parseDouble(scanner.nextLine());

        	System.out.print("Enter type of book (EBook/PaperBook): ");
            String bookType = scanner.nextLine().toLowerCase();
            
            if (bookType.equals("ebook")) {
                books[i] = new A_03_Ebook(title, author, cost);
            } 
            else if (bookType.equals("paperbook")) {
                books[i] = new A_03_PaperBook(title, author, cost);
            }
            else 
            {
                System.out.println("Invalid book type. Please enter either 'EBook' or 'PaperBook'.");
                i--; // Decrement i to repeat the loop iteration
            }
        }

        //Advanced for loop
        for (A_03_Book b : books) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor() + ", Final Cost: " + b.calculateCost());
        }
	}
}