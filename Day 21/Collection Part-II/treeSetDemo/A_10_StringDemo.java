package treeSetDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class A_10_StringDemo 
{
	public static void main(String[] args) 
	{
		//anonymous fn
//		SortedSet<String> name = new TreeSet<>( new Comparator<String>()
//				{
//				public int compare(String s1 , String s2)
//				{
//					int diff = s1.length()-s2.length();
//					if(diff==0)
//					{
//						diff = s1.compareTo(s2);
//					}
//					return diff;
//				}
//				}
//				);
		
		//using lambda function
		SortedSet<String> name = new TreeSet<>((String s1 , String s2) ->
		{
			int diff = s1.length()- s2.length();
			if(diff ==0)
			{
				diff = s1.compareTo(s2);
			}
			return diff;
		}
		);
				
		
		name.add("Nitesh");
		name.add("Pravesh");
		name.add("Vishal");
		name.add("Bk");
		name.add("Nimesh");
		name.add("Naman");
		name.add("Hitanshi");
		//name.add(null); In TreeSet null can't stored
		
		for(String s:name)
		{
			System.out.println(s);
		}
		
	}
}


/*
//		SortedSet<String> name=new TreeSet<>(new Comparator<String>()
//				{
	//			public int compare(String o1,String o2)
	//			{
	//				int diff=o1.length()-o2.length();
	//				if(diff==0)
	//				{
	//					diff=o1.compareTo(o2);
	//				}
	//				return diff;
	//			}
//			});
		
		//using lamba fuction 
		Set<String> name=new TreeSet<>((String s1,String s2)->
		{
			int diff=s2.length()-s1.length();
			if(diff==0)
			{
				diff=s2.compareTo(s1);
			}
			return diff;
		}
				);
		name.add("Anuup");
		name.add("Yoooohan");
		name.add("Prassshant");
		name.add("maheeeeeeeesh");
		name.add("taarun");
		name.add("Prateeek");
		name.add("mayyyur");
		name.add("ajaya");
		
		
		for(String s:name)
			System.out.println(s);

*/