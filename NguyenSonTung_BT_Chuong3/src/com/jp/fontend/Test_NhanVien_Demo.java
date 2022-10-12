package com.jp.fontend;

import com.jp.entity.DiaChi;
import com.jp.entity.NhanVien;

public class Test_NhanVien_Demo {
public static void main(String[] args) {
	// khoi khoi tao Dia chi
	DiaChi diaChi =new DiaChi("Nguyen xa", "Minh Khai", "Bac Tu Liem", "Ha Noi");
	
	// khoi tao nhan vien
	NhanVien nhanvien = new NhanVien("Viet", diaChi, "2002", 'n');
	
	
	// print
	System.out.println("in ra nhan vien: " + nhanvien.toString());
	
	
	
}
}
