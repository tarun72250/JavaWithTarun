package day_06_oopIII;

public class Account1Demo {

	public static void main(String[] args) {
	
		Account1 a = new Account1();
		a.display();
	
		Account1 a1 = new Account1(1001,20000);
		a1.display();
		
		Account1.updateRate(5.5f);
		
		Account1 a2 = new Account1();
		a2.display();
	
		Account1 a3 = new Account1(1001,20000);
		a3.display();
	}

}
