package day_06_oopIII;

public class PublisherDemo {

	public static void main(String[] args) {
		
		Publisher p =new Publisher();//default cons calling
		p.display();
		
		Publisher p1 =new Publisher(101,"Amit rohra","Pune");//para caling
		p1.display();
		
		//getter used 
		//1 way
		System.out.println(p1.getPubid());
		//2 way
		int pid = p1.getPubid();
		System.out.println("Pub id using getter(): "+pid);
		
		
		//Setter used
		p1.setPubid(201);
		System.out.println(p1.getPubid());
		
	}

}
