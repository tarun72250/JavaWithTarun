package day_06_oopIII;

public class PersonDemoClassUsingAssociation {

	public static void main(String[] args) {
		
		PersonClassUsingAssociation p = new PersonClassUsingAssociation("Sumit",06,02,2024);
		p.display();
		
		PersonClassUsingAssociation p1 = new PersonClassUsingAssociation("Sumit");
		p1.display();
		
		PersonClassUsingAssociation p2 = new PersonClassUsingAssociation(12,12,2024);
		p2.display();
		

	}

}
