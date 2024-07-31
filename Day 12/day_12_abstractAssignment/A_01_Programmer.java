package day_12_abstractAssignment;

public class A_01_Programmer extends A_01_Emp{

	private int extraHours;
	private int chargesPerHours;
	
	
	public A_01_Programmer()
	{
		
	}
	
	public A_01_Programmer(String name ,int age,int dd , int mm , int yy, int empid , float sallary, int extraHours, int chargesPerhours)
	{
		super(name,age,dd,mm,yy,empid,sallary);
		this.extraHours=extraHours;
		this.chargesPerHours=chargesPerhours;
	}
	
	public void display()
	{
		System.out.println("Calling From Programmer");
		super.display();
		System.out.println("Extra hours : "+extraHours);
		System.out.println("Charges Per hours : "+chargesPerHours);		
	}


	@Override
	public String toString() {
		System.out.println("Calling From Programmer");
		return super.toString() +"\nextraHours :" + extraHours + "\nchargesPerHours=" + chargesPerHours;
	}

	//1 way
//	@Override
//	public double calSalary() {
//		
//		return super.getSalary()+(chargesPerHours*extraHours);
//	}

	
	
	//2 way use protected
	@Override
	public double calSalary() {
		//directly salary accesible bcoz of protected in Emp() class
		return salary+(extraHours * chargesPerHours);
	}
	
	
}
