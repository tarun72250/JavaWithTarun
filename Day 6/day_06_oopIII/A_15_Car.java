package day_06_oopIII;
public class A_15_Car {
	
    private A_15_Engine engine;
    private String make;
    private String color;

    // Default constructor
    public A_15_Car() {
    }

    // Fully parameterized constructor
    public A_15_Car(A_15_Engine engine, String make, String color) {
        this.engine = engine;
        this.make = make;
        this.color = color;
    }

    // Getters and setters
    public A_15_Engine getEngine() {
        return engine;
    }

    public void setEngine(A_15_Engine engine) {
        this.engine = engine;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", make='" + make + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}