package exercise12;

public abstract class Nguoi {
	private String hoTen;
	private String ngaySinh;
	private String diaChi;
	private LoaiSinhVien loaiSinhVien;
	
// constructer no parameter	
	Nguoi(){
		
	}
	
	// constructer hava parameter
	Nguoi(String hoTen, String ngaySinh, String diaChi,LoaiSinhVien loaiSinhVien){
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSinhVien = loaiSinhVien;
		
	}
	
	
	
	public void nhapThongTin(String hoTen, String ngaySinh, String diaChi,LoaiSinhVien loaiSinhVien){
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.loaiSinhVien = loaiSinhVien;
		
	}


	
	// bắt đầu get và set
	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public LoaiSinhVien getLoaiSinhVien() {
		return loaiSinhVien;
	}


	public void setLoaiSinhVien(LoaiSinhVien loaiSinhVien) {
		this.loaiSinhVien = loaiSinhVien;
	}
	// kết thức get và set thuộc tính
	
	
	// hàm abtract tinh diem
	public abstract float tinhDiem();
	
	// hàm hiển thị
	public String inThongTin() {
		return "Họ tên: " + hoTen + " Ngày Sinh: " + ngaySinh + " diaChi: " + diaChi+ " loại Sinh Viên: ";
	}
}
