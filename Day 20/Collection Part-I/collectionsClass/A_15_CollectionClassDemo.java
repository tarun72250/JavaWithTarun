package collectionsClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import setDemo.A_06_Student;

public class A_15_CollectionClassDemo {

	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<>();
		l.add(23);
		l.add(83);
		l.add(13);
		l.add(93);
		l.add(83);
		l.add(73);
		l.add(43);
		l.add(29);
		
		System.out.println("min ele"+Collections.min(l));
		System.out.println("min ele"+Collections.max(l));
		
		
		
		
		List<A_06_Student> list = new ArrayList<>();
		list.add(new A_06_Student(101,"Tarun",94.0f,"Indore"));
		list.add(new A_06_Student(102,"Mehak",92.0f,"pune"));
		list.add(new A_06_Student(103,"Asfiya",93.0f,"nashik"));
		list.add(new A_06_Student(104,"Sumir",96.0f,"Indore"));
		list.add(new A_06_Student(105,"Manas",91.0f,"pune"));	
		
		
	}
}
