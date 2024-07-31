package com.tarun;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "student_address")
public class Address 
{

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)//sequence  ( alphabets)
	@Column(name ="address_id")
	private int addressId;
	
	@Column(length = 50 , name = "STREET")
	private String street;
	
	@Column(length = 50 , name = "CITY")
	private String city;
	
	@Column( name = "IS_OPEN")
	private boolean isOpen;
	
	@Transient //Specifies that the property or field is not persistent
	private double x;
	
	@Column(name="ADDED_DATE")
	@Temporal(TemporalType.DATE)//This annotation must be specified for persistent fieldsor properties of type java.util.Date and java.util.Calendar
	private Date addedDate;
	
	@Lob //Specifies that a persistent property or field should be persistedas a large object to a database-supported large object type. 
	private byte[] image;

	public Address() {
		super();
	}

	public Address(int addressId, String street, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
