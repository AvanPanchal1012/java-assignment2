package com.employees.model;

public class Employee {
	private String userName;
    private String password;
    private String email;
    private String contact;
    private String city;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee(String userName, String password, String email, String contact, String city) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.contact = contact;
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [userName=" + userName + ", password=" + password + ", email=" + email + ", contact=" + contact
				+ ", city=" + city + "]";
	}
    

}
