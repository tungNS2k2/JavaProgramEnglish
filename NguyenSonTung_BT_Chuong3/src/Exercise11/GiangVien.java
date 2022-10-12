package Exercise11;

public abstract class GiangVien {
	private String hoTen;
	private String diaChi;
	private LoaiGiangVien   loaiGiangVien;
	
	
	
	public GiangVien() {
		
	}
	
	// method nhap thong tin
	public void nhapThongTin(String hoTen, String diaChi, LoaiGiangVien loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}
	
	
	// khởi tạo giá trị GiangVien;
	public GiangVien(String hoTen, String diaChi, LoaiGiangVien loaiGiangVien) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}


	// get và set
	
	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public LoaiGiangVien getLoaiGiangVien() {
		return loaiGiangVien;
	}


	public void setLoaiGiangVien(LoaiGiangVien loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}
	
	
	// hàm trừu tượng tính lương
	public abstract float tinhLuong();
	
	
	// hàm in thồng tin
	public String inThongTin() {
		return "Họ Tên: " + hoTen + "Địa Chỉ: " + diaChi + " Loại Giảng Viên: ";
	}
	
	
	
}
