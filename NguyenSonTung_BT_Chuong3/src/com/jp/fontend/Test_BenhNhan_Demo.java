package com.jp.fontend;


import com.jp.entity.BenhNhan;
import com.jp.entity.BenhVien;
import com.jp.entity.Nguoi;

public class Test_BenhNhan_Demo {
public static void main(String[] args) {
	// khoi tao benh vien
	BenhVien benhvien  = new BenhVien("Benh Vien 1", "Ha Noi", "tung");
	
	// khoi tao thong tin benh nhan
	BenhNhan benhNhan = new BenhNhan("Tung", 12, 'n', "khong", "khoe",benhvien );

	// in thong tin java
	System.out.println(benhNhan.toString());
}
}
