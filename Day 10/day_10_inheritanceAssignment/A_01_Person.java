package day_10_inheritanceAssignment;

public class A_01_Person {

	private String name;//instance dm , state , feilds 
    private int age;

    //Default Constructor
    public A_01_Person()
    {
    	
    }
    
    //Parametrized constructor
    A_01_Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Instance Member Method , 
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


    // for doctor class this method is create
    @Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
