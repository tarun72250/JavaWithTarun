package day_12_abstractAssignment;

import java.util.Scanner;

public class A_02_BookTypesDemo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many books info u maintained");
		int n = scanner.nextInt();
    		   
		A_02_Book[] books = new A_02_Book[n];

        for (int i = 0; i < books.length; i++) {
            System.out.print("Enter type of book (EBook/PaperBook): ");
            String bookType = scanner.nextLine().toLowerCase();
            System.out.print("Enter title of the book: ");
            String title = scanner.nextLine();
            System.out.print("Enter author of the book: ");
            String author = scanner.nextLine();
            System.out.print("Enter cost of the book: ");
            double cost = Double.parseDouble(scanner.nextLine());

            if (bookType.equals("ebook")) {
                books[i] = new A_02_Ebook(title, author, cost);
            } else if (bookType.equals("paperbook")) {
                books[i] = new A_02_PaperBook(title, author, cost);
            } else {
                System.out.println("Invalid book type. Please enter either 'EBook' or 'PaperBook'.");
                i--; // Decrement i to repeat the loop iteration
            }
        }

        for (A_02_Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", Final Cost: " + book.calculateCost());
        }

	}

}
