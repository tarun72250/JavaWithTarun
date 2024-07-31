 package arrayListDemo;

import java.util.*;
import java.util.function.Consumer;

//Arraylist is combo of Array + LinkedList
//elements stored in contignous memory location
//searching will be faster 
//random access is possible 
//by default arraylist create 10 size of array
public class A_02_01ArrayListDemo {

	public static void main(String[] args) 
	{
//		List words ;//Refrence for interface
//		words = new ArrayList();
//		words.add("Hello");
//		words.add(10);
//		words.add(Calendar.getInstance().getTime());
//		
//		System.out.println(((String)words.get(2)).toUpperCase());
//		
		
		List <String> words = new LinkedList<>();
		words.add("Arpit");
		words.add("Sumit");
		words.add("Manas");
		words.add("Hitanshi");
		words.add("Suraj");
		words.add("Rajat");
		words.add("Shiva");
		words.add("Raj");
		
		for(int i=0 ; i<words.size();i++)
		{
			System.out.println(words.get(i));
		}
		
		words.add(2,"Java");//overloaded method
		System.out.println(words);
		
		//create newlist add old one
		List <String> newList = new ArrayList<>();
		newList.add("Web Scrapping");
		newList.add("Web technology");
		newList.add("HTML");
		
		
		words.addAll(newList);
		System.out.println(words);
		
		//delete existing data
		words.remove(2);
		System.out.println(words);
		
		//delete by object
		words.remove("Hitanshi");
		System.out.println(words);
		
		
		//remove newlist
		words.removeAll(newList);
		System.out.println(words);
		
		System.out.println("Element at 5 index :"+words.get(5));
		System.out.println("Length at LinkedList :"+words.size());
		
		
//		words.clear();//for removing the whole list
//		System.out.println(words);
//		
		
		System.out.println("\n **************************Iteration by AdvancedFor loop***************************************");
		for(String s: words)
		{
			System.out.print(s.toUpperCase()+" | ");
		}
		
		System.out.println("\n **************************Iteration by Iterator interface or iterator method***************************************");
		Iterator <String> i = words.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" | ");
		}
		
		
		System.out.println("\n **************************Iteration by ListIterator interface or listIterator method***************************************");
		ListIterator <String> li = words.listIterator(words.size());
		while(li.hasPrevious())
		{
			System.out.print(li.previous()+" | ");
		}
		
		
		System.out.println("\n **************************Iteration by for each method***************************************");
		words.forEach(new Consumer<String>() {
			public void accept(String t)
			{
				System.out.print(t+" | ");
			}
		});
		
		System.out.println("\n **************************Iteration by for each method  y lamba fn***************************************");
		words.forEach(s -> System.out.println(s +" : "+s.length()));
		
		
	}

}
/*
		
		List words; // Interface Refrence
			
		words = new ArrayList();//Object Creation of ArrayList()
		
		words.add("hello");//String
		words.add(45);//int Valus
		words.add(Calendar.getInstance().getTime());//Object
		
		System.out.println(((String)words.get(2)).toUpperCase());
		
		
		List <String> words = new ArrayList<>();
		//words.add(Calendar.getInstance().getTime());
		words.add("Tarun");
		words.add("Mahesh");
		words.add("pratik");
		words.add("ajay");
		words.add("anup");//bigO Notation time complexcity h yha pe 
		words.add("threads");
		words.add("streams");
		words.add("rama");
	    System.out.println("Words Before :"+words);
		List <String> newList = new ArrayList<>();
		
		newList.add("Shivu");
		newList.add("Shivu");
		
		words.addAll(newList);
		
		
		
		 System.out.println("Words After :"+words);
		 words.add(3,"wrapper");//Index based add overloaded method 
		 System.out.println(words);
		 words.remove(2);//Index based removed 
		 System.out.println(words);
		 words.remove("Sumit");//value based remove
		 System.out.println("after remove Sumit :"+words); //toString

		 words.set(2, "naman");//setting at particular index
		 System.out.println(words);
		 System.out.println("Element 5 :"+words.get(5));
		 System.out.println("Total Size : "+words.size());
		 System.out.println("Wrapper is present or not :"+words.contains("wrapper"));
		 
		 
		 
		 words.clear();//for removing the whole list , after my list is empty
		 System.out.println(words);//blanked array after this
		 
		 
		 
		System.out.println("\n******ITERATION BY FOR EACH LOOP UPPERCASE() USE *******");
		//iteration for each loop
		for( String  s:words )  //s represents one element
				System.out.print(s.toUpperCase()+" ");
		System.out.println("\n*************");

		
		System.out.println("\n******ITERATOR INTERFACE OR ITERATOR METHOD*******");
		//iterating using Iterator
		Iterator<String> i= words.iterator();
		while(i.hasNext())//next element true / false
			 System.out.print(i.next()+" ");//print them
		System.out.println("\n*************");
		
		
		System.out.println("\n******LISTITERATOR INTERFACE OR LISTITERATOR METHOD IN REVERSE ORDER*******");
		ListIterator <String> li = words.listIterator(words.size());
		while(li.hasPrevious())//previous element exist return true else false
			System.out.print(li.previous()+" ");//print them
		System.out.println("\n*************");

		words.forEach(
				new Consumer<String>()
				{
					public void accept(String t)
					{
						System.out.print(t+" ");
					}
				}
		);
		System.out.println("\n************CallBACK()**************");
		words.forEach(s -> System.out.print(s + " : "+s.length()+" "));
		System.out.println("\n***************");
		
		
		System.out.println("Collections.sort()");
		Collections.sort(words);
		words.forEach(s -> System.out.println(s));
		
		
		int n = Collections.binarySearch(words, "ajay");
		System.out.println("Index : "+ n);
	
		System.out.println();
		System.out.println("***SHUFFLE***");
		Collections.shuffle(words);
		System.out.println(words);
*/