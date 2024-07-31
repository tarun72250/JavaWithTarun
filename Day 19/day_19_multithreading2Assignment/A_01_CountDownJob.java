package day_19_multithreading2Assignment;

public class A_01_CountDownJob implements Runnable  //1
{
<<<<<<< HEAD
	//2 create Thread instance as well 
	private Thread t;
	
=======
	//2
	private Thread t;
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
	private int num;
	private String name;
	
	//default cons
	public A_01_CountDownJob()
	{
<<<<<<< HEAD
		//3 
		t = new Thread(this);
	}
	
	
=======
		//3
		t = new Thread(this);
	}
	
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
	//para cons
	public A_01_CountDownJob(String name,int num)
	{
		this.name = name;
		this.num = num;
		//3
		t = new Thread(this);
	}	
	
	//return instance 
	public Thread getT() {
		return t;
	}

	@Override
	public void run() {
		while(num > 0)
		{
			System.out.println(name+" counting : "+num);
			num--;
		}
	}

}
