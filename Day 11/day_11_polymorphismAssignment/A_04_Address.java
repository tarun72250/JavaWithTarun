package day_11_polymorphismAssignment;

public class A_04_Address {

	String area,city,pincode;

	public A_04_Address() {
	}

	public A_04_Address(String area, String city, String pincode) {
		this.area = area;
		this.city = city;
		this.pincode = pincode;
	}
	
	public void display()
	{
		System.out.println("Area : "+area);
		System.out.println("City : "+city);
		System.out.println("Pincode : "+pincode);
	}

	@Override
	public String toString() {
		return "Address [area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
