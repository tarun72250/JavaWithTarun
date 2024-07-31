package day_06_oopIII;

public class Account {
	
	   //instance - non-static data members
	   private int accno;
	   private float balance;
	   
	   //static data member	
	   //its not a good approach to initialize the static data member value at time of declaration
	   private static double int_rate; 
	    
	   //for static dm declare we initialized static block 
	   static
	   {
		int_rate = 4.5f;
		//this.accno=1;  //Cannot make a static reference to the non-static field accno
	   }

	   //non-static dm are always initiliazed in constructor
	   //default constructor
	   public Account()
	   {
		   this.accno=1002;
		   this.balance=2000;
	   }

	   //parametrized constructor
	   public Account(int accno, float balance , double i)
	   {
		this.accno = accno;
		this.balance = balance;
		int_rate=i; //The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	   }
	   
	   //copy constructor
	   public Account(Account a)
	   {
		this.accno = a.accno;
		this.balance = a.balance;
		//this.int_rate=i; //The static field Account.int_rate should be accessed in a static block or we shoulc always initialized in static block
	   }

	   
	   //static method which is called directly by class name
	   //My need is to update int_rate of this class
	   public static void updateRate(float new_rate)
	   {
		System.out.println("In updateRate Static method");
		int_rate=new_rate;
		//this.balance = 14000.00f;   //not allowed to access non-static
		 // this.int_rate=new_rate;//error for this.int_rate bcoz this is to access current object.
	   }

	   //static method to access this class static method value direct with classname
	   public static double getIntRate()
	   {
		return int_rate;
	   }		

	   //non static method which is called by creating object
	   public void  calBalance()
	   {
		  System.out.println("Account no :"+accno);
		  System.out.println("Balance :"+balance);
		 double bal =balance+(balance*int_rate/100);
		 System.out.println("Balance with interest"+bal);
	   }

	
	   
	   
}
