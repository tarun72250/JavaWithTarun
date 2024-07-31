package office.utility;

public class Date {

	private int dd, mm, yy;

	public Date() {

	}

	public Date(int dd, int mm, int yy) {

		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}

	public void display() {
		System.out.println(dd + " / " + mm + " / " + yy);
	}

	@Override
	public String toString() {
		return "Date [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}

}
