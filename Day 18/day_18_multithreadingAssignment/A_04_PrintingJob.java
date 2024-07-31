package day_18_multithreadingAssignment;

public class A_04_PrintingJob implements Runnable
{
	private Thread t;
	private A_04_Printer p;
	private String header , body , footer;
	
	//default cons
	public A_04_PrintingJob()
	{
		t = new Thread(this);
	}
	
	
	//para cons
	public A_04_PrintingJob(A_04_Printer p , String header , String body , String footer )
	{
		super();
		this.p=p;
		this.header= header;
		this.body=body;
		this.footer= footer;
		t = new Thread(this);
	}
	
	//getter method
	public Thread getT()
	{
		return t;
	}
	
	//Printer p = new Printer();
	//p.print();
	
	
	@Override
	public void run()
	{
		p.print(header, body , footer);
	}
	
	
	
}
