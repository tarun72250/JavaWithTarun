package office.utility;

public class Person 
{
	
	String name;
	Date bdate;//has-a relationship
	
	public Person()
	{
		this.name=null;
		bdate =new Date();
	}
	
	
	public Person(String name,int dd ,int mm ,int yy )
	{
		this.name=name;
		bdate =new Date(dd,mm,yy);
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		bdate.display();
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", bdate=" + bdate.toString() + "]";
	}
	
	
	
	
}
