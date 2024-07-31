package day_11_polymorphismAssignment;

public class RegCustomer extends Customer{

	int regno;
	
	public RegCustomer() {
		super();
	}

	public RegCustomer(String emailId, String area, String city, String pincode,int regNo) {
		super(emailId,area,city,pincode);
		this.regno = regNo;
	}
	public void display()
	{
		super.display();
		System.out.println("Regno : "+regno);
	}
   public  void giveDiscount(double shoppingPrice) {
        // Regular customer gets 5% discount
        double discount = shoppingPrice * 0.05;
        double finalPrice = shoppingPrice - discount;
        System.out.println("Customer Registration no : "+regno);
        System.out.println("Final price for regular customer (with 5% discount): $" + finalPrice);
    }

@Override
public String toString() {
	return "RegCustomer [regno=" + regno + ", address=" + address + ", toString()=" + super.toString();
}
   
   
}
