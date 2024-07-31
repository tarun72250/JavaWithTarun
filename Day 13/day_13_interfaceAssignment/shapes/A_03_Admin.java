package day_13_interfaceAssignment.shapes;

public class A_03_Admin extends A_03_Emp {

	private double bonus;

	//default cons
	public A_03_Admin() {
		super();
	}

	//para cons
	public A_03_Admin(String name,int age, int dd, int mm, int yy, int empid, float salary,double bonus) {
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
		return salary + bonus;
	}
}
