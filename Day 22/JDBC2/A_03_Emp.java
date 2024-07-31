package JDBC2;

import java.util.*;

public class A_03_Emp
{
	private int empno;
	private String ename;
	private String job;
	private float salary;
	private int dept;
	
	public A_03_Emp()
	{
		
	}

	public A_03_Emp(int empno, String ename, String job, float salary, int dept) {
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

	//using HashSet remove implements in emp class
    // Override hashCode method to calculate hash code based on department using HashSet
	public int hashCode()
	{
		int hcode=0;
		return hcode=this.dept;
	}
	
    // Override equals method to compare employee objects based on employee number using HashSet
	public boolean equals(Object o)
	{
		boolean flag=false;
		A_03_Emp d=null;
		if(o instanceof A_03_Emp)
		{
			d=(A_03_Emp)o;
		if(this.empno==d.empno)
			flag=true;
		}
		return flag;
	}//so this will generate sequence according to hashCode and deptno wise

}
