package mapDemo;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
// arrange in sorted manner according to key
public class A_13_TreeMapDemo {

	public static void main(String[] args) 
	{
	
		Map<String , Integer > m = new TreeMap<>();
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
		Map<Integer,String> map = new TreeMap<>();
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

		
	}

}





























/*

	
*/