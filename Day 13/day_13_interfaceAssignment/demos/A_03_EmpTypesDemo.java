package day_13_interfaceAssignment.demos;

import day_13_interfaceAssignment.entities.*;
public class A_03_EmpTypesDemo {

	public static void main(String[] args) {

		A_03_Emp [] allemp;
		allemp = new A_03_Emp[3];//creating array object 
		allemp[0]=new A_03_SalesManager("Asfiya",23,11,11,1111,101,20000.0f,10000,1000.0f);
		allemp[1]=new A_03_Programmer("Manas",23,12,12,1222,102,10000.0f,2,4);
		allemp[2]=new A_03_Admin("Sumit",23,11,13,1444,103,50000.0f,2000.0f);
		//whatever we have done here is called as polymorphism
		for(int i=0 ; i<allemp.length ; i++)
		{
			allemp[i].display(); 
			//same msg given to common entity but it is implemented differently in different types of entities
			//ex:- cricket match when refry says start every player acts as different role.
			System.out.println("---------------------------------");
		}
	}
	

}
