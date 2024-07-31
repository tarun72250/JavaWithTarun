package mapDemo;

import java.util.LinkedHashMap;

//The LinkedHashMap Class is just like HashMap with an additional feature of maintaining an order of elements inserted into it. 
//HashMap provided the advantage of quick insertion, search, 
//and deletion but it never maintained the track and order of insertion,
//which the LinkedHashMap provides where the elements can be accessed in their insertion order. 
//https://www.geeksforgeeks.org/linkedhashmap-class-in-java/

public class A_14_LinkedHashMap 
{

	public static void main(String[] args) 
	{
		
		LinkedHashMap<String, String> lhm = new LinkedHashMap<>();
		lhm.put("one", "tarun");
		lhm.put("two", null);
		lhm.put(null, null);
		lhm.put("one", null);
		
		// Printing all entries inside Map 
        System.out.println(lhm); 
  
        // Note: It prints the elements in same order 
        // as they were inserted 
  
        // Getting and printing value for a specific key 
        System.out.println("Getting value for key 'one': "
                           + lhm.get("one")); 
  
        // Getting size of Map using size() method 
        System.out.println("Size of the map: "
                           + lhm.size()); 
		
        
        // Checking whether Map is empty or not 
        System.out.println("Is map empty? "
                           + lhm.isEmpty()); 
  
        // Using containsKey() method to check for a key 
        System.out.println("Contains key 'five'? "
                           + lhm.containsKey("five")); 
  
		
        // Removing entry using remove() method 
        System.out.println("delete element 'one': "
                           + lhm.remove("one")); 
  
        // Printing mappings to the console 
        System.out.println("Mappings of LinkedHashMap : "
                           + lhm);
	}
}


/*
// Creating an empty LinkedHashMap 
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>(); 
  
        // Adding entries in Map 
        // using put() method 
        lhm.put("one", "Tarun"); 
        lhm.put("two", "Sumit"); 
        lhm.put("four", "Aakash"); 
  
        
  
      
  
      

*/