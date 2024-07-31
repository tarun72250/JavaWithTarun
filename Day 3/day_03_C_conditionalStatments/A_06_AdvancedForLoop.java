package day_03_C_conditionalStatments;
import java.util.ArrayList;
import java.util.List;

public class A_06_AdvancedForLoop 
{
    public static void main(String[] args) 
    {
    	//Using integer array
    	int[] numbers = {1, 2, 3, 4, 5};
    	for (int n : numbers)
    	{
    	    System.out.print(" "+n+"\n");
    	}

    	//Using String array
        List<String> names = new ArrayList();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}