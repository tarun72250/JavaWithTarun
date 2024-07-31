package day_12_abstractAssignment;

public abstract class A_02_Book {

	private String title;
 	private String author;
 	protected double cost;

 	public A_02_Book() {
        
    }
 	
    public A_02_Book(String title, String author, double cost) {
        this.title = title;
        this.author = author;
        this.cost = cost;
    }

    public abstract double calculateCost();

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public double getCost() {
		return cost;
	}

	
}
