package day_05_oopII;

public class A_09_MyNumberClass {
	
    private int number;

    // Default constructor
    public A_09_MyNumberClass() {
        this.number = 0;
    }

    // Constructor with parameter
    public A_09_MyNumberClass(int number) {
        this.number = number;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return number < 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return number > 0;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return number == 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        return number % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        return number % 2 == 0;
    }
}
