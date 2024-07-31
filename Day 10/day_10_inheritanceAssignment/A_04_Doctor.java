package day_10_inheritanceAssignment;

public class A_04_Doctor extends A_01_Person{

	    private String degree;
	    private int regNo;
	    private double salary;

	    A_04_Doctor(String name, int age, String degree, int regNo, double salary) {
	        super(name, age);
	        this.degree = degree;
	        this.regNo = regNo;
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "\nDegree: " + degree + "\nRegistration Number: " + regNo + "\nSalary: $" + salary;
	    }
	
	    public void display()
	    {
	    	super.display();
	    	System.out.println("Degree "+degree);
	    	System.out.println("Registration no :"+regNo);
	    	System.out.println("Salary :"+salary);
	    }
}
