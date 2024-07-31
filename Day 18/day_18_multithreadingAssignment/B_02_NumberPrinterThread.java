
package day_18_multithreadingAssignment;
//2. Create a thread to print numbers from 1 to 5, with a 500 ms sleep between prints. 
//Use Thread class .

public class B_02_NumberPrinterThread extends Thread 
{
    public void run() 
    {
        for (int i = 1; i <= 5; i++) 
        {
            System.out.println(i);
            try 
            {
                Thread.sleep(500);
            } 
            catch (InterruptedException e) 
            {
                System.err.println("Thread interrupted: " + e.getMessage());
            }
        }
    }

   
}
