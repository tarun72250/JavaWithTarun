package day_12_abstractAssignment;

public class A_02_PaperBook extends A_02_Book{
	
	
	public A_02_PaperBook() {

    }

	public A_02_PaperBook(String title, String author, double cost) {
        super(title, author, cost);
    }

    @Override
    public double calculateCost() {
        double originalCost = cost;
        if (originalCost <= 500) {
            return originalCost + 706;
        } else if (originalCost > 500 && originalCost <= 1000) {
            return originalCost * 1.05;
        } else if (originalCost > 1000 && originalCost <= 5000) {
            return originalCost * 1.02;
        } else {
            return originalCost;
        }
    }
}
