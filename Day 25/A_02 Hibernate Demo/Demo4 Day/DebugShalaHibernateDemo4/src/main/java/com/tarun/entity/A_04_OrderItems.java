package com.tarun.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="orderitems4")
public class A_04_OrderItems {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int oiid;
	
	@Column
    int pid;
	
	@Column
    int qty;
    
	
	@ManyToOne
	@JoinColumn(name="oid")
	A_04_Order order;
	
	
	public A_04_OrderItems() {
		super();
	}



	public A_04_OrderItems(int oiid, int pid, int qty, A_04_Order order) {
		super();
		this.oiid = oiid;
		this.pid = pid;
		this.qty = qty;
		this.order = order;
	}

	


	public A_04_OrderItems(int pid, int qty) {
		super();
		this.pid = pid;
		this.qty = qty;
	}



	public int getOiid() {
		return oiid;
	}

	public void setOiid(int oiid) {
		this.oiid = oiid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

	public A_04_Order getOrder() {
		return order;
	}



	public void setOrder(A_04_Order order) {
		this.order = order;
	}



	@Override
	public String toString() {
		return "A_04_OrderItems [oiid=" + oiid + ", pid=" + pid + ", qty=" + qty + "]";
	}
    
    
	
}
