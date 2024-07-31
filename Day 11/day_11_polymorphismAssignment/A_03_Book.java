package day_11_polymorphismAssignment;

public class A_03_Book {

	 	private String title;
	 	private String author;
	 	private double cost;//instance dm

	 	//Default cons
	 	public A_03_Book() {
	        
	    }
	 	
	 	//Para cons
	    public A_03_Book(String title, String author, double cost) {
	        this.title = title;
	        this.author = author;
	        this.cost = cost;
	    }

	    
	    
	    public double calculateCost() {
	        return cost;
	    }

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
