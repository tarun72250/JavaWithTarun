package day_13_interfaceAssignment.shapes;

public class A_03_Emp extends A_03_Person {

	private  int empid;//extra state dm
	protected double salary;
	
	//default cons
	public A_03_Emp()
	{
		this.empid=0;
		this.salary=0;
	}

	//para cons
    A_03_Emp(String name, int age,int dd, int mm , int yy, int empid, double salary) {
        super(name, age, dd, mm, yy);//this super will becomes 1st
        this.empid = empid;
        this.salary = salary;
    }

    public void display() {
        super.display();
        System.out.println("Employee ID: " + empid);
        System.out.println("Salary: $" + salary);
    }

	public String toString() {
		System.out.println(super.toString());
		//super.toString();
		return "Emp [empid=" + empid + ", salary=" + salary + "]";
	}
}
