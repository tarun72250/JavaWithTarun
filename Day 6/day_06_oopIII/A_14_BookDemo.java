package day_06_oopIII;

public class A_14_BookDemo {
    public static void main(String[] args) {
        // Create an array of 5 books
        A_14_Book [] books = new A_14_Book[5];

        // Create authors
        A_14_Author author1 = new A_14_Author("Author1", "author1@example.com", 1234567890);
        A_14_Author author2 = new A_14_Author("Author2", "author2@example.com", 1876543210);

        // Create books and assign authors
        books[0] = new A_14_Book(author1, 25.5f, 100);
        books[1] = new A_14_Book(author2, 30.0f, 50);
        books[2] = new A_14_Book(author1, 20.0f, 80);
        books[3] = new A_14_Book(author2, 35.0f, 120);
        books[4] = new A_14_Book(author1, 15.0f, 60);

        // Display details of all books
        for (A_14_Book book : books) {
            System.out.println(book);
        }
    }
}