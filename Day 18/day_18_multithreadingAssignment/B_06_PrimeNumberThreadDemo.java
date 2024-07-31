package day_18_multithreadingAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_06_PrimeNumberThreadDemo {

    public static void main(String[] args) {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter start number: ");
            int start = Integer.parseInt(consoleReader.readLine());
            System.out.print("Enter end number: ");
            int end = Integer.parseInt(consoleReader.readLine());

            Thread primeNumberThread = new Thread(new B_06_PrimeNumberThread(start, end));
            primeNumberThread.start();
            primeNumberThread.join();
        }
        catch (IOException | InterruptedException e) 
        {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
