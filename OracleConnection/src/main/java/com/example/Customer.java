package com.example;

import java.util.Date;

public class Customer {
	int id;
	String name;
	String email;
	Date date;
	
	public Customer(int id, String name, String email, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getEmail()=" + getEmail() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
