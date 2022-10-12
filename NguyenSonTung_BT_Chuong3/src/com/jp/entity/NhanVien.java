package com.jp.entity;

public class NhanVien {
	// name
	private String name;
	// addresss
	private DiaChi address;
	// dob
	private String dob;
	// gender
	private char gender;
	
	
	// constructor no paramter
	public NhanVien(){
		
	}
	
	// constructor parameter
	public NhanVien(String name, DiaChi address, String dob, char gender) {
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.gender = gender;
		
	}
// return name
	public String getName() {
		return name;
	}
// set name
	public void setName(String name) {
		this.name = name;
	}
// return address
	public DiaChi getAddress() {
		return address;
	}
// set address
	public void setAddress(DiaChi address) {
		this.address = address;
	}
// return dob
	public String getDob() {
		return dob;
	}
// set dob
	public void setDob(String dob) {
		this.dob = dob;
	}
// return gender
	public char getGender() {
		return gender;
	}
// set gender
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	// override toString
@Override
public String toString() {
	return "Name: " + name + " Dia chi: " + address + " dob: " + dob + " gender: " + gender; 
}

}
