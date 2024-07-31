package day_12_abstractAssignment;

//something which is not completely defined
//abstract keyword we cant use new keyword
//can't create object of abstract class 
public abstract class A_01_Emp extends A_01_Person {
//public class A_01_Emp extends A_01_Person{
	private int empid;//extra dm for EMp
	//private float salary;
	//2 way
	protected float salary;
	
	
	public A_01_Emp() {
		super();
	}


	public A_01_Emp(String name,int age , int dd, int mm, int yy, int empid, float salary) {
		super(name,age, dd, mm, yy);
		this.empid = empid;
		this.salary = salary;
	}


	public void display()
	{
		//this.display();//infinite recursion
		//but i want to call person display
		super.display();
		System.out.println("Empid :"+empid);
		System.out.println("Salary :"+salary);
	}


	@Override
	public String toString() {
		
		return super.toString()+" "+"Emp [empid=" + empid + ", salary=" + salary + "]";
	}

	//1 way 
	//getter for private dm in super class
//	public double getSalary()
//	{
//		return salary;
//	}
	
	public abstract double calSalary();
	
}
