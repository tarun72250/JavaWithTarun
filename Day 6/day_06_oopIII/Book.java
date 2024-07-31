package day_06_oopIII;

public class Book {
	
	private int bookid;//instance data member , primitive dm
	private String title;//refrence variable
	private Publisher publisher;//refrence variable 
	
	//default cons
	public Book() {
		this.bookid=0;
		this.title="not assigned";
		this.publisher=new Publisher();
		
	}
	
	//para cons
	public Book(int bookid, String title,int pubid , String pub_name , String pub_loc) {
		
		this.bookid = bookid;
		this.title = title;
		this.publisher = new Publisher(pubid , pub_name , pub_loc);
	}

	//method
	public void display()
	{
		System.out.println("Book id: "+bookid);
		System.out.println("Book Title: "+title);
			publisher.display();
		//		if(publisher == null)
//		{
//			System.out.println("Not Assigned anything in publisher");
//		}
//		else
//		{
//			publisher.display();
//		}
	}
	
	//Getter () for bookid
	public int getBookid() {
		return bookid;
	}
	
	//Setter () for bookid
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	

	
}
