package day_11_polymorphismAssignment;

public class A_01_Person {

	private String name;
    private int age;
    A_01_Date bdate; //refrence instance variable

   //Default cons
    public A_01_Person() {
	
    	name = "not assigned";
    	age=0;
    	bdate = new A_01_Date();
	}

    //Para cons
	public A_01_Person(String name, int age,int dd, int mm , int yy) {
		this.name = name;
		this.age = age;
		this.bdate = new A_01_Date(dd,mm,yy);
	}

	//instance member method
	public void display() {
		bdate.showDate();
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", bdate=" + bdate.toString() + "]";
	}
    
    
}
