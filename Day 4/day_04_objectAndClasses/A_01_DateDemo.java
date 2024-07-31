package day_04_objectAndClasses;

public class A_01_DateDemo {
	
	public static void main(String []args)
	{		
		
		A_01_Date d ;//refrence variable 
		d = new A_01_Date();//d is object-using new allocating memory on heap and calls concrtuctor
		d.showDate();//caling appropriate method
		
	
		
	}

}

/*
 
	A_01_Date d2 = new A_01_Date(22,12,2024);
		d2.showDate();
		
		A_01_Date d3 = new A_01_Date(11,22);
		d3.showDate();
		
		A_01_Date d4 = new A_01_Date(11);
		d4.showDate();
		
		
		
		
		System.out.println("Refrence Equality Checks");
		if(d==d2)//different
			System.out.println("Same");
		else
			System.out.println("diff");
		
		
		
		
		A_01_Date d5 = new A_01_Date();
		A_01_Date d6 = new A_01_Date(d2);
		
		if(d2==d3)//different
			System.out.println("Same");
		else
			System.out.println("diff");
		
		
		
		
		A_01_Date d7 =d6;
		if(d7==d6)//Same
			System.out.println("Same");
		else
			System.out.println("diff");
		
		
		
		System.out.println("Value equality Checks");
		int n=10,m=12;
		String result = (n == m) ? "Same" : "Different";
		System.out.println(result);
		
		int n1=10,m1=10;
		String result1 = (n1 == m1) ? "Same" : "Different";
		System.out.println(result1);
*/