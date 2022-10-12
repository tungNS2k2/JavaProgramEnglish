package com.jp.fontend;

import exercise10.ChuongTrinh;
import exercise10.HocvienLT;

public class Demo_HocvienLT {
	public static void main(String[] args) {
//		khởi tạo giá trị
		HocvienLT hocvienlt = new HocvienLT(12, 500000);
		hocvienlt.nhapThongTin("tung", "BG", 1, ChuongTrinh.DOHOA);
		
		
		// in thong tin hoc vien lt
		System.out.println(hocvienlt.inThongTin());
	}
}
