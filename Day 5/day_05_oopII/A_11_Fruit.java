package day_05_oopII;

public class A_11_Fruit {
	
	private String fruitName;
	private boolean isSedded;
	private char vitamin;
	
	public A_11_Fruit(String fruit , boolean sedded , char vit)
	{
		this.fruitName=fruit;
		this.isSedded=sedded;
		this.vitamin=vit;
	}
	
	public void messages()
	{
		if(isSedded == true)
		System.out.println("Sedded fruit "+fruitName+" contains Vitamin "+vitamin);
		else
		System.out.println("SeddLess fruit "+fruitName+" contains Vitamin "+vitamin);
		
		
	}

}
