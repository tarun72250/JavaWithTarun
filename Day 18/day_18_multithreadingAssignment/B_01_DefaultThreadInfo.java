package day_18_multithreadingAssignment;

//Show the name and priority of the default thread in a Java application.
public class B_01_DefaultThreadInfo 
{
    public static void main(String[] args) 
    {
<<<<<<< HEAD
    
    	
    	Thread t = Thread.currentThread();
    	System.out.println("Thread name :- "+t.getName());
    	System.out.println("Thread Priority :- "+t.getPriority());
    	
    	
    	
    }
}
 
=======
        Thread defaultThread = Thread.currentThread();
        System.out.println("Thread Name: " + defaultThread.getName());
        System.out.println("Thread Priority: " + defaultThread.getPriority());
    }
}
>>>>>>> b1affeeedf5b320f66b7032471a5395449274ec1
