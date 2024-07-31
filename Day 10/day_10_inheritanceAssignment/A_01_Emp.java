package day_10_inheritanceAssignment;

public class A_01_Emp extends A_01_Person {

		//extra dm 
		private  int empid;
		private double salary;
		
		//Default cons in sub class 
		public A_01_Emp()
		{
			super();//this will be your first statement
			this.empid=0;
			this.salary=0;
		}

		//Parametrized constructor
	    public A_01_Emp(String name, int age, int empid, double salary) {
	        super(name, age);//this super will becomes 1st
	        this.empid = empid;
	        this.salary = salary;
	    }

	    @Override
	    public void display() {
	        super.display();
	        System.out.println("Employee ID: " + empid);
	        System.out.println("Salary: $" + salary);
	    }

		@Override
		public String toString() {
			System.out.println( super.toString());
			return "Emp [empid=" + empid + ", salary=" + salary + "]";
		}
	    
	    
}
