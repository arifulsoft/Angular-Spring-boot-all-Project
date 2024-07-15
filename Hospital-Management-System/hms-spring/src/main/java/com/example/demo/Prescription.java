package com.example.demo;

public class Prescription {

	int p_id;
	String p_name;
	String age;
	String d_name;
	String problem;
	String prescription;
	String advice;
	String dep_name;

	public Prescription() {
		super();
	}

	public Prescription(int p_id, String p_name, String age, String d_name, String problem, String prescription,
			String advice, String dep_name) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.age = age;
		this.d_name = d_name;
		this.problem = problem;
		this.prescription = prescription;
		this.advice = advice;
		this.dep_name = dep_name;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getD_name() {
		return d_name;
	}

	public void setD_name(String d_name) {
		this.d_name = d_name;
	}

	public String getProblem() {
		return problem;
	}

	public void setProblem(String problem) {
		this.problem = problem;
	}

	public String getPrescription() {
		return prescription;
	}

	public void setPrescription(String prescription) {
		this.prescription = prescription;
	}

	public String getAdvice() {
		return advice;
	}

	public void setAdvice(String advice) {
		this.advice = advice;
	}

	public String getDep_name() {
		return dep_name;
	}

	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}

	@Override
	public String toString() {
		return "Prescription [p_id=" + p_id + ", p_name=" + p_name + ", age=" + age + ", d_name=" + d_name
				+ ", problem=" + problem + ", prescription=" + prescription + ", advice=" + advice + ", dep_name="
				+ dep_name + ", getP_id()=" + getP_id() + ", getP_name()=" + getP_name() + ", getAge()=" + getAge()
				+ ", getD_name()=" + getD_name() + ", getProblem()=" + getProblem() + ", getPrescription()="
				+ getPrescription() + ", getAdvice()=" + getAdvice() + ", getDep_name()=" + getDep_name()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
