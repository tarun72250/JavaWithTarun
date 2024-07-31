package day_12_abstractAssignment;

public class A_02_Ebook extends A_02_Book{

	 public A_02_Ebook() {
	    }
	 
	 public A_02_Ebook(String title, String author, double cost) {
	        super(title, author, cost);
	    }

 @Override
 public double calculateCost() {
     double originalCost = cost;
     if (originalCost <= 500) 
     {
         return originalCost - 296;
     }
     else if (originalCost > 500 && originalCost <= 1000) 
     {
         return originalCost * 0.95;
     } 
     else if (originalCost > 1000 && originalCost <= 5000)
     {
         return originalCost * 0.93;
     } 
     else 
     {
         return originalCost;
     }
 }
 
}
