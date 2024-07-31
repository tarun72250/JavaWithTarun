package day_06_oopIII;

public class A_03_BookDemo {

	public static void main(String[] args) {
		A_03_Book b1=new A_03_Book();
		b1.showDetails();
		
		
		A_03_Book b2=new A_03_Book(100.00f);
		b2.showDetails();
		
		
		
		A_03_Book b3=new A_03_Book(230.00f);
		b3.showDetails();
		
		
		A_03_Book b4=new A_03_Book(890.00f);
		b4.showDetails();
	}

}
