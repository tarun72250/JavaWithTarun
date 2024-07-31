package day_12_abstractAssignment;

public class A_03_CurrentAccount extends A_03_Account {

	 private double overdraftAmt;

	    //default cons
	 	public A_03_CurrentAccount()
	 	{
	 		super();
	 	}
	 	
	 	//para
	    public A_03_CurrentAccount(int accNumber, String accName, double balance, double overdraftAmt) {
	        super(accNumber, accName, balance);
	        this.overdraftAmt = overdraftAmt;
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance + overdraftAmt >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawal of " + amount + " from Current Account successful.");
	        } else {
	            System.out.println("Insufficient balance in Current Account.");
	        }
	    }

	    // Calculate balance for current account can be done differently if needed
	    @Override
	    public void calculateBalance() {
	        // Custom implementation if needed
	    }
}
