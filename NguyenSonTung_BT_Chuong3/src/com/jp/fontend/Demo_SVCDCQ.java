package com.jp.fontend;

import exercise12.LoaiSinhVien;
import exercise12.SVCDCQ;

public class Demo_SVCDCQ {
	public static void main(String[] args) {
//		khởi tạo giá trị
		SVCDCQ svcdcq = new SVCDCQ(7.5f, 4, 6);
		svcdcq.nhapThongTin("Tùng", "02/12/2002","BG", LoaiSinhVien.SVCĐN);
		
		// in thông tin
		System.out.println(svcdcq.inThongTin());
		
		
	}
}
