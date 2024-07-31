package day_06_oopIII;

public class AccountDemo {

	public static void main(String[] args) {
		
		
		Account a1; //declaration refrence variable 
		a1 = new Account(); //default cons calling
	    System.out.println("Current rate : "+Account.getIntRate());//Account.getIntRate() is static method to access Account class int_rate value .
		a1.calBalance(); // calling by object
		
		System.out.println();
		Account a2 = new Account(200,200,3.5);//parametrized cons calling
		a2.calBalance();//  calling by object
		Account.updateRate(5.5f);// calling static method directly  
		System.out.println("Current rate : "+Account.getIntRate()); // called static variable directly
		a1.calBalance(); // calling by object
	    a2.calBalance(); // calling by object

	    
	    /*
	    System.out.println();
	    Account a3; //declaration refrence variable 
		a3 = new Account(); //initilization
		a3.calBalance();
			
		System.out.println();
		Account a4; //declaration refrence variable 
		a4 = new Account(); //initilization
		Account.updateRate(6.0f);
			a4.calBalance();
		
		
		
		System.out.println();
		Account a5; //declaration refrence variable 
		a5 = new Account(); //initilization
		a5.updateRate(9.0f);
		a5.calBalance();
		
	   
		System.out.println();
	    Account a6; //declaration refrence variable 
		a6 = new Account(); //initilization
		//a6.updateRate(12.0f);
	    a6.calBalance();
	    
		System.out.println();
	    Account a7; //declaration refrence variable 
		a7 = a1; //initilization
		//a7.updateRate(12.0f);
	    a7.calBalance();
	    
		System.out.println();
	    Account a8; //declaration refrence variable 
		a8 = new Account(a1); //initilization
		//a8.updateRate(12.0f);
	    a8.calBalance();
	    
	    if(a1==a2)
	    	System.out.println("same");
	    else
	    	System.out.println("different");
	    
	    if(a1==a5)
	    	System.out.println("same");
	    else
	    	System.out.println("different");
	    
	    if(a1==a7)
	    	System.out.println("same");
	    else
	    	System.out.println("different");
	    
	    if(a1==a8)
	    	System.out.println("same");
	    else
	    	System.out.println("different");*/
	}

}
