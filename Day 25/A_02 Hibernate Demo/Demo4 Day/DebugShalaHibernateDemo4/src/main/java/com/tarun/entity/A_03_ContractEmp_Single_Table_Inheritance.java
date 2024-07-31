package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="contractEmp3")
@PrimaryKeyJoinColumn(name="empid")
public class A_03_ContractEmp_Single_Table_Inheritance extends A_03_Emp_Single_Table_Inheritance{

	@Column
	float extraHours;
	
	@Column
	float chargerPerHour;

	public A_03_ContractEmp_Single_Table_Inheritance() {
		super();
	}

	

	public A_03_ContractEmp_Single_Table_Inheritance(int eid, String name, float extraHours, float chargerPerHour) {
		super(eid, name);
		this.extraHours = extraHours;
		this.chargerPerHour = chargerPerHour;
	}



	public float getExtraHours() {
		return extraHours;
	}

	public void setExtraHours(float extraHours) {
		this.extraHours = extraHours;
	}

	public float getChargerPerHour() {
		return chargerPerHour;
	}

	public void setChargerPerHour(float chargerPerHour) {
		this.chargerPerHour = chargerPerHour;
	}
	
	
}
