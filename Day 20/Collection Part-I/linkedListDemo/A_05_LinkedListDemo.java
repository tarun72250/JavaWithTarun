package linkedListDemo;

import java.util.LinkedList;
import java.util.List;

public class A_05_LinkedListDemo {

	public static void main(String[] args) 
	{
		List<String> words=new LinkedList<>();
		words.add("hello");
		words.add("object");
		words.add("java");
		words.add("oracle");
		words.add("collection");
		words.add("threads");
		words.add("streams");
		words.add("instance");
		words.add("object");
		
		//Advanced for loop
		for (String s:words)
			System.out.print(" | "+s);
		
		((LinkedList<String>)words).addFirst("Static");
		((LinkedList<String>)words).addLast("Asfiya");
		System.out.println();
		System.out.println("----Newly add----");
		for (String s:words)
			System.out.print(" | "+s);
		
		
//		List<Integer> num=new LinkedList<>();
//		num.add(12);
//		num.add(14);
//		num.add(18);
//		num.add(92);
//		num.add(20);
//		num.add(22);
//		
//		for(Integer n:num)
//			System.out.println(Math.sqrt(n));
//		
		System.out.println("\nInteger Value");
		List<Integer> numbers = new LinkedList<>();
		numbers.add(16); //autoboxing - int value to Integer object
		numbers.add(25);
		numbers.add(196);
		numbers.add(225);
		numbers.add(49);
		
		for(Integer n  : numbers)
			System.out.println(n+" : "+Math.sqrt(n)); //auto-unboxing - Integer object to int value
		
	}

}



