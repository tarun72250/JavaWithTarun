package day_06_oopIII;

public class Account1 {

	private int accno;//instance level info
	private double balance;
	
	
	private static float int_rate;//class level info
	
	//static block
	static {
		int_rate=4.5f;
	}
	
	//default cons
	public Account1()
	{
		
	}
	
	//para cons
	public Account1(int accno , double balance)
	{
		this.accno=accno;
		this.balance=balance;
		//this.int_rate=int_rate; wrong approach
	}
	
	//instance method
	public void display()
	{
		System.out.println("Account :"+accno);
		System.out.println("Balance :"+balance);
		double bal = calInterest();
		System.out.println("Balance with interest :"+bal);
	}
	
	//internally method call
	public double calInterest()
	{
		return balance * 100 / int_rate;
	}
	
	public static void updateRate(float rate)
	{
		int_rate = rate;
	}
	
}
