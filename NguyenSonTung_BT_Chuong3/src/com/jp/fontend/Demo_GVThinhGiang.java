package com.jp.fontend;


import Exercise11.GVThinhGiang;
import Exercise11.LoaiGiangVien;

public class Demo_GVThinhGiang {
public static void main(String[] args) {
	GVThinhGiang gvthinhgiang = new GVThinhGiang(35, 1000000);
	
	gvthinhgiang.nhapThongTin("Tùng", "BG", LoaiGiangVien.GIANGVIENTHINHGIANG);
	
	
	System.out.println("Tông tin: " + gvthinhgiang.inThongTin());
}
}
