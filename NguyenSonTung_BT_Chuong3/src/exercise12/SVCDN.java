package exercise12;

public class SVCDN  extends Nguoi{
	private float TDKT;
	private int SMKT;
	
	public SVCDN(){
		
	}
	
	
	public SVCDN(float TDKT, int SMKT){
		this.TDKT = TDKT;
		this.SMKT =SMKT;
	}
	
	
	
	@Override
	public float tinhDiem() {

		return TDKT/SMKT;
	}
	
	
	@Override
	public String inThongTin() {
		// TODO Auto-generated method stub
		return super.inThongTin() + " ĐTB: " + tinhDiem();
	}
}
