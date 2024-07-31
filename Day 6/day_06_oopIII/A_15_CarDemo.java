package day_06_oopIII;

public class A_15_CarDemo {
    public static void main(String[] args) {
        // Create 3 different car objects
        A_15_Engine engine1 = new A_15_Engine("V8", "Petrol", 5000);
        A_15_Car car1 = new A_15_Car(engine1, "BMW", "Black");

        A_15_Engine engine2 = new A_15_Engine("Inline-4", "Diesel", 2000);
        A_15_Car car2 = new A_15_Car(engine2, "Toyota", "Red");

        A_15_Engine engine3 = new A_15_Engine("V6", "Petrol", 3500);
        A_15_Car car3 = new A_15_Car(engine3, "Mercedes", "Silver");

        // Display details of all cars
        System.out.println("Car 1: " + car1);
        System.out.println("Car 2: " + car2);
        System.out.println("Car 3: " + car3);
    }
}