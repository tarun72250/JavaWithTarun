package day_12_abstractAssignment;

public class A_01_EmpTypesDemo {

	public static void main(String[] args) {
	
		A_01_Emp [] allemp;
		allemp = new A_01_Emp[3];//creating array object 
		allemp[0]=new A_01_SalesManager("Hitanshi",23,11,11,1111,101,20000.0f,10000,1000.0f);
		allemp[1]=new A_01_Programmer("Hemant",23,12,12,1222,102,10000.0f,2,400);
		allemp[2]=new A_01_Admin("Sumit",23,11,13,1444,103,50000.0f,2000.0f);

		//whatever we have done here is called as polymorphism
		//for calSalary()
				for(int i=0 ; i<allemp.length ; i++)
				{
					System.out.println(allemp[i]);
					System.out.println("Final Salary :"+allemp[i].calSalary());//allemp[i].toString();
					System.out.println("---------------------------------");
				}
	}

}
