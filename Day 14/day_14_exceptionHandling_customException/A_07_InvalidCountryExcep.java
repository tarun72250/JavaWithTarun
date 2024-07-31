package day_14_exceptionHandling_customException;

public class A_07_InvalidCountryExcep extends Exception {

	private String usercountry;
	private String msg;
	
	public A_07_InvalidCountryExcep() {
		this.usercountry="No country specified by user";
		msg="Out the country is not allowed";
	}
	
	public A_07_InvalidCountryExcep(String usercountry) {
		this.usercountry=usercountry;
		msg="Out the country is not allowed";
	}

	public String toString() {
		return msg;
	}
}
