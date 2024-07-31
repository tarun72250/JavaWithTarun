package apps;

import office.utility.Person;

public class PersonDemo {

	public static void main(String[] args) {
		
		Person p = new Person("Suraj",12,11,2024);
		p.display();
	
		
		//Calling toString() method
		String result = p.toString();
		System.out.println(result);
		
		System.out.println(p.toString());
		
		System.out.println(p);
	}
}
