package day_11_polymorphismAssignment;

public class A_02_Admin extends A_01_Emp {

	private double bonus;

	//default cons
	public A_02_Admin() {
		super();
	}

	//para cons
	public A_02_Admin(String name,int age, int dd, int mm, int yy, int empid, float salary,double bonus) {
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
	
	//use protected 
	public double calSalary() {
		//directly salary accesible bcoz of protected in Emp() class
		return super.calSalary() + bonus;
	}
}
