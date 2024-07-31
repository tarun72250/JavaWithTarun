package day_13_interfaceAssignment.entities;

public class A_03_Person {

	private String name;
    private int age;
    A_03_Date bdate; //refrence instance variable

   //Default cons
    public A_03_Person() {
	
    	name = "not assigned";
    	age=0;
    	bdate = new A_03_Date();
	}

    //Para cons
	public A_03_Person(String name, int age,int dd, int mm , int yy) {
		this.name = name;
		this.age = age;
		this.bdate = new A_03_Date(dd,mm,yy);
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
