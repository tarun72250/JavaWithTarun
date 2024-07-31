package day_06_oopIII;

public class A_08_PersonDemo {

	 public static void main(String [] args)
	    {
		A_08_Person p1 = new A_08_Person("Amit",11,11,1999);
		p1.display();
		
		Date bdate = new Date(12,12,1998);
		A_08_Person p2 = new A_08_Person("Rahul", bdate);
		p2.display();

		A_08_Person p3 = new A_08_Person();
		p3.display();
	    }
}
