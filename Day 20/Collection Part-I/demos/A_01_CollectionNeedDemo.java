package demos;

import java.util.*;

// Java program to demonstrate
// why collection framework was needed


public class A_01_CollectionNeedDemo {

	public static void main(String[] args)
	{
		
		int arr [] = {2,3,4,5,6,7};
		System.out.println(arr[0]+" "+arr[3]);

		
		
		
		
		Vector<String> v = new Vector();
		
		v.addElement("a");
		v.addElement("b");
		System.out.println(v);
		System.out.println(v.elementAt(0)+" "+v.elementAt(1));
		
		
		
		
		
		Hashtable<Integer, String > h = new Hashtable();
		h.put(1, "Arpit");
		h.put(2,"Sumit");
		System.out.println(h);
		System.out.println(h.get(1)+" "+h.get(2));
		
		
		
		
		
		
		
	}
}


/*
//Creating instances of the array , vector and hashtable
		int arr [] = new int[] {2 ,3 ,4 , 5, 7};
		
		Vector<Integer>  v = new Vector();
		Hashtable <Integer , String> h = new Hashtable<Integer, String>();
		
		//Adding the elements into the vector
		v.addElement(11);
		v.addElement(22);
		
		//Adding the elements into the hashtable
		h.put(1,"Asfiya");
		h.put(2,"Manas");
		
		// Array instance creation requires [],
		// while Vector and hastable require ()
		// Vector element insertion requires addElement(),
		// but hashtable element insertion requires put()

		// Accessing the first element of the
		// array, vector and hashtable
		System.out.println(arr[0]+" : "+arr[1]+" : "+arr[2]);
		
		System.out.println(v.elementAt(0)+" : "+v.elementAt(1));
		System.out.println(h.get(0)+" : "+h.get(1));
		// Array elements are accessed using [],
		// vector elements using elementAt()
		// and hashtable elements using get()
		
		
*/