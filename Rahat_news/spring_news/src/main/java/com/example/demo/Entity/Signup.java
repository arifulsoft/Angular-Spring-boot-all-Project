package com.example.demo.Entity;

import java.util.Arrays;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Signup {
	@Id
int id;
String name;
String email;
String password;
String role;
String  image;
public Signup() {
	super();
}
public Signup(int id, String name, String email, String password, String role, String image) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.role = role;
	this.image = image;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
@Override
public String toString() {
	return "Signup [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", role=" + role
			+ ", image=" + image + "]";
}




}
