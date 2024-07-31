package day_14_exceptionHandling_customException;

public class A_05_NameException extends Exception{

	private String firstn;
	private String lastn;
	private String msg;
	
	public A_05_NameException() {
		this.firstn="";
		this.lastn="";
	}
     
	public A_05_NameException(String firstn,String lastn) {
		this.firstn=firstn;
		this.lastn=lastn;
		msg=" letter of First Name should be Capital";
	}
	
	
	public String tostring() {
		return msg;
	}
}
