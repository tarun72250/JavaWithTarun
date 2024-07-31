package day_12_abstractAssignment;

public class A_03_Account {

	    protected int accNumber;
	    protected String accName;
	    protected double balance;//state dm

	    //default cons
	    public A_03_Account()
	    {
	    	
	    }
	    
	    //para cons
	    public A_03_Account(int accNumber, String accName, double balance) {
	        this.accNumber = accNumber;
	        this.accName = accName;
	        this.balance = balance;
	    }

	    //instance member method
	    public void withdraw(double amount) {
	        // To be implemented in subclasses
	    }

	    //instance member method
	    public void calculateBalance() {
	        // To be implemented in subclasses
	    }

	    //insatnce member method
	    public void display() {
	        System.out.println("Account Number: " + accNumber);
	        System.out.println("Account Name: " + accName);
	        System.out.println("Balance: " + balance);
	    }
}
