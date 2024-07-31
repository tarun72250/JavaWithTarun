package day_17_javaFileIO2Assignment;

public class A_04_Person {

	private String name ;
	private int age;
	private String address;
	
	public A_04_Person()
	{
		
	}
	
	public A_04_Person(String name , int age , String address)
	{
		this.name = name;
		this.age=age;
		this.address=address;
	}

	@Override
	public String toString() {
		return "A_04_Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

}
