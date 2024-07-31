package mapDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
//https://www.geeksforgeeks.org/map-interface-java-examples/
public class A_12_HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> m = new HashMap<>();
		m.put(10,"Nitesh");
		m.put(11,"Pravesh");
		m.put(12,"Jitesh");
		m.put(13,"Gitesh");
		m.put(14,"Sukesh");
		m.put(15,"Nivesh");
		m.put(17,"Nilesh");
		m.put(18,"Rajesh");
		
		System.out.println(m);
		
		
//		for(int i=0; i<m.size();i++)
//		{
//			System.out.println(m.get(i));
//		}
		
		
		
		for(Map.Entry<Integer, String> e : m.entrySet())
		{
			System.out.println(e);
			System.out.println();
			System.out.println(e.getKey()+" : "+e.getValue());
		}
	
		
		
	}

}


/*
	Map<String , Integer > m = new HashMap<>();
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
		
		m.put("Two", 23);
		
		if((!m.containsKey("Two")))
		{
			m.put("Two", 43);
		}
		
		for(Map.Entry<String, Integer> e :m.entrySet())
		{
			System.out.println(e);
			
			System.out.println(e.getKey()+" "+e.getValue());
		}

		System.out.println(m);
		Map<Integer,String> map = new HashMap<>();
		map.put(12, "Amit");
		map.put(21, "Jivan");
		map.put(23, "Sheela");
		map.put(67, "Maya");
		map.put(54, "Meena");
		map.put(45, "Dipak");
		map.put(21, "Priya");
		map.put(11, "Amit");
		
		System.out.println(map);//toString();
		Set<Map.Entry<Integer,String>> set = map.entrySet();
		//for-each
		for(Map.Entry<Integer,String> me  : map.entrySet())
			System.out.println(me.getKey()+" : "+me.getValue());
		
		
		
		
		System.out.println("******************");
		Iterator<Entry<Integer,String>> i = set.iterator();
		while(i.hasNext())
		{
			Entry<Integer,String> e = i.next();
			System.out.println(e.getKey()+" : "+e.getValue());
		}


*/