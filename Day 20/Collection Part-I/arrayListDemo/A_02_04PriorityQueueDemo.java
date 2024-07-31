package arrayListDemo;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

//useful for meanheap() calculate and maxheap() calculation
//u implement queue but u give priority as well
//photocopy machine shop
//It is known that a Queue follows the First-In-First-Out algorithm, 
//but sometimes the elements of the queue are needed to be processed according to the priority,
//that’s when the PriorityQueue comes into play.
//https://www.geeksforgeeks.org/priority-queue-class-in-java/

public class A_02_04PriorityQueueDemo {

	public static void main(String[] args) {
		
		//although Queue implements PriorityQueue also have same mrthod which have common in Queue
//		Queue <Integer> pq = new PriorityQueue<>();
//		
//		pq.offer(10);
//		pq.offer(80);
//		pq.offer(60);
//		pq.offer(50);
//		pq.offer(20);
//		pq.offer(30);
//		
//		System.out.println("Elements in PriorityQueue :-"+pq);
//		Elements in PriorityQueue :-[10, 20, 30, 80, 50, 60]
//
//		pq.poll();//remove which is smallest element 
//		
//		System.out.println(pq);
//		[20, 50, 30, 80, 60]
//		System.out.println(pq.peek());//20
//		
		//which set your priority in highest order(maxheap implement)
		Queue <Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
		
		pq.offer(10);
		pq.offer(80);
		pq.offer(60);
		pq.offer(50);
		pq.offer(20);
		pq.offer(30);
		
		System.out.println("Elements in PriorityQueue :-"+pq);
		//Elements in PriorityQueue :-[80, 50, 60, 10, 20, 30]
		
		pq.poll();//remove which is smallest element 
		//[60, 50, 30, 10, 20]
		System.out.println(pq);
		
		System.out.println(pq.peek());
		//60

		
	}
}
