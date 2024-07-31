package day_05_oopII;

public class A_04_PointClassDemo {
	
	public static void main(String[]args)
	{
	    // by default in class default constructor is present which have value 00	
		//in our class if we specify any other constructor ,or we calling default cons,
		// default cons specification is compulsory.
		A_04_PointCLass p =new A_04_PointCLass();
		p.display();
		
		//calling parametrized cons
		A_04_PointCLass p1 =new A_04_PointCLass(10,20);
		p1.display();
	}

}
