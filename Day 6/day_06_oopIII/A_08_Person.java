package day_06_oopIII;

public class A_08_Person {
	
		private String name;
		private Date bdate;

	   public A_08_Person()
	   {
		//not assigned name,bdate will be null
		this.name = new String("");
		this.bdate = new Date(); 
	   }
	  
	   public A_08_Person(String name, int dd,int mm,int yy)
	   {
		this.name = new String(name);
		this.bdate = new Date(dd,mm,yy);
	   }	
		
	   public A_08_Person(String name, Date bdate)
	   {
		this.name = name;
		this.bdate = bdate;
	   }

	   public void display()
	   {
		System.out.println("Name : "+name);
		/*if(bdate != null)
		{
		   System.out.println("Birthdate : ");
		   bdate.showDate();
		}*/
		System.out.println("Birthdate : ");
		bdate.showDate();
	   }	

}
