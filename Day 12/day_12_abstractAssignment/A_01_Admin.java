package day_12_abstractAssignment;

public class A_01_Admin extends A_01_Emp{

	private double bonus;

	public A_01_Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public A_01_Admin(String name,int age, int dd, int mm, int yy, int empid, float salary,double bonus) {
		super(name,age, dd, mm, yy, empid, salary);
		// TODO Auto-generated constructor stub
		this.bonus=bonus;
	}

	@Override
	public void display() {
		System.out.println("Calling From Admin");
		super.display();
		System.out.println("Bonus :"+bonus);
	}

	@Override
	public String toString() {
		System.out.println("Calling From Admin");
		return super.toString()+"\nBonus : "+bonus;
	}

	//1 way
//	@Override
//	public double calSalary() {
//		
//		return bonus + super.getSalary();
//	}
	
	//use protected 
	public double calSalary() {
		//directly salary accesible bcoz of protected in Emp() class
		return salary + bonus;
	}
}
