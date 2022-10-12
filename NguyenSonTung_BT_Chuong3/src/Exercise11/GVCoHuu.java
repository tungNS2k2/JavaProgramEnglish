package Exercise11;

public class GVCoHuu extends GiangVien {
	private double luongCB;
	private int heSoLuong;
	private int namCongTac;
	
	
	public GVCoHuu() {
		
	}
	
	public GVCoHuu(double luongCB, int heSoLuong, int namCongTac) {
		this.luongCB = luongCB;
		this.heSoLuong = heSoLuong;
		this.namCongTac = namCongTac;
	}

	@Override
	public float tinhLuong() {
		float phuCap = 0.0f;
		if(namCongTac < 5) {
			phuCap = (float) ((0 * luongCB)/100);
		}
		
		if(namCongTac > 5) {
			phuCap = (float) ((namCongTac *luongCB)/100);
		}
		
		return (float) (luongCB * heSoLuong + phuCap);
	}
	
	@Override
	public String inThongTin() {
		// TODO Auto-generated method stub
		return super.inThongTin() + " luong: " + tinhLuong();
	}
	
	
}
