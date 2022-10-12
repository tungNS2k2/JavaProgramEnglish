package exercise10;

public class HocvienLT extends Hocvien{
		private int soBuoiHoc;
		private long donGiaLT;
		
		
		public HocvienLT(){
			
		}
		
		
		public HocvienLT(int soBuoiHoc, long donGiaLT) {
			this.soBuoiHoc = soBuoiHoc;
			this.donGiaLT = donGiaLT;
			
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
			return this.soBuoiHoc * donGiaLT - mucGiam;
			// TODO Auto-generated method stub		
		}
		
		@Override
		public String inThongTin() {
			// TODO Auto-generated method stub
			return super.inThongTin() + " hocPhiLT: " +  hocPhi();
		}

	}


