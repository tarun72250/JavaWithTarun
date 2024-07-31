package arrayListDemo;

import java.util.Stack;
//It is a data structure where items can be added and removed in a last-in-first-out(LIFO) manner. 
//Once an item has been placed on the Stack,it will be first element and removed first as well, it can only get removed.
//https://www.boardinfinity.com/blog/stack-class-in-java/#:~:text=Stack%20is%20a%20Java%20class,must%20first%20import%20the%20java.

public class A_02_02StackDemo {
	public static void main(String[] args) 
	{
		Stack<String>	animals = new Stack<>();
		
		animals.push("cat");//bottom element
		animals.push("Lion");
		animals.push("Horse");
		animals.push("Dog");
		animals.push("Giraffe");
		animals.push("Turtle");
		animals.push("Tiger");//top element
		

		System.out.println("Animals :- "+animals);
		
		//top most element
		System.out.println("First element :-"+animals.peek());
		
		//remove
		System.out.println("Remove animal :"+animals.pop());
		System.out.println("Animals :- "+animals);
		animals.push("Fox");
		System.out.println("Animals :- "+animals);

		
		
	}

}


/*
Stack<String> animals = new Stack<>();
		
		animals.push("Lion");//bottom element
		animals.push("Cat");
		animals.push("Horse");
		animals.push("Dog");
		animals.push("Giraffe");
		animals.push("Turtle");
		animals.push("Tiger");//top element
		
		System.out.println("Animals :-"+animals);
		
		//peek() gives top element in stack
		System.out.println("Fist animal :"+animals.peek());
		//pop() remove top element from stack
		System.out.println("Removed Animal :-"+animals.pop());
		System.out.println("Animals :-"+animals);

		

*/