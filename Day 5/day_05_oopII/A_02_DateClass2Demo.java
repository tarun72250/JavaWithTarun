package day_05_oopII;

public class A_02_DateClass2Demo {

	public static void main(String[] args) {
		
		//Default cons calling
		A_02_DateClass2 d = new A_02_DateClass2(11,11,1111);
		d.display();
		
		//Parametrized cons calling
		A_02_DateClass2 d1 = new A_02_DateClass2(d);
		d1.display();	
		
		if(d==d1)//here we using new operator  to create both objects so , they are referring differnt values in heap.
			System.out.println("Same");
		else
			System.out.println("Diff");
		
		
		
		
		//Default cons calling
		A_02_DateClass2 d3= new A_02_DateClass2(11,11,1111);
				
		//Parametrized cons calling
		A_02_DateClass2 d4 = d3;
		
		if(d3==d4)//here we using new operator  to create both objects so , they are referring differnt values in heap.
			System.out.println("Same");
		else
			System.out.println("Diff");
		
		
		
		
				//method overloading
				A_02_DateClass2 d5 = new A_02_DateClass2(11,11,2023);
				d5.display('/');;
				
	}

}
