package com.example.demo;

public class User {
int id;
String name;
String email;
String address;
String phone;
String password;
String gender;
String  borrowedbook;

public User() {
	super();
}

public User(int id, String name, String email, String address, String phone, String password, String gender,
		String borrowedbook) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.address = address;
	this.phone = phone;
	this.password = password;
	this.gender = gender;
	this.borrowedbook = borrowedbook;
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

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getBorrowedbook() {
	return borrowedbook;
}

public void setBorrowedbook(String borrowedbook) {
	this.borrowedbook = borrowedbook;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone
			+ ", password=" + password + ", gender=" + gender + ", borrowedbook=" + borrowedbook + ", getId()="
			+ getId() + ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getAddress()=" + getAddress()
			+ ", getPhone()=" + getPhone() + ", getPassword()=" + getPassword() + ", getGender()=" + getGender()
			+ ", getBorrowedbook()=" + getBorrowedbook() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}



}