package com.jp.fontend;
import Exercise11.*;
public class Demo_GVCoHuu {
	public static void main(String[] args) {
		GVCoHuu gvcohuu = new GVCoHuu(3500000, 3, 7);
		
		gvcohuu.nhapThongTin("Tùng", "BG", LoaiGiangVien.GIANGVIENCOHUU);
		
		
		System.out.println("Tông tin: " + gvcohuu.inThongTin());
	}
}
