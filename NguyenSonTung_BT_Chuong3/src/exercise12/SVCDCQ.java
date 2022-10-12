package exercise12;

public class SVCDCQ extends Nguoi
{
	private float TDKT;
	private int SMKT;
	private float DTKTHP;
	
	// constructer
	public SVCDCQ() {
		
	}
	// constructer 
	public SVCDCQ(float TDKT, int SMKT, float DTKHP) {
		this.TDKT = TDKT;
		this.SMKT = SMKT;
		this.DTKTHP = DTKHP;
	}

	// override tính điểm
	@Override
	public float tinhDiem() {
		// TODO Auto-generated method stub
		return (TDKT/SMKT +DTKTHP)/3;
	}
	
	// over ride in thông tin
	@Override
	public String inThongTin() {
		// TODO Auto-generated method stub
		return super.inThongTin() + " ĐTB: " + tinhDiem();
	}
	
	
	
	
}
