package treeSetDemo;

public class A_08_Emp implements Comparable<A_08_Emp>
{
	
	int eid;
	String name;
	int sal;
	int deptno;
	
	//Default cons
	public A_08_Emp()
	{
		
	}
	
	//Para consS
	public A_08_Emp(int eid,String name,int sal,int deptno)
	{
		this.eid=eid;
		this.name=name;
		this.sal=sal;
		this.deptno=deptno;
	}

	@Override //from Object class
	public String toString() //to display class info 
	{
		return "Emp [eid=" + eid + ", name=" + name + ", sal=" + sal + ", deptno=" + deptno + "]";
	}

	
//	public int compare(A_08_Emp o1, A_08_Emp o2) 
//	{
//		int diff=o1.deptno-o2.deptno;
//		
//		return diff;
//	}
//
//	@Override
//	public int compareTo(A_08_Emp o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	@Override
	public int compareTo(A_08_Emp e) 
	{
		int diff;
		diff=this.deptno-e.deptno;
		
		
		if(diff==0)
		{
			diff=this.sal-e.sal;
			if(diff==0)
			{
				diff=this.name.compareTo(e.name);
				if(diff==0)
				{
					diff = this.eid-e.eid;
				}
			}
		}
		return diff;
	}

	
}

 /*Comparable Functional Interface having one abstract method
 
 public int compareTo(Object o){};


 Comparator Functional Interface having one abstract method
  
 public int compareTo(Object o1 , Object o2){};
 
*/ 

