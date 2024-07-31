package setDemo;

//LinkedHashSet :- no need to use for LinkedHasSet because we use LinkedHashSet for simple insertion pf order be preserved.



//if i should compare myself for HashSet implementation
public class A_06_Student implements Comparable<A_06_Student>
{
//public class A_06_Student {
	
	private int sid;
	private String name;
	private float percent;
	private String city;
	
	//default constructor
	public A_06_Student()
	{
		
	}
	
	//parametrized constructor
	public A_06_Student(int sid,String name,float percent,String city)
	{
		this.sid=sid;
		this.name=name;
		this.percent=percent;
		this.city=city;
	}
	
	
	//to String
	public String toString()
	{
		return  "Student [sid=" + sid + ", name=" + name + ", percent=" + percent + ", city=" + city + "]";
	}
	
	//for HashSet implementation
//	public int hashCode()
//	{
//		int hcode=0;
//		
//		if(city.equalsIgnoreCase("pune"))
//			hcode=10;
//		else if(city.equalsIgnoreCase("mumbai"))
//			hcode=20;
//		else if(city.equalsIgnoreCase("nashik"))
//			hcode=30;
//		else hcode=40;
//		
//		return hcode;
//	}
	
	
	@Override
	public int compareTo(A_06_Student o) 
	{
		int diff;
		diff=this.city.compareTo(o.city);
		if(diff==0)
		{
			diff=this.name.compareTo(o.name);
			if(diff==0)
				diff=this.sid=o.sid;
		}
		return diff ;
	}
	
}
