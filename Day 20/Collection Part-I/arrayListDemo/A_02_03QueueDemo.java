package arrayListDemo;

import java.util.LinkedList;
import java.util.Queue;
//The Queue interface is present in java.util package and extends the Collection interface 
//is used to hold the elements about to be processed in FIFO(First In First Out) order.
//It is an ordered list of objects with its use limited to inserting elements at the end of the list and deleting elements from the start of the list, (i.e.), it follows the FIFO or the First-In-First-Out principle.
//https://www.geeksforgeeks.org/queue-interface-java/

public class A_02_03QueueDemo {
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(11);//if the task is succesful return true else throw exception
		queue.offer(12);//jo phele ayge vo phele niklega
		queue.offer(13);//FIFO 
		queue.offer(14);//return true if task is succesful else return false means koi exception throw nhi krega 
		queue.offer(15);
		queue.offer(16);
		queue.offer(17);
		queue.offer(18);
		
		System.out.println("Elements in queue :-"+queue);
		//Elements in queue :-[12, 13, 14, 15, 16, 17, 18]
		

		System.out.println("Removed element :-"+queue.remove());//return and remove the head of the queue, Throws an exception if the queue is empty.
		System.out.println("Removed element :-"+queue.poll());//return and remove the head of the queue, return null if the queue is empty.
		//Removed element :-12
		System.out.println("\n"+queue);
		
		
		
		//[13, 14, 15, 16, 17, 18]
		System.out.println(queue.element());//highest element return ,but if your queue is empty thrown exception.
		System.out.println(queue.peek());//highest element return ,but if queue is empty return null.
		//13
		
		//there are 3 more fn 
	}

}
