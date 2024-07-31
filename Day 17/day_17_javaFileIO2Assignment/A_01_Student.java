package day_17_javaFileIO2Assignment;

public class A_01_Student {

	 	private String name;
	    private int age;
	    private String address;

	    public A_01_Student()
	    {
	    	
	    }
	    
	    public A_01_Student(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + "\n" + "Age: " + age + "\n" + "Address: " + address;
	    }
}
