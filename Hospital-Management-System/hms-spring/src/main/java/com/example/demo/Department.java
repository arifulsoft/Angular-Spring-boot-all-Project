package com.example.demo;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	
	@Id
	int dep_id;
	String dep_name;
	String dep_info;
	
	public Department() {
		super();
	}

	public Department(int dep_id, String dep_name, String dep_info) {
		super();
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.dep_info = dep_info;
	}

	public int getDep_id() {
		return dep_id;
	}

	public void setDep_id(int dep_id) {
		this.dep_id = dep_id;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getDep_info() {
		return dep_info;
	}

	public void setDep_info(String dep_info) {
		this.dep_info = dep_info;
	}

	@Override
	public String toString() {
		return "Department [dep_id=" + dep_id + ", dep_name=" + dep_name + ", dep_info=" + dep_info + ", getDep_id()="
				+ getDep_id() + ", getDep_name()=" + getDep_name() + ", getDep_info()=" + getDep_info()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
