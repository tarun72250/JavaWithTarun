package day_10_inheritanceAssignment;

public class A_04_DoctorDemo {

	public static void main(String[] args) {
		
		A_04_Doctor a_04_Doctor = new A_04_Doctor("Hemant", 21, "MD", 2323, 100000.0);
        System.out.println(a_04_Doctor);
        System.out.println();
        a_04_Doctor.display();
        
        System.out.println();
        A_04_Doctor a = new A_04_Doctor("Sumit", 21 ,"MD", 2121,100000);
        System.out.println(a);
        System.out.println();
        a.display();

	}

}
