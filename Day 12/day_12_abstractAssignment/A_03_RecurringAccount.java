package day_12_abstractAssignment;

public class A_03_RecurringAccount extends A_03_Account{

	private double recurringAmt;
    private int noOfInstallments;
    
    private static double intRate = 0.06;

    //para cons
    public A_03_RecurringAccount(int accNumber, String accName, double balance, double recurringAmt, int noOfInstallments) {
        super(accNumber, accName, balance);
        this.recurringAmt = recurringAmt;
        this.noOfInstallments = noOfInstallments;
    }

    @Override
    public void withdraw(double amount) {
        System.out.println("Withdrawal not allowed from Recurring Account.");
    }

    // Calculate balance for recurring account can be done differently if needed
    @Override
    public void calculateBalance() {
        // Custom implementation if needed
    
    	
    }
}
