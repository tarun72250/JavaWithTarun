package queueDemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class A_11_PriorityQueueDemo 
{
	public static void main(String[] args)
	{
//		acc  to their ascii value arranged
		Queue<String> queue=new PriorityQueue<>();
		queue.add("int");
		queue.add("double");
		queue.add("float");
		queue.add("char");
		queue.add("long float");
		queue.add("interface");
		queue.add("default");
		queue.add("DOUBLE");
		queue.add("static");
		queue.add("char");
		queue.offer("Nitesh");
		queue.offer("DOUBLE");	
		
		System.out.println("----Printing Order---- ");
		System.out.println(queue);
		
		
//		System.out.println("-----removal sequence------");// acc to their sizes
//		while(!queue.isEmpty())
//		{
//		//	System.out.println(queue.remove()+ " : "+queue.size());
//			System.out.println(queue.poll()+ " : "+queue.size());
//		}
		
		
		// remove the element at the front of the queue
        String front = queue.remove();
        System.out.println("Removed element: " + front);
 
		
        // print the updated queue
        System.out.println("Queue after removal: " + queue);
        
        String front1 = queue.remove();
        System.out.println("Removed element: " + front1);
 
		
        // print the updated queue
        System.out.println("Queue after removal: " + queue);
        
        // add another element to the queue
        queue.add("date");
 
        // peek at the element at the front of the queue
        String peeked = queue.peek();
        System.out.println("Peeked element: " + peeked);
 
        // print the updated queue
        System.out.println("Queue after peek: " + queue);
     
        
        // To remove the head of queue.
        String removedele = queue.remove();
        System.out.println("removed element-"
                           + removedele);
 
        System.out.println(queue);
 
        // To view the head of queue
        String head = queue.peek();
        System.out.println("head of queue-"
                           + head);
 
        // Rest all methods of collection
        // interface like size and contains
        // can be used with this
        // implementation.
        int size = queue.size();
        System.out.println("Size of queue-"
                           + size);
        // add another element to the queue
        queue.add("date");
 
        // add another element to the queue
        queue.add("date");
 
    
	}
}


/*
		
		
		
		
       
 
          
      
*/