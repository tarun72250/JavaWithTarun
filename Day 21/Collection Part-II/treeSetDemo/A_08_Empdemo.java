package treeSetDemo;

import java.util.Set;
import java.util.TreeSet;

public class A_08_Empdemo {
	public static void main(String[] args) 
	{
		Set <A_08_Emp> set = new TreeSet<>();
		set.add( new A_08_Emp(109 , "Naman", 200000,30));
		set.add( new A_08_Emp(112 , "Arpit", 300000,10));
		set.add( new A_08_Emp(111 , "Balkrishna", 400000,20));
		set.add( new A_08_Emp(104 , "Naman", 500000,30));
		set.add( new A_08_Emp(106 , "Arpit", 300000,10));
	
		
		for(A_08_Emp e :set)
		{
			System.out.println(e);
		}
	}
}
/*
Set<Integer> s=new TreeSet<>();
		s.add(12);
		s.add(11);
		s.add(14);
		s.add(18);
		s.add(13);
		
		System.out.println(s);//toSting() call

		System.out.println(s.contains(20));//false
		
		System.out.println(s.isEmpty());//false
		
		System.out.println(s.size());//5s
		
		Set<A_08_Emp> a=new TreeSet<>();
		a.add(new A_08_Emp(100,"tarun",20000,20));
		a.add(new A_08_Emp(120,"anup",35000,10));
		a.add(new A_08_Emp(121,"anup",35000,10));
		a.add(new A_08_Emp(140,"mahesh",35000,10));
		a.add(new A_08_Emp(80,"mayur",30000,10));
		a.add(new A_08_Emp(60,"prateek",15000,20));
		a.add(new A_08_Emp(140,"nikhil",35000,10));
		
		for(A_08_Emp e:a)
			System.out.println(e);


*/