package day_11_polymorphismAssignment;


public class A_02_SalesManager extends A_01_Emp {

	private int target;
	private double incentive;
	
	//Default cons
	public A_02_SalesManager() {
		super();
	}
	
	//Para cons
	public A_02_SalesManager(String name,int age , int dd, int mm, int yy, int empid, float salary, int target, double incentive) {
		super(name,age, dd, mm, yy, empid, salary);
		this.target = target;
		this.incentive = incentive;
		}
	
	
	public void display()
	{
		System.out.println("Calling From SalesManager");
		super.display();//name bdate empid sallary 
		System.out.println("Extra Target : "+target);
		System.out.println("Extra Incentive : "+incentive);
	}
	
	public String toString()
	{
		System.out.println("Calling From SalesManager");
		return super.toString()+"\nExtra Target : "+target+"\nExtra Incentive : "+incentive;
	}
	
	//use protected 
		@Override
		public double calSalary() {
			//directly salary accesible bcoz of protected in Emp() class
			return super.calSalary() + (super.calSalary() * incentive/100);
		}
	
}
