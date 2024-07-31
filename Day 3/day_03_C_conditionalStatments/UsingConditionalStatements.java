package day_03_C_conditionalStatments;

public class UsingConditionalStatements {
							//Command line arguement
	public static void main(String [] args)
	{
		int a =7;
		  
		/*System.out.println("If Condition");
	        if (a > 15)
	            System.out.println("Inside If block"); // part of if block(immediate one statement after if condition)
	            System.out.println("10 is less than 15"); //always executes as it is outside of if block
	            // This statement will be executed
	            // as if considers one statement by default again below statement is outside of if block
	        System.out.println("I am Not in if");

	      //if Statement
			if(a%2 == 0)
				System.out.println("No is Even ");
			else
				System.out.println("No is Odd");
		

		System.out.println("\nIf else Condition");
		 if(a==2)
		 {
			System.out.println("No is 2");
			System.out.println("tarun");
		 }
		else
		{
			System.out.println("No is another no.");
			System.out.println("manas");
		}
			
		 
		
		//Nested if statement
		if(a==0)
			System.out.println("No is 0");
		if(a==1)
			System.out.println("No is 1");
		if(a==2)
			System.out.println("No is 2");
		if(a==3)
			System.out.println("No is 3");
		else
			System.out.println("No is not sepcified no");
		
		
		
		//if-else-if statement
		if(a==0)
			System.out.println("No is 0");
		else if(a==1)
			System.out.println("No is 1");
		else if(a==2)
			System.out.println("No is 2");
		else if(a==7)
			System.out.println("No is 7");
		else
			System.out.println("No is not sepcified no");
		*/
		
		//switch-case statement
		int num=5;
        switch(num){
        case 5 :  System.out.println("It is 5");
                  break;
        case 10 : System.out.println("It is 10");
                  break;
        case 15 : System.out.println("It is 15");
                  break;
        case 20 : System.out.println("It is 20");
                  break;
        default:  System.out.println("Not present");     
      }
		
	}

}
