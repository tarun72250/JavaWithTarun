package day_07_stringsDemo;

public class A_02_StringBufferClass {

	public static void main(String[] args) {

		/*
		StringBuffer class in Java
		StringBuffer is a class in Java that represents a mutable sequence of characters. It provides an alternative to the immutable String class, allowing you to modify the contents of a string without creating a new object every time.

		Here are some important features and methods of the StringBuffer class:
		The append() method is used to add characters, strings, or other objects to the end of the buffer.
		The insert() method is used to insert characters, strings, or other objects at a specified position in the buffer.
		The delete() method is used to remove characters from the buffer.
		The reverse() method is used to reverse the order of the characters in the buffer
		*/
		StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("DebugShalians");
        String message = sb.toString();
        System.out.println(message);
        
        /*
         Advantages : Mutable:Efficient:Thread-safe:
         */
        //1. append() method
        StringBuffer sb1 = new StringBuffer("Hello ");
        sb1.append("Java"); // now original string is changed
        System.out.println(sb1);//Hello Java
        
        //2. insert() method
        StringBuffer sb2 = new StringBuffer("Good ");
        sb2.insert(5, "Morning");
        // Now original string is changed
        System.out.println(sb2);//Good Morning
        
        //3. replace() method
        StringBuffer sb3 = new StringBuffer("Jaaa aaaaaing");
        sb3.replace(1, 10, "ava Learn");
        System.out.println(sb3);// Java Learning
        
        //4. delete() method
        StringBuffer sb4 = new StringBuffer("DqqqqqqebugShala");
        sb4.delete(1, 7);
        System.out.println(sb4);//DebugShala
        
        //5. reverse() method
        StringBuffer sb5 = new StringBuffer("avaJ gninraeL");
        sb5.reverse();
        System.out.println(sb5);//Learning Java
        
        
}

}
