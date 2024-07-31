package office.staff;

import office.utility.Person;

//sub class of person
public abstract class Employee extends Person
{
	private int empid;
	//2 way.
	protected float sallary;
	//private float sallary;
	
	public Employee()
	{
		
	}
	
	public Employee(String name,int dd ,int mm ,int yy ,int empid , float sallary)
	{
		super(name,dd,mm,yy);
		this.empid=empid;
		this.sallary=sallary;
	}
	
	//concrete method
	public void display()
	{
		super.display();
		System.out.println("Empid :-"+empid);
		System.out.println("Salary :-"+sallary);
	}

	//concrete method
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", sallary=" + sallary + ", super.toString()=" + super.toString() + "]";
	}

	//abstract method
	
	public double getSalary()
	{
		return sallary;
	}
	
	
	//if any class have method abstract method , so u should declared classs object
	//1 way.
	public abstract double calSallary();
	
}
