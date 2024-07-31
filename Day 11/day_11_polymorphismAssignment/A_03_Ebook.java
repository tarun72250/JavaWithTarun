package day_11_polymorphismAssignment;

public class A_03_Ebook extends A_03_Book{

		 public A_03_Ebook() {
		    }
		 
		 public A_03_Ebook(String title, String author, double cost) {
		        super(title, author, cost);
		    }

	    @Override
	    public double calculateCost() {
	        double originalCost = super.calculateCost();
	        if (originalCost <= 500) 
	        {
	            return originalCost  * 0.02;
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
