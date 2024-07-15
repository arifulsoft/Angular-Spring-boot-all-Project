package com.example.demo;

public class Admissiontable {

	int p_id;
	String p_name;
	String dep_name;
	String d_id;
	String d_name;
	int nid;
	String age;
	String address;
	String phone;
	String problem;

	public Admissiontable() {
		super();
	}

	public Admissiontable(int p_id, String p_name, String dep_name, String d_id, String d_name, int nid, String age,
			String address, String phone, String problem) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.dep_name = dep_name;
		this.d_id = d_id;
		this.d_name = d_name;
		this.nid = nid;
		this.age = age;
		this.address = address;
		this.phone = phone;
		this.problem = problem;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	public String getD_id() {
		return d_id;
	}

	public void setD_id(String d_id) {
		this.d_id = d_id;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public int getNid() {
		return nid;
	}

	public void setNid(int nid) {
		this.nid = nid;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	@Override
	public String toString() {
		return "Admissiontable [p_id=" + p_id + ", p_name=" + p_name + ", dep_name=" + dep_name + ", d_id=" + d_id
				+ ", d_name=" + d_name + ", nid=" + nid + ", age=" + age + ", address=" + address + ", phone=" + phone
				+ ", problem=" + problem + ", getP_id()=" + getP_id() + ", getP_name()=" + getP_name()
				+ ", getDep_name()=" + getDep_name() + ", getD_id()=" + getD_id() + ", getD_name()=" + getD_name()
				+ ", getNid()=" + getNid() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getPhone()=" + getPhone() + ", getProblem()=" + getProblem() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

}
