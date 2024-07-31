package treeSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class A_09_Employeedemo {

	public static void main(String[] args)
	{
		//1.way
		//Logic of Comparator implements here 
		//or Lambda Function
//		Set<A_09_Employee> set = new TreeSet<>(
//		(A_09_Employee o1 , A_09_Employee o2)->
//		{
//			int diff ;
//			diff = o2.sal-o1.sal;
//			if(diff == 0  )
//			{
//				diff = o1.name.compareTo(o2.name);
//				if(diff == 0)
//				{
//					 diff = o1.eid - o2.eid; // Use employee ID for uniqueness
//				}
//			}
//			return diff;
//		});

		
			//2.way
			Set<A_09_Employee> set = new TreeSet<>(new EmployeeComparator());

			//()->{};
			
			//this sorting only based by sallery thats y other duplicates records will removed.
			set.add(new A_09_Employee(101,"Nitesh",200000));
			set.add(new A_09_Employee(102,"Pravesh",200000));
			set.add(new A_09_Employee(103,"Arpit",300000));
			set.add(new A_09_Employee(104,"Vishal",300000));
			set.add(new A_09_Employee(105,"Balkrishna",400000));
			set.add(new A_09_Employee(106,"Hemant",400000));
			
			
			for( A_09_Employee e:set)
			{
				System.out.println(e);
			}
			//()->{}  arrow fn
		
		
}
}


/*


Set<A_09_Employee> emp=new TreeSet<>
		(
		(A_09_Employee o1, A_09_Employee o2)->
			{
				int diff;
				diff=o2.sal-o1.sal;
					if(diff==0) 
					{
						diff=o1.name.compareTo(o2.name);
					}
				return diff;
			}
		);
		emp.add(new A_09_Employee(99,"tarun",2000));
		emp.add(new A_09_Employee(100,"anup",2000));
		emp.add(new A_09_Employee(12,"mahesh",35000));
		emp.add(new A_09_Employee(100,"mayur",35000));
		emp.add(new A_09_Employee(98,"prateek",35000));
		emp.add(new A_09_Employee(120,"nikhil",4000));
		
		for(A_09_Employee e:emp)
			System.out.println(e);
*/