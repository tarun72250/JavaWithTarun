package day_06_oopIII;

public class PersonClassUsingAssociation {
	
	String name;       //instance variable
	DateClassUsingAssociation bdate;   // refrence variable
	
	public PersonClassUsingAssociation()
	{
	
	}
	
	public PersonClassUsingAssociation(String n ,int d , int m , int y )
	{
		this.name=n;
		this.bdate=new DateClassUsingAssociation(d,m,y);
	}
	
	public PersonClassUsingAssociation(String n)
	{
		this.name=n;
	}
	
	public PersonClassUsingAssociation(int d , int m , int y)
	{
		this.bdate=new DateClassUsingAssociation(d,m,y);
	}
	
	public void display()
	{
		System.out.println("Name :"+name);
		if(bdate != null)
		{
			System.out.println("Birthdate :");
				bdate.showDate();
		}
		else
		{
			System.out.println("user does not provide date info");
		}
					
	}

}
