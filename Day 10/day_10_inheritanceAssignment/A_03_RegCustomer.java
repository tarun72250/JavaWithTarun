package day_10_inheritanceAssignment;

public class A_03_RegCustomer extends A_03Customer {

	int regNo;

    public A_03_RegCustomer(String emailId, String address, int regNo) {
        super(emailId, address);
        this.regNo = regNo;
    }

   public  void giveDiscount(double shoppingPrice) {
        // Regular customer gets 5% discount
        double discount = shoppingPrice * 0.05;
        double finalPrice = shoppingPrice - discount;
        System.out.println("Customer Emailid : "+super.getEmailId());
        System.out.println("Customer Address : "+super.address);//because we declare non-private address in super class
        System.out.println("Customer Registration no : "+this.regNo);
        System.out.println("Final price for regular customer (with 5% discount): $" + finalPrice);
    }
}
