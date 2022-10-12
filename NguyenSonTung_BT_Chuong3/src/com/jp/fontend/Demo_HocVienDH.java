package com.jp.fontend;

import exercise10.ChuongTrinh;
import exercise10.HocVienDH;

public class Demo_HocVienDH {
	public static void main(String[] args) {
//		khởi tạo giá trị
		HocVienDH hocviendh = new HocVienDH(12, 500000);
		hocviendh.nhapThongTin("tung", "BG", 1, ChuongTrinh.DOHOA);
		
		
		
		// in thong tin hoc vien do hoa
		System.out.println(hocviendh.inThongTin());
	}
}
