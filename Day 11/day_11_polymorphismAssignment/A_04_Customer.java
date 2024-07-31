package day_11_polymorphismAssignment;

public class A_04_Customer {

	private String emailId;
    A_04_Address a_04_Address;

    public A_04_Customer()
    {
    	
    }
    public A_04_Customer(String emailId, String area, String city, String pincode) {
        this.emailId = emailId;
        this.a_04_Address = new A_04_Address(area,city,pincode);
    }

    public void display()
    {
    	 a_04_Address.display();
    	 System.out.println("Customer mail id : "+emailId);
    }
   public  void giveDiscount(double shoppingPrice) {
        // Customer gets no discount
       // double finalPrice = shoppingPrice;
	   a_04_Address.display();
	   System.out.println("Customer mail id : "+emailId);
       System.out.println("Final price for regular customer: $" + shoppingPrice);
    }
	
	@Override
	public String toString() {
		return "Customer [emailId=" + emailId + ", address=" + a_04_Address.toString() + "]";
	}
	   
	   
   
}
