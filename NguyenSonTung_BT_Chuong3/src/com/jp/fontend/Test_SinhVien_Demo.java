package com.jp.fontend;

import com.jp.exercise5.SinhVien;
import com.jp.exercise5.Truong;

public class Test_SinhVien_Demo {
public static void main(String[] args) {
	// khoi tao truong
	Truong truong = new Truong("HAUI", "Nhon", "None");
	
	
	// khoi tao sinh vien
	SinhVien sinhvien = new SinhVien("tung", 20, 'n', "KHMT02", "KHMT", truong);
	
	// in sinh vien
	System.out.println(sinhvien.toString());
}
}
