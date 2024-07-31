package office.staff;

public class Admin extends Employee 
{
	private double bonus;
	
	public Admin()
	{
		
	}
	
	public Admin(String name,int dd ,int mm ,int yy ,int empid , float sallary,double bonus)
	{
		super(name, dd , mm , yy , empid , sallary);
		this.bonus=bonus;
	}
	
	public void display()
	{
		System.out.println("Calling From Admin");
		super.display();
		System.out.println("Bonus :"+bonus);
	}

	@Override
	public String toString() {
		return "Admin [bonus=" + bonus + ", super.toString()=" + super.toString() + "]";
	}
	
	@Override
	public double calSallary()
		{
			return sallary+ bonus;
		}
}
