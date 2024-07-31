package day_13_interfaceAssignment.entities;

import day_13_interfaceAssignment.utils.A_04_Comparer;

public class A_04_NameComparer implements A_04_Comparer{

	 @Override
	    public int compare(Object o1, Object o2) {
		 A_04_Student s1 = (A_04_Student) o1;
		 A_04_Student s2 = (A_04_Student) o2;
	        return s1.getName().compareTo(s2.getName());
	    }
}
