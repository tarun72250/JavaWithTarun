package day_10_inheritanceAssignment;

public class A_01_EmpDemo {

	public static void main(String[] args) {
		 // Creating a Person object
        A_01_Person a_01_Person = new A_01_Person("Amit", 30);
        System.out.println("Displaying Person information only using Person class :");
        a_01_Person.display();
        System.out.println();

        // Creating an Emp (Employee) object
        A_01_Emp e = new A_01_Emp("Sumit", 25, 1001, 50000.0);
        System.out.println("Displaying Employee information using inheritance Emp class and Person class :");
        e.display();
        System.out.println();
        System.out.println("toString() Call : "+e);

        System.out.println("\nCalling default cons");
        A_01_Emp e1 =new A_01_Emp();
        e1.display();
        
        
        System.out.println("\nDisplaying Employee as a Person");
        //Super class refrence refers to to subclass obj
        //empAsPerson called as generic refrence. 
        A_01_Person empAsPerson = new A_01_Emp("Ishan", 25, 1001, 50000.0);
        //sub class refrence can not refer to super class obj.
        //Emp e = new Person();//not possible 
        // Call display method
        System.out.println( empAsPerson.toString());//dynamic binding , calls method from obj
       
        // Check whether display method gets called from Person or Emp
        // Since display() is overridden in Emp class, it will call the display() method of Emp class
        // even though the reference is of Person type
	}

}
