package day_11_polymorphismAssignment;

public class A_03_PaperBook extends A_03_Book{

	//Default cons
	public A_03_PaperBook() {

    }

	
	//Para cons
	public A_03_PaperBook(String title, String author, double cost) {
        super(title, author, cost);
    }

    @Override
    public double calculateCost() {
        double originalCost = super.calculateCost();
        if (originalCost <= 500) {
            return originalCost  * 0.02;
        }
        else if (originalCost > 500 && originalCost <= 1000) {
            return originalCost * 1.05;
        }
        else if (originalCost > 1000 && originalCost <= 5000) {
            return originalCost * 1.02;
        }
        else {
            return originalCost;
        }
    }
}
