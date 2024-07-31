package treeSetDemo;

import java.util.Comparator;

class A_09_Employee
{
	int eid;
	String name;
	int sal;
	
	
	public A_09_Employee() 
	{
		super();
	}


	public A_09_Employee(int eid, String name, int sal) 
	{
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + "]";
	}

	
//	 @Override
//	 public int compareTo(A_09_Employee o) {
//	        return o.sal - this.sal; // Descending order by salary
//	 }

}

//If we implements Comparator
class EmployeeComparator implements Comparator<A_09_Employee> 
{
    @Override
    public int compare(A_09_Employee o1, A_09_Employee o2) {
        // Your sorting logic here (e.g., by salary in descending order)
        return o2.sal - o1.sal; // Descending order by salary
    }
}
