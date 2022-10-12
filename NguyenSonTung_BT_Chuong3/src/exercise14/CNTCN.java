package exercise14;

public class CNTCN extends CongNhan{
	private float luongCB;
	private int heSoLuong;
	private int ngayLamViec;
	private float thuong;
	
	
	// constructor no parameter
	public CNTCN() {
		
	}
	
	// contructor parametor
	public CNTCN(float luongCB, int heSoLuong, int ngayLamViec) {
		this.luongCB = luongCB;
		this.heSoLuong = heSoLuong;
		this.ngayLamViec = ngayLamViec;
	}

	// override tinh luong
	@Override
	public float tinhLuong() {
		if(ngayLamViec <= 20)
			thuong = 0;
		else
			thuong = (float) (1.2 * luongCB);
		return luongCB * heSoLuong + thuong;
	}
	
	
	// override in thong tin
	@Override
	public String inThongTin() {
		// TODO Auto-generated method stub
		return super.inThongTin() + tinhLuong();
	}
	
	
	
}
