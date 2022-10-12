package com.jp.exercise5;

public class Nguoi {
	private String ten;
	private int tuoi;
	private char gioiTinh;
	
	// no parameter 
	public Nguoi() {
		
	}
	
	// constructor parameter
	public Nguoi(String ten, int tuoi, char gioiTinh) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.gioiTinh = gioiTinh;
	}

// return ten
	public String getTen() {
		return ten;
	}

// set ten
	public void setTen(String ten) {
		this.ten = ten;
	}

// return tuoi
	public int getTuoi() {
		return tuoi;
	}


//	set tuoi
	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

// return gioi tinh
	public char getGioiTinh() {
		return gioiTinh;
	}

// return gioi tinh
	public void setGioiTinh(char gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	
// override
	@Override
	public String toString() {
		return "Ten: " + ten + " Tuoi: " + tuoi + " gioi Tinh: " +gioiTinh;
	}
}
