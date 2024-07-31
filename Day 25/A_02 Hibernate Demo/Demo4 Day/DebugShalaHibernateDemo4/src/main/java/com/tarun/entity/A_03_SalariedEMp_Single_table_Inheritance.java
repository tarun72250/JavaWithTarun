package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="salariedEmp3")
@PrimaryKeyJoinColumn(name="empid")
public class A_03_SalariedEMp_Single_table_Inheritance extends A_03_Emp_Single_Table_Inheritance {

	@Column
	float salary;
	
	@Column
	float bonus;



	public A_03_SalariedEMp_Single_table_Inheritance() {
		super();
	}



	public A_03_SalariedEMp_Single_table_Inheritance(int eid, String name, float salary, float bonus) {
		super(eid, name);
		this.salary = salary;
		this.bonus = bonus;
	}



	public float getSalary() {
		return salary;
	}


	public void setSalary(float salary) {
		this.salary = salary;
	}


	public float getBonus() {
		return bonus;
	}


	public void setBonus(float bonus) {
		this.bonus = bonus;
	}

	
}
