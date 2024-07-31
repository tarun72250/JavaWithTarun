package arrayListDemo;

import java.util.ArrayDeque;

//Java Deque is a data structure that combines an ordinary Queue and Stack.
//You may add and remove elements both to the head and to the tail of the Deque. 
//The name “Deque” means “Double Ended Queue”. “Deque” is pronounced like a "deck" of cards and you know what?
//using in sliding window technique
public class A_02_DequeDemo {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> adq = new ArrayDeque<>();
		
		adq.offer(23);
		adq.offerFirst(12);
		adq.offerLast(45);
		adq.offer(26);
		

		System.out.println(adq);//[12, 23, 45, 26]

		System.out.println(adq.peekFirst());//12
		System.out.println(adq.peekLast());//26
		
		System.out.println(adq.poll());//12
		System.out.println("poll() :-"+adq);//poll() :-[23, 45, 26]
		
		System.out.println(adq.pollFirst());//23
		System.out.println("pollFirst() :-"+adq);//pollFirst() :-[45, 26]
		
		System.out.println(adq.pollLast());//26
		System.out.println("pollLast() :-"+adq);//pollLast() :-[45]

		
	}
}
