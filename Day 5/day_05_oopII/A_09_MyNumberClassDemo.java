package day_05_oopII;

public class A_09_MyNumberClassDemo {

	public static void main(String[] args) {
        // Create an object and perform tests
        A_09_MyNumberClass num = new A_09_MyNumberClass(-5);
        System.out.println("Is negative? " + num.isNegative());
        System.out.println("Is positive? " + num.isPositive());
        System.out.println("Is zero? " + num.isZero());
        System.out.println("Is odd? " + num.isOdd());
        System.out.println("Is even? " + num.isEven());
        
        System.out.println();
        A_09_MyNumberClass num1 = new A_09_MyNumberClass(5);
        System.out.println("Is negative? " + num1.isNegative());
        System.out.println("Is positive? " + num1.isPositive());
        System.out.println("Is zero? " + num1.isZero());
        System.out.println("Is odd? " + num1.isOdd());
        System.out.println("Is even? " + num1.isEven());
        
        System.out.println();
        A_09_MyNumberClass num2 = new A_09_MyNumberClass(-5);
        System.out.println("Is negative? " + num2.isNegative());
        System.out.println("Is positive? " + num2.isPositive());
        System.out.println("Is zero? " + num2.isZero());
        System.out.println("Is odd? " + num2.isOdd());
        System.out.println("Is even? " + num2.isEven());
    }

}
