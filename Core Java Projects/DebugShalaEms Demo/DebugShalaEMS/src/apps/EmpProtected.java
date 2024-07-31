package apps;

import office.staff.Admin;
import office.staff.Employee;
import office.staff.Programmer;
import office.staff.SalesManager;

public class EmpProtected {

	public static void main(String[] args) 
	{
			int arr[];
			arr= new int [3];
			
			arr[0]= 1;
			arr[1]= 2;
			arr[2]= 3;
			
			
			Employee [] allemp;//refrence array 
			allemp = new Employee[3];
			
			
			allemp[0] = new SalesManager("Suraj",12,11,2024,1001,40000.0f,100000,1000.0f);//salesmanager object created
			allemp[1]= new Programmer("Ishan",9,12,2024,1002,80000.0f,40,1000);//Prog object created
			allemp[2]= new Admin("Manas",8,13,2024,1002,80000.0f,1000);//Admin object created 
			
			
			//whatever we have done here it is called as Polymorphism.
			for(int i=0 ; i<allemp.length;i++)
			{
				double bal = allemp[i].calSallary();
				System.out.println(bal);
				System.out.println("===================");
				//System.out.println(allemp[i]);
			}
			
			
	
	}
}
