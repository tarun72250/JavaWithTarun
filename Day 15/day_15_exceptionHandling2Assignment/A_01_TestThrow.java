package day_15_exceptionHandling2Assignment;

public class A_01_TestThrow {  

	//defining a method  
    public static void checkNum(int num) 
    {  
        if (num < 1) 
        {  
            throw new ArithmeticException("\nNumber is negative, cannot calculate square");  
        }  
        else 
        {  
            System.out.println("Square of " + num + " is " + (num*num));  
        }  
    }  
    
    //main method  
    public static void main(String[] args)
    {  
            A_01_TestThrow obj = new A_01_TestThrow();  
            obj.checkNum(-3);  
            System.out.println("Rest of the code..");  
    }  
}  