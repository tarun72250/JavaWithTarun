package day_10_inheritanceAssignment;

public class Person {

	private String name;//instance dm , state , feilds 
    private int age;

    //Default Constructor
    public Person()
    {
    	name="not assigned";
    	age=0;
    }
    
    //Parametrized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Instance Method , 
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
