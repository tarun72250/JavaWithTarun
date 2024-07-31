package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class A_02_Student extends A_02_Person 
{
	@Column(name="school_name" , length=30)
	private String schoolName;
	
	@Column(name="fee" , columnDefinition = "FLOAT")
	private float fee;
	
    @Column(name="section_name" , length = 5)
	private String sectionName;

	public A_02_Student() {
		super();
	}

	public A_02_Student(String schoolName, float fee, String sectionName) {
		super();
		this.schoolName = schoolName;
		this.fee = fee;
		this.sectionName = sectionName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public float getFee() {
		return fee;
	}

	public void setFee(float fee) {
		this.fee = fee;
	}

	public String getSectionName() {
		return sectionName;
	}

	public void setSectionName(String sectionName) {
		this.sectionName = sectionName;
	}
	
	
}
