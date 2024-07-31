package com.tarun.beans;

public class Student {

	private String name;
	private int roolNo;
	private float marks;
	//getter and setter 
	//toString()
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoolNo() {
		return roolNo;
	}
	public void setRoolNo(int roolNo) {
		this.roolNo = roolNo;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", roolNo=" + roolNo + ", marks=" + marks + "]";
	}
	
	
}
