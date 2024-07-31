package day_06_oopIII;

public class A_09_CustomerDemo {

	public static void main(String[] args)
	{
	
	A_09_Customer c1=new A_09_Customer();
	c1.display();
					/*
					Output 
					Address of the customer:
					Area:jehangirabad
					City:Bhopal
					PinCode:462008
					email:Tarunrathore2004@gmail.com*/

		
	System.out.println();
	A_09_Customer c=new A_09_Customer("deccan","gymkhana","462008","123@gmail.com");
	c.display();
					/*output
				 	Address of the customer:
					Area:deccan
					City:gymkhana
					PinCode:462008
					email:123@gmail.com
					*/
	
	}

}
