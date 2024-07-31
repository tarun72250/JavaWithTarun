package com.tarun.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="orders4")
public class A_04_Order
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oid;
	
	@Column(length = 30)
	private String cname;
	
	
	
	@OneToMany(mappedBy = "order")
	@Cascade(value = CascadeType.ALL)
	Set < A_04_OrderItems > orderitems;
	
	
	public A_04_Order() 
	{
		super();
	}
	
	


	public A_04_Order(int oid, String cname, Set<A_04_OrderItems> orderitems) {
		super();
		this.oid = oid;
		this.cname = cname;
		this.orderitems = orderitems;
	}




	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public String getCname() {
		return cname;
	}

	public A_04_Order(String cname) {
		super();
		this.cname = cname;
	}




	public void setCname(String cname) {
		this.cname = cname;
	}

	
	
	public Set<A_04_OrderItems> getOrderitems() {
		return orderitems;
	}




	public void setOrderitems(Set<A_04_OrderItems> orderitems)
	{
		for( A_04_OrderItems oi:  orderitems)
		{
			oi.setOrder(this);
		}
		this.orderitems = orderitems;
	}




	@Override
	public String toString() {
		return "A_04_Order [oid=" + oid + ", cname=" + cname + "]";
	}
	
	
	
}
