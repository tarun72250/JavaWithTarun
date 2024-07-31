package day_13_interfaceAssignment.shapes;

import day_13_interfaceAssignment.utils.*;

public class A_02_MyNumber implements A_02_IntOperations{

	    public boolean isOdd(int num) {
	        return num % 2 != 0;
	    }

	    public boolean isEven(int num) {
	        return num % 2 == 0;
	    }

	    public boolean isPrime(int num) {
	        if (num <= 1) return false;
	        if (num <= 3) return true;
	        if (num % 2 == 0 || num % 3 == 0) return false;
	        for (int i = 5; i * i <= num; i += 6) {
	            if (num % i == 0 || num % (i + 2) == 0) return false;
	        }
	        return true;
	    }

	    public double calFactorial(int num) {
	        if (num < 0)
	            throw new IllegalArgumentException("Factorial can't be calculated for negative numbers.");
	        double result = 1;
	        for (int i = 2; i <= num; i++) {
	            result *= i;
	        }
	        return result;
	    }
	
}
