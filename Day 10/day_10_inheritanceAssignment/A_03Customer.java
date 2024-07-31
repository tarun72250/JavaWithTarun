package day_10_inheritanceAssignment;

public class A_03Customer {

		private String emailId;
	    String address;

	    public A_03Customer(String emailId, String address) {
	        this.emailId = emailId;
	        this.address = address;
	    }

	   public  void giveDiscount(double shoppingPrice) {
	        // Customer gets no discount
	       // double finalPrice = shoppingPrice;
		 //  System.out.println("Emailid :"+emailId+" Address :"+address+" FinalPrice :"+shoppingPrice);
		   System.out.println("Customer mail id : "+emailId);
		   System.out.println("Customer Address : "+address);
	       System.out.println("Final price for regular customer: $" + shoppingPrice);
	    }

	//getter ()
	public String getEmailId()
	{
		return emailId;
	}
	   
	public String getAddress()
	{
		return address;
	}
	   
}
