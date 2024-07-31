package day_06_oopIII;

public class A_09_Address {
	
	private String area;
	private String city;
	private String pincode;
	
	public A_09_Address()//Default constructor
	{
		this.area="jehangirabad";
		this.city="Bhopal";
		this.pincode="462008";
	}
	public A_09_Address(String a,String c,String p)//Parametrized constructor
	{
		this.area=a;
		this.city=c;
		this.pincode=p;
	}
	
	public void display()//this class Method
	{
		System.out.println("Area:"+area);
		System.out.println("City:"+city);
		System.out.println("PinCode:"+pincode);
	}

}
