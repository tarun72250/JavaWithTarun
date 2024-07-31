package JDBC1;

public class Emp implements Comparable<Emp>
{
	int empno;
	String ename;
	String job;
	float salary;
	int dept;
	
	public Emp()
	{
		
	}

	public Emp(int empno, String ename, String job, float salary, int dept) {
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

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", salary=" + salary + ", dept=" + dept
				+ "]";
	}

	@Override
	public int compareTo(Emp o) 
	{
		if(this.salary<o.salary)
		return 1;
		else if(this.salary>o.salary)
			return -1;
		else 
			return o.empno-this.empno;
	}
}
