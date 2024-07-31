package day_15_exceptionHandling2Assignment;

public class A_02_TestThrows 
{  
    //defining a method  
    public static int divideNum(int m, int n) throws ArithmeticException 
    {  
        int div = m / n;  
        return div;  
    }
    
    //main method  
    public static void main(String[] args) 
    {  
        A_02_TestThrows obj = new A_02_TestThrows();  
//        try 
//        {  
            System.out.println(obj.divideNum(45, 0));  
//        }  
//        catch (ArithmeticException e)
//        {  
//            System.out.println("\nNumber cannot be divided by 0");  
//        }  
          
        System.out.println("Rest of the code..");  
    }  
}  