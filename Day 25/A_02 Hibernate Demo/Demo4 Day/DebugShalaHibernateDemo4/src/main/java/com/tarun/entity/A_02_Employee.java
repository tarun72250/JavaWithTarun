package com.tarun.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class A_02_Employee extends A_02_Person 
{

	@Column(name="salary",columnDefinition = "DECIMAL(7,2)")
	private Double salary;
	
	@Column(name="joining_date")
	private LocalDate doj;
	
	@Column(name="dept_name" , length = 20)
	private String deptName;
	
	//precision=6: This specifies the total number of digits that can be stored in this column , ex:- the total number of digits is 6.
		//scale=3: This specifies the number of digits to the right of the decimal point. ,ex :- the column can have 3 digits after the decimal point.
	@Column(name="bonus" , precision = 6, scale=3)
	private BigDecimal bonus;
	
	@Column(name="email", length = 30 , unique = true)
	private String email;

	public A_02_Employee() {
		super();
	}

	public A_02_Employee(Double salary, LocalDate doj, String deptName, BigDecimal bonus, String email) {
		super();
		this.salary = salary;
		this.doj = doj;
		this.deptName = deptName;
		this.bonus = bonus;
		this.email = email;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public BigDecimal getBonus() {
		return bonus;
	}

	public void setBonus(BigDecimal bonus) {
		this.bonus = bonus;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
