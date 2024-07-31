package day_10_inheritanceAssignment;

public class Employee extends A_01_Person {
	
	private int empid;
	private double sallary;//extra state
	
	//Default cons
	public Employee()
	{
		super();
		this.empid=1000;
		this.sallary=10000;
	}

	//Para cons
	public Employee(String name, int age, int empid, double sallary) {
		super(name, age);
		this.empid = empid;
		this.sallary = sallary;
	}
	
	//insatnce member method
	public void display()
	{
		super.display();
		System.out.println("Empid :"+empid+" Sallary :"+sallary);
		
	}
	
	
	
}
