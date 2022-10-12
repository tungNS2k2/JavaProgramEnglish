package com.jp.entity;


// tao class person
public class Person {
	// name
	private String name;
	// dob
	private String dob;
	// pob
	private String pob;
	// gender
	private char   gender;
	// email
	private String email;
	// phone
	private String phone;
	
//	constructor no paramter
	public Person() {
		
	}
	
	// constructor
	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	// return name
	public String getName() {
		return name;
	}
// set name
	public void setName(String name) {
		this.name = name;
	}
// return dob
	public String getDob() {
		return dob;
	}

	// set dob
	public void setDob(String dob) {
		this.dob = dob;
	}

	// return pob
	public String getPob() {
		return pob;
	}
// set pob
	public void setPob(String pob) {
		this.pob = pob;
	}
// return gender
	public char getGender() {
		return gender;
	}

	// set gender
	public void setGender(char gender) {
		this.gender = gender;
	}

	
	// return email
	public String getEmail() {
		return email;
	}

	// set email
	public void setEmail(String email) {
		this.email = email;
	}

	
	// return phone
	public String getPhone() {
		return phone;
	}

	// set phone
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	// toString
	@Override
	public String toString() {
		return "name: " + name + " dob:" + dob + " pob: " + pob + " gender: " + gender + " email: " + email + " phone: " + phone;
	}
}
