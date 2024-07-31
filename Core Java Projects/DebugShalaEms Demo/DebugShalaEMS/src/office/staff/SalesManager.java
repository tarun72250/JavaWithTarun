package office.staff;

import office.utility.ITraveller;

public class SalesManager extends Employee implements ITraveller {

	private int target;
	private double incentive;
	// for interface ITraveller
	private int daysTravelled;

	public SalesManager() {

	}

	public SalesManager(String name, int dd, int mm, int yy, int empid, float sallary, int target, double incentive) {
		super(name, dd, mm, yy, empid, sallary);
		this.target = target;
		this.incentive = incentive;
	}

	//for interface ITraveller
	public SalesManager(String name, int dd, int mm, int yy, int empid, float sallary, int target, double incentive,
			int daysTravelled) {
		super(name, dd, mm, yy, empid, sallary);
		this.target = target;
		this.incentive = incentive;
		this.daysTravelled = daysTravelled;
	}

	public void display() {
		System.out.println("Calling from SalesManager...!");
		super.display();
		System.out.println("Extra Target :" + target);
		System.out.println("Extra Incentive :" + incentive);
	}

	@Override
	public String toString() {
		return "SalesManager [target=" + target + ", incentive=" + incentive + ",super. toString()=" + super.toString()
				+ "]";
	}

	@Override
	public double calSallary() {
		return sallary + (sallary * incentive / 100);
	}

	//for interface ITraveller
	@Override
	public double calculateTA() {
		return (sallary *DA/100)*daysTravelled;
	}

}
