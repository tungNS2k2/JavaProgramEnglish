package exercise13;

public abstract class NguoiLaoDong {
	private String hoTen;
	private String diaChi;
	private LoaiLaoDong loaiLaoDong;
	
	
	// constructor no parameter
	public NguoiLaoDong(){
		
	}
	
//	constructor has parameter
	public NguoiLaoDong(String hoTen, String diaChi, LoaiLaoDong loaiLaoDong){
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;
	}
	
	// method nhập thông tin
	public void nhapThongTin(String hoTen, String diaChi, LoaiLaoDong loaiLaoDong){
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiLaoDong = loaiLaoDong;
	}
	
//	started get and set
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
	public LoaiLaoDong getLoaiLaoDong() {
		return loaiLaoDong;
	}
	public void setLoaiLaoDong(LoaiLaoDong loaiLaoDong) {
		this.loaiLaoDong = loaiLaoDong;
	}
//end get and set
	
	
	public abstract float tinhLuong();
	
	
	public String inThongTin() {
		return "Họ Tên: " + hoTen + " địa chỉ: " + diaChi + " loại lao động: " + loaiLaoDong + "Lương: ";
	}
	
	
}
