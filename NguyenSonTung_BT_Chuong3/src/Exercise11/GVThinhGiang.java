package Exercise11;

public class GVThinhGiang extends GiangVien {
	private int soTiet;
	private double donGia;
	
	
	public GVThinhGiang(){
		
	}
	
	public GVThinhGiang(int soTiet, double donGia) {
		this.soTiet = soTiet;
		this.donGia = donGia;
	}

	@Override
	public float tinhLuong() {
		// TODO Auto-generated method stub
		double thuNhap = soTiet * donGia;
		return (float) (thuNhap - (15 * thuNhap)/100);
	}
	
	
	@Override
	public String inThongTin() {
		// TODO Auto-generated method stub
		return super.inThongTin() + " luong: " + tinhLuong();
	}
	
}
