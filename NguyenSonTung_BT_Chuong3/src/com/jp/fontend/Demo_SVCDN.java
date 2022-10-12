package com.jp.fontend;

import exercise12.LoaiSinhVien;
import exercise12.SVCDN;

public class Demo_SVCDN {
	public static void main(String[] args) {
//		khởi tạo giá trị
		SVCDN svcdn = new SVCDN(7.5f, 6);
		
		// nhập thông tin
		svcdn.nhapThongTin("Tùng", "02/12/2002","BG", LoaiSinhVien.SVCĐN);
		
		// in thông tin
		System.out.println(svcdn.inThongTin());
	}
}
