package day_06_oopIII;

public class A_03_Book {
	
	private int bookid; 		 // instance data members
	private float price;		//object level info
	
	private static int count; 	//static members , class level info
	
	
	static 				//static block
	{
		count=0;
	}
	
	
	public A_03_Book()  			//default constructor
	{
		count++;
		bookid=count;
		this.price=0;
	}
	
	
	public A_03_Book(float price)	//parametrized constructor
	{
		count++;
		bookid=count;
		this.price=price;
	}
	
	
	
	public void showDetails()		//methods
	{
		System.out.println("Book id :" +bookid+" price : "+price);
	}

}
