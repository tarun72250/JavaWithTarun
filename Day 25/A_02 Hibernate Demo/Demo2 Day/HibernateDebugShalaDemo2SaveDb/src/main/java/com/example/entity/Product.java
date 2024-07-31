package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//entity class , persistence class , domain class , model class 

@Entity
@Table(name="product")
@NamedQuery(name="getByPrice",query = "select pid,pname from Product where price > :min and price < :max")
public class Product 
{
	//bean properties
	@Id
	@Column(name="pid") 
	private int pid ;
	
	@Column
	private String pname;
	@Column
	private float price;
	@Column
	private float qty;
	
	
	//getters and setters
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getQty() {
		return qty;
	}
	public void setQty(float qty) {
		this.qty = qty;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
}
