package exercise14;

public abstract class CongNhan {
	private String hoTen;
	private String diaChi;
	private LoaiCongNhan loaiCongNhan;
	
	
	// constructor no parameter
	public CongNhan() {
		
	}
	
	// constructor has paramenter
	public CongNhan(String hoTen, String diaChi, LoaiCongNhan loaiCongNhan) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
	}
	
	
	public void nhapThongTin(String hoTen, String diaChi, LoaiCongNhan loaiCongNhan) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiCongNhan = loaiCongNhan;
	}
	
	
	// started get and set

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

	public LoaiCongNhan getLoaiCongNhan() {
		return loaiCongNhan;
	}

	public void setLoaiCongNhan(LoaiCongNhan loaiCongNhan) {
		this.loaiCongNhan = loaiCongNhan;
	}	
	// end get and set
	
	
	// hàm trừu tượng tính luong
	public abstract float tinhLuong();
	
	// in thồng tin
	public String inThongTin() {
		return "họ Tên: " + hoTen + " dịa chỉ: " + diaChi + " Loại Công Nhân: " + loaiCongNhan + " tinhLuong: ";
	}
	
}
