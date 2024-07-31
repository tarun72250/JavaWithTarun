package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="students1")
public class A_01_Student 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid ;
	
	@Column(length = 20,name="name")
	private String name;
	
	@Embedded
	A_01_Address address;

	public A_01_Student() {
		super();
	}

	public A_01_Student(int sid, String name, A_01_Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.address = address;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A_01_Address getAddress() {
		return address;
	}

	public void setAddress(A_01_Address address) {
		this.address = address;
	}
	
	
	
}
