package day_18_multithreadingAssignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//6. Create a thread for printing prime numbers in a given range.
public class B_06_PrimeNumberThread implements Runnable {
    private int start;
    private int end;

    public B_06_PrimeNumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
