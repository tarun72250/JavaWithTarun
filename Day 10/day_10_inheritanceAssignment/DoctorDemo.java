package day_10_inheritanceAssignment;

public class DoctorDemo {

	public static void main(String[] args) {
		
		Doctor doctor = new Doctor("Hemant", 21, "MD", 2323, 100000.0);
        System.out.println(doctor.toString());
        System.out.println();
        doctor.display();
        

	}

}
