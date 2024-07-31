package day_11_polymorphismAssignment;

public class Customer {

	private String emailId;
    Address address;

    public Customer()
    {
    	
    }
    public Customer(String emailId, String area, String city, String pincode) {
        this.emailId = emailId;
        this.address = new Address(area,city,pincode);
    }

    public void display()
    {
    	 address.display();
    	 System.out.println("Customer mail id : "+emailId);
    }
   public  void giveDiscount(double shoppingPrice) {
        // Customer gets no discount
       // double finalPrice = shoppingPrice;
	   address.display();
	   System.out.println("Customer mail id : "+emailId);
       System.out.println("Final price for regular customer: $" + shoppingPrice);
    }
	
	@Override
	public String toString() {
		return "Customer [emailId=" + emailId + ", address=" + address.toString() + "]";
	}
	   
	   
   
}
