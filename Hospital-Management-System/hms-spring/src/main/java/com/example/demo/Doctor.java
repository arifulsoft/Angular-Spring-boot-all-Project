package com.example.demo;

public class Doctor {

	String d_id;
	String d_name;
	int age;
	String gender;
	String specialization;
	String experience;
	int mobile;
	String email;
	String schedule;
	int dep_id;
	String dep_name;
	int c_fee;
	String image;

	public Doctor() {
		super();
	}

	public Doctor(String d_id, String d_name, int age, String gender, String specialization, String experience, int mobile,
			String email, String schedule, int dep_id, String dep_name, int c_fee, String image) {
		super();
		this.d_id = d_id;
		this.d_name=d_name;
		this.age = age;
		this.gender = gender;
		this.specialization = specialization;
		this.experience = experience;
		this.mobile = mobile;
		this.email = email;
		this.schedule = schedule;
		this.dep_id = dep_id;
		this.dep_name = dep_name;
		this.c_fee = c_fee;
		this.image=image;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
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

	public int getC_fee() {
		return c_fee;
	}

	public void setC_fee(int c_fee) {
		this.c_fee = c_fee;
	}
	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Doctor [d_id=" + d_id + ", d_name=" + d_name + ", age=" + age + ", gender=" + gender
				+ ", specialization=" + specialization + ", experience=" + experience + ", mobile=" + mobile
				+ ", email=" + email + ", schedule=" + schedule + ", dep_id=" + dep_id + ", dep_name=" + dep_name
				+ ", c_fee=" + c_fee + ", image=" + image + ", getD_id()=" + getD_id() + ", getD_name()=" + getD_name()
				+ ", getAge()=" + getAge() + ", getGender()=" + getGender() + ", getSpecialization()="
				+ getSpecialization() + ", getExperience()=" + getExperience() + ", getMobile()=" + getMobile()
				+ ", getEmail()=" + getEmail() + ", getSchedule()=" + getSchedule() + ", getDep_id()=" + getDep_id()
				+ ", getDep_name()=" + getDep_name() + ", getC_fee()=" + getC_fee() + ", getImage()=" + getImage()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	

}
