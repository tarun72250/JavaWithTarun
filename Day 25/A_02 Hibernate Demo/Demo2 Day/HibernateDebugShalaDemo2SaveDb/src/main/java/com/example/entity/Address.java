package com.example.entity;

import java.sql.Date;
import java.util.Arrays;

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
@Table(name="student_address")//we are specifying some more info with , 
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//if increase by alph(uses SEQUENCE or numeric (use IDENTITY)
	@Column(name="address_id")
	private int addressId;
	
	@Column(length = 50 , name="STREET")
	private String street;
	
	@Column(length = 50 , name="CITY")
	private String city;
	
	@Column(name="is_open")
	private boolean isOpen;
	
	@Transient//if we want to not create this column in database
	private double x;
	
	@Column(name="added_date")
	@Temporal(TemporalType.DATE) //TemporalType.DATE using this only Date we store not time 
	private Date addedDate;
	
	@Lob
	private byte[] image;//this image is large object so we use LOB
	
	
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


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", addedDate=" + addedDate + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
}
