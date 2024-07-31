package day_06_oopIII;

public class A_09_Customer {
	
	String email;// this class data member
	A_09_Address address;//instance data member of this Address class
	
	public A_09_Customer()//Default constructor
	{
		this.email="Tarunrathore2004@gmail.com";
		address=new A_09_Address();
	}
	
	
	public A_09_Customer(String a,String c,String p,String e)//parametrized constructor
	{
		this.address=new A_09_Address(a,c,p);
		this.email=e;
	}
	
	public void display()//this class method
	{
		System.out.println("Address of the customer:");
		address.display();//override Address class method
		System.out.println("email:"+email);
	}


}
