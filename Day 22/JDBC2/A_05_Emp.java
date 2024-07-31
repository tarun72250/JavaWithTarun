package JDBC2;

public class A_05_Emp  implements Comparable<A_05_Emp>
{
	private int empno;
	private String ename;
	private String job;
	private float salary;
	private int dept;
	
	public A_05_Emp()
	{
		
	}

	public A_05_Emp(int empno, String ename, String job, float salary, int dept) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getDept() {
		return dept;
	}

	public void setDept(int dept) {
		this.dept = dept;
	}

    // toString method to represent employee details as a string
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}
	
	//for A_04_PreparedAssign3B
	// Override compareTo method to sort employees by job using TreeSet
	public int compareTo(A_05_Emp o)
	{
	return this.job.compareTo(o.job);	
	}

}
