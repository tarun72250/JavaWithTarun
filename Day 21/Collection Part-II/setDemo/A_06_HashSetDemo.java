package setDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//in set duplicates are not allowed
//order is not defined here 
//example bag 
//random order gives
//internally using hashing concept
public class A_06_HashSetDemo 
{
	public static void main(String[] args) 
	{
		
		
		Set<A_06_Student> s = new HashSet<>();
		s.add(new A_06_Student(101,"Nitesh",94.0f,"pune"));
		s.add(new A_06_Student(102,"Mehak",92.0f,"pune"));
		s.add(new A_06_Student(103,"Asfiya",93.0f,"nashik"));
		s.add(new A_06_Student(104,"Sumir",96.0f,"Indore"));
		s.add(new A_06_Student(105,"Manas",91.0f,"pune"));
		s.add(new A_06_Student(106,"Farhan",92.0f,"Indore"));
		s.add(new A_06_Student(107,"Mahesh",98.0f,"mumbai"));
		s.add(new A_06_Student(108,"Nikhil",94.0f,"mumbai"));
		s.add(new A_06_Student(109,"Anup",92.0f,"nashik"));
		s.add(new A_06_Student(110,"Asfiya",93.0f,"nashik"));
		s.add(new A_06_Student(111,"Sumir",96.0f,"Indore"));
		s.add(new A_06_Student(112,"Manas",91.0f,"pune"));
		s.add(new A_06_Student(113,"Farhan",92.0f,"Indore"));
		s.add(new A_06_Student(114,"Mahesh",98.0f,"mumbai"));
		s.add(new A_06_Student(115,"Nikhil",94.0f,"mumbai"));
		s.add(new A_06_Student(116,"Anup",92.0f,"nashik"));
		
//		//advanced for loop
//		for(A_06_Student stu :s)
//		{
//			System.out.println(stu);
//		}
		
		
		Set<Integer> numbers = new HashSet<>();
		numbers.add(10);//3ry3r783
		numbers.add(50);//y4r84y
		numbers.add(20);//jen49
		numbers.add(30);//409u34jkreng84
		numbers.add(40);//48ty3484
		numbers.add(50);//does not allow duplicate it override 
		
		System.out.println(numbers);
		
		System.out.println(numbers.contains(20));
		
		System.out.println(numbers.isEmpty());
		
		//numbers.clear();
		
		//
		Iterator<Integer> i = numbers.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}

/*

Set <Integer> numbers = new HashSet<>();
		numbers.add(10);
		numbers.add(50);//asskcdsjk
		numbers.add(20);//snjsdjdskj hashing internally used 
		numbers.add(30);//reason why no are random
		numbers.add(20);//no duplicates are allowed
		numbers.add(40);
		
		System.out.println(numbers);//toSting() call

		System.out.println(numbers.contains(20));//true
		
		System.out.println(numbers.isEmpty());//false
		
		System.out.println(numbers.size());//5
		
		numbers.clear();
		
		//advanced for loop 
		for(int n :numbers)
		{
			System.out.println(n);
		}
		
		
		//Iterator() 
		Iterator <Integer> it = numbers.iterator();
		
		while(it.hasNext())
		{
			System.out.println( it.next());
		}
		
		//for this HashSet implementation we need to implements Comparable<Student> or public int hashCode() method
		Set <A_06_Student> s = new HashSet<>();
		s.add(new A_06_Student(101,"Tarun",94.0f,"Indore"));
		s.add(new A_06_Student(102,"Mehak",92.0f,"pune"));
		s.add(new A_06_Student(103,"Asfiya",93.0f,"nashik"));
		s.add(new A_06_Student(104,"Sumir",96.0f,"Indore"));
		s.add(new A_06_Student(105,"Manas",91.0f,"pune"));
		s.add(new A_06_Student(106,"Farhan",92.0f,"Indore"));
		s.add(new A_06_Student(107,"Mahesh",98.0f,"mumbai"));
		s.add(new A_06_Student(108,"Nikhil",94.0f,"mumbai"));
		s.add(new A_06_Student(109,"Anup",92.0f,"nashik"));
		
		//advanced for loop
		for(A_06_Student stu :s)
		{
			System.out.println(stu);
		}
*/