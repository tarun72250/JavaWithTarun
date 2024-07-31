package day_11_polymorphismAssignment;

public class A_01_EmpDemo {

	public static void main(String[] args) {
	
//		A_01_Person p = new A_01_Emp("Tarun",22,18,05,1999,101,20000.0f);
//		//p.display();
//		System.out.println(p);
//		System.out.println(p.toString());
//		
//		
//		Object o = new Object();//static binding fast complieed 
//		
		
		Object o1;//superclass refrence , Generic refrence 
		o1 = new A_01_Person();//subclass object
		
		Object o2= new A_01_Date();//subclasses object creation
		Object o3= new A_01_Emp();
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		
	}

}
