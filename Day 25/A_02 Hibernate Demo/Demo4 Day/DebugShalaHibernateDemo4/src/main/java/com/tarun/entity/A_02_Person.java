package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person2")
public class A_02_Person 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	@Column(name="name" , length = 20)
	private String name;
	
	@Column(name="gender" , length=10)
	private String gender;

	public A_02_Person() {
		super();
	}

	public A_02_Person(int pid, String name, String gender) {
		super();
		this.pid = pid;
		this.name = name;
		this.gender = gender;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
