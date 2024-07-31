package day_06_oopIII;

public class Person {

	String name;//non-static/instance members
	Date bdate;// refrence variable
	
	
	//Default Cons
	public Person()
	{
		//1 way to resolve runtime error
		//isko likhne ki need nhi h ab//name and bdate will remain null
//		name=null;
//		bdate=null;
//		this.name="not assigned";
//		this.bdate = new Date();///
	}
	
	
	//Parametrized cons
	public Person(String name,int dd , int mm , int yy)
	{
		//this.name=new String(name); // this will also correct bcoz String is a also class 
		this.name=name;
		this.bdate=new Date(dd,mm,yy);
	}
	//Date d = new Date;
	//d.showDate();
	
	//Date d = null
	//d.showDate();	
	
	//instance method
	public void display()
	{
		
		System.out.println("Name :"+name);
		//bdate.showDate();
		if(bdate != null)
			bdate.showDate();
		else
			System.out.println("BirthDate is null");
	}
	
}