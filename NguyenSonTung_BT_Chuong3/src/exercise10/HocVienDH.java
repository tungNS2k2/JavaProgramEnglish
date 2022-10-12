package exercise10;

public class HocVienDH extends Hocvien{
	private int soBuoiHoc;
	private long donGiaDH;
	
	
	public HocVienDH(){
		
	}
	
	
	public HocVienDH(int soBuoiHoc, long donGiaDH) {
		this.soBuoiHoc = soBuoiHoc;
		this.donGiaDH = donGiaDH;
		
	}

	@Override
	public float hocPhi() {
		int mucGiam = 0;
		if(getLoaiUuTien() == 1) {
			mucGiam = 1000000;
		}
		if (getLoaiUuTien() == 2) {
			mucGiam = 500000;
		}
		return this.soBuoiHoc * donGiaDH - mucGiam;
		// TODO Auto-generated method stub		
	}
	
	@Override
	public String inThongTin() {
		// TODO Auto-generated method stub
		return super.inThongTin() + " hocPhiDH: " +  hocPhi();
	}

}
