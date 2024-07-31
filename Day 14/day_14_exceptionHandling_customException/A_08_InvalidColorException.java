package day_14_exceptionHandling_customException;

public class A_08_InvalidColorException extends Exception {

	private String message;
	
	public A_08_InvalidColorException () {
		this.message="Color Mismatch";
	}
	 
	@Override
	public String getMessage() {
		return this.message;
	}
	
	@Override
	public String toString() {
		return this.message;
	}
}
