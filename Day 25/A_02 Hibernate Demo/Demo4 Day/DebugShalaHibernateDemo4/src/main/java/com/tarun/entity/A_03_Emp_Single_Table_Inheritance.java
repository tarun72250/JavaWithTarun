package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="employee3")
@Inheritance(strategy = InheritanceType.JOINED)
//A strategy in which fields that are specific to a subclass are mapped to a separate table than the fieldsthat are common to the parent class, and a join isperformed to instantiate the subclass.
public class A_03_Emp_Single_Table_Inheritance 
{

	@Id
	int eid;
	
	@Column
	 String name;

	 
	 
	public A_03_Emp_Single_Table_Inheritance() {
		super();
	}

	public A_03_Emp_Single_Table_Inheritance(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	 
}
