package day_06_oopIII;

public class BookNormal {
	
	private float price;//data members
	static int bookid;//static data members
	
	
	static //static block
	{
		bookid=0;
	}
	
	public BookNormal()//default constructor
	{
	bookid++;
	this.price=500;
	}
	
	public BookNormal(float price)//parametrized constructor
	{
		bookid++;
		this.price=price;	
	}
	
	public void display()
	{
		System.out.println("Book id:"+bookid+"price of the book"+price);
		//System.
	}
}
