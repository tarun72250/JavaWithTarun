package arrayListDemo;

import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.*;
public class A_04_ArrayListDemoStrings {

	public static void main(String[] args) 
	{
		List<String> words=new ArrayList<>();
		
		words.add("Tarun");
		words.add("Anup");
		words.add("mahesh");
		words.add("prateek");
		words.add("arjun");
		words.add("abhinav");
		System.out.println(words);//[Tarun, Anup, mahesh, prateek, arjun, abhinav]
		
		//remove Strings
		words.remove(2);
		System.out.println(words);//[Tarun, Anup, prateek, arjun, abhinav]

		
		//add element at index
		words.add(1,"rishi");
		System.out.println(words);//[Tarun, rishi, Anup, prateek, arjun, abhinav]

		
		//get index value
		String ele=words.get(1);
		System.out.println(ele);//rishi
		
		//count of total strings
		System.out.println(words.size());//6
		
		//for loop
		System.out.println("-----for loop---");
		for(int i=0;i<words.size();i++)
		{
			System.out.print(" | "+words.get(i));
		}
		
		
		
		//using advanced for loop
		System.out.println();
		System.out.println("-----Advanced for loop---");
		for(String a: words)
		{
			
			System.out.print(" | "+a);
		}
		
		
		
		//iterating using Iterator
		System.out.println();
		System.out.println("**********************");
		System.out.println("-----using iterartor---");
				Iterator<String> i= words.iterator();
				while(i.hasNext())
					 System.out.print(" | "+i.next());
				System.out.println();
				System.out.println("************************");
				
				
				
		//reverse String 
				System.out.println();
				System.out.println("**********************");
				System.out.println("-----using iterartor reverse string---");
						ListIterator<String> l= words.listIterator(words.size());
						while(l.hasPrevious())
							 System.out.print(" | "+l.previous());
						System.out.println();
						System.out.println("************************");
			
					

		//each words length
		System.out.println("normal display");		
		words.forEach
		(new Consumer<String>() 
		{
			public void accept(String t)
	    	{
				System.out.print(" | "+t);
	    	
	    	}			
		}
		);
		
		
		//length of each string 
			System.out.println();
			System.out.println("*******Length of each string********");
			words.forEach(s -> System.out.println(s+":"+s.length()));
			
			
		
			
			//basic algorithms with their ascii value
			System.out.println("************Sort acc to their asccie value*****************");
			Collections.sort(words);
			words.forEach(s -> System.out.println(s));//lamda function , this is used for pinting 
			
			
			//search value index no
			System.out.println("*********index no**********");
			int n = Collections.binarySearch(words, "prateek");
			System.out.println("Index number : "+ n);
			
			
			//for shuffling our words
			System.out.println("***********************");
			System.out.println(" shuffling words");
			Collections.shuffle(words);
			System.out.print(" | "+words);
			Collections.shuffle(words);
			System.out.print(" | "+words);
			
	}

}
//hw for accepting input from user generate these with like intger
