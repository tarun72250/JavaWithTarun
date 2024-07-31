package apps;

import office.staff.Admin;
import office.staff.Employee;
import office.staff.Programmer;
import office.staff.SalesManager;
import office.utility.ITraveller;

public class TravellerDemo {

	public static void main(String[] args) {



		Employee [] allemp;//refrence array 
		allemp = new Employee[3];
		
		
		allemp[0] = new SalesManager("Suraj",12,11,2024,1001,40000.0f,100000,1000.0f,12);//12 days for salesmanager , object created
		allemp[1]= new Programmer("Ishan",9,12,2024,1002,80000.0f,40,1000,8);// 8 days for Prog  , object created
		allemp[2]= new Admin("Manas",8,13,2024,1002,80000.0f,1000);//Admin object created 
		
		
		//whatever we have done here it is called as Polymorphism.
		//1 way.
//		for(int i=0 ; i<allemp.length;i++)
//		{
//			double bal = allemp[i].calSallary();
//			System.out.println(bal);
//			System.out.println("===================");
//		}
		
		//2 Way. Advanced for loop
		for(Employee e :allemp)
		{
			//System.out.println("Gross Salary :- "+e.calSallary()+" \n");
			//e.calculateTA(); // arror at compile time
			//System.out.println(((ITraveller) e).calculateTA());//error at runtime time
			
			//condition checking :- type of employee is implements ITraveller so return true else false
			//instanceof operator ;- This operator checks left hand side object can be type casted to right hand side type or not 
			if(e instanceof ITraveller)
			{
				System.out.println(((ITraveller) e).calculateTA());
			}
		}
		
		
		
		
	}

}
