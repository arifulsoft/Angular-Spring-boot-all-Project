package com.example.demo;

public class User {

	int a_number;
	String name;
	String gender;
	String email;
	String password;
	String phone;
	double balance;
	public User() {
		super();
	}
	public User(int a_number, String name, String gender, String email, String password, String phone, double balance) {
		super();
		this.a_number = a_number;
		this.name = name;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.balance = balance;
	}
	public int getA_number() {
		return a_number;
	}
	public void setA_number(int a_number) {
		this.a_number = a_number;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "User [a_number=" + a_number + ", name=" + name + ", gender=" + gender + ", email=" + email
				+ ", password=" + password + ", phone=" + phone + ", balance=" + balance + ", getA_number()="
				+ getA_number() + ", getName()=" + getName() + ", getGender()=" + getGender() + ", getEmail()="
				+ getEmail() + ", getPassword()=" + getPassword() + ", getPhone()=" + getPhone() + ", getBalance()="
				+ getBalance() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
