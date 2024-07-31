package office.staff;

import office.utility.ITraveller;

public class Programmer extends Employee implements ITraveller
{
	private int extraHours;
	private int chargesPerHour;
	// for interface ITraveller
	private int daysTravelled;
	
	public Programmer()
	{
		
	}
	
	public Programmer(String name,int dd ,int mm ,int yy ,int empid , float sallary,int extraHours,int chargesPerHour)
	{
		super(name, dd , mm , yy , empid , sallary);
		this.extraHours=extraHours;
		this.chargesPerHour=chargesPerHour;
	}
	
	
	//for interface ITraveller
	public Programmer(String name, int dd, int mm, int yy, int empid, float sallary, int extraHours, int chargesPerHour,
			int daysTravelled) {
		super(name, dd, mm, yy, empid, sallary);
		this.extraHours = extraHours;
		this.chargesPerHour = chargesPerHour;
		this.daysTravelled = daysTravelled;
	}

	public void display()
	{
		System.out.println("Calling from Programmer");
		super.display();
		System.out.println("ExtraHours :"+extraHours);
		System.out.println("ChargesPerHour :"+chargesPerHour);
	}

	@Override
	public String toString() {
		return "Programmer [extraHours=" + extraHours + ", chargesPerHour=" + chargesPerHour + ", super.toString()="
				+ super.toString() + "]";
	}

	@Override
	public double calSallary() {
	
		return sallary +(extraHours * chargesPerHour );
	}

	//for interface ITraveller
	@Override
	public double calculateTA() {
		return (sallary*DA/100)*daysTravelled;
	}
	
	
	
}
