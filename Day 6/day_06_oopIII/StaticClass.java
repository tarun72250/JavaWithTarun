package day_06_oopIII;

public class StaticClass {
	
	//Data member , instance member 
	int accno;
	
	//static data member 
	static float int_rate;
	
	//static block
	static 
	{
		int_rate=3.5f;
	}
	
	//Default constructor
	public StaticClass()
	{
		
	}
	
	//Parametrized constructor
	public StaticClass(int account)
	{
		this.accno=account;
	}
	
	public StaticClass(int  account , float interestrate )
	{
		this.accno=account;
		this.int_rate=interestrate;
	}
	
	public void displayAccDetails()
	{
		System.out.println("Account no :- "+accno);
		System.out.println("Interest rate of 1 year  :- "+int_rate*12);
	}
	
	public void calulateInterest(int  account , float interestrate)
	{
		System.out.println("Account no :- "+account);
		System.out.println("Interest rate of 1 year "+interestrate+"  :- "+interestrate*12);
	}
	
	public static void updateInterest(int  account , float interestrate)
	{
		System.out.println("Account no :- "+account);
		System.out.println("Interest rate of 1 year "+interestrate+"  :- "+interestrate*12);
	}
}
