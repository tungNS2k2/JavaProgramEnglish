package exercise10;

public abstract class Hocvien {
	private String hoTen;
	private String diaChi;
	private int loaiUuTien;
	private ChuongTrinh loaiChuongTrinh;
	
	// constructor no parameter
	public Hocvien() {
		
	}
	
	// constructor has parameter
	public Hocvien(String hoTen, String diaChi, int loaiUuTien, ChuongTrinh loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	
	
	// method nhap thong tin
	public void nhapThongTin(String hoTen, String diaChi, int loaiUuTien, ChuongTrinh loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}
	
	// method trừu tượng để tính học phí 
	public abstract float hocPhi();
	
	// return ho Ten
	public String getHoTen() {
		return hoTen;
	}

// set ho ten
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

// return dia Chi
	public String getDiaChi() {
		return diaChi;
	}

// set dia chi
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

// return loai uu tien
	public int getLoaiUuTien() {
		return loaiUuTien;
	}

// set loai uu tien
	public void setLoaiUuTien(int loaiUuTien) {
		this.loaiUuTien = loaiUuTien;
	}

// return loai chuong chinh
	public ChuongTrinh getLoaiChuongTrinh() {
		return loaiChuongTrinh;
	}

// set loai chuong trinh
	public void setLoaiChuongTrinh(ChuongTrinh loaiChuongTrinh) {
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

// method in thong tin
	public String inThongTin() {
		return "hoTen: " + hoTen + " diaChi: " + diaChi + " loaiUuTien: " + loaiUuTien + " loaiChuongTrinh: " + loaiChuongTrinh;
	}
	
	
	
	
	
}
