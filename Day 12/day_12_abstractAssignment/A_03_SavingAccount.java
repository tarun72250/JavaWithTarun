package day_12_abstractAssignment;

public class A_03_SavingAccount extends A_03_Account {

	private static double intRate;
	//static block
	static {
		intRate = 0.05;
	}

	//default cons
    public A_03_SavingAccount() {
      super();
    }

    //para cons
    public A_03_SavingAccount(int accNumber, String accName, double balance) {
        super(accNumber, accName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) 
        {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " from Savings Account successful.");
        } else 
        {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    // Calculate balance for savings account can be done differently if needed
    @Override
    public void calculateBalance() {
        // Custom implementation if needed
    	System.out.println("Balance in your Saving acc :"+balance);
    }

}
