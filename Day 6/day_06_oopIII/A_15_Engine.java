package day_06_oopIII;
public class A_15_Engine {
    private String type;
    private String fuel;
    private int cc;

    // Default constructor
    public A_15_Engine() {
    }

    // Fully parameterized constructor
    public A_15_Engine(String type, String fuel, int cc) {
        this.type = type;
        this.fuel = fuel;
        this.cc = cc;
    }

    // Getters and setters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    // Override toString() method
    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", fuel='" + fuel + '\'' +
                ", cc=" + cc +
                '}';
    }
}

