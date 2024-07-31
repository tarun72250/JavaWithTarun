package queueDemo;

import java.util.ArrayDeque;
import java.util.Queue;

//we use this class to implement queue and deque data structure using arrays.
//this class implements these two interfaces
//Java Queue Interface
//Java Deque Interface

//Methods :
//THis class provides implementations for all the methods present in Queue and Deque interface.

//add()
//addFirst()
//addLast()
//getFirst()
//getLast()
//peek()
//peekFirst()
//peekLast()

public class A_11_A_ArraydDeque {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> ad  = new ArrayDeque<>();
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		
		System.out.println(ad);
		ad.addFirst(10);
		System.out.println(ad);
		ad.addLast(70);
		System.out.println(ad);
		
		
		System.out.println("Fiorst Element :"+ad.getFirst());
		System.out.println("Last element :"+ad.getLast());
		
		
		System.out.println("Top most element :-"+ad.peek());
		
		ad.poll();
		System.out.println(ad);
		
		System.out.println(ad.element());
		
		System.out.println(ad.hashCode());
		
		
		ad.offer(80);
		System.out.println(ad);
		
		
		
	}
}


/*
ArrayDeque<Integer> ad = new ArrayDeque<>();
		ad.add(20);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(60);
		ad.add(70);
		ad.addFirst(10);
		ad.addLast(80);
		
		System.out.println("Elements"+ad);
		System.out.println("remove First element :-"+ad.poll());	
		System.out.println("After removing Elements"+ad);
		System.out.println("remove First element :-"+ad.pollFirst());	
		System.out.println("After removing Elements"+ad);
		System.out.println("remove Last element :-"+ad.pollLast());	
		System.out.println("After removing Elements"+ad);
		
		
		System.out.println("First element :- "+ad.peek());
		System.out.println("Last element :- "+ad.peekLast());
		
*/