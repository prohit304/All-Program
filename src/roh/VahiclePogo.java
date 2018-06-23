package roh;

public class VahiclePogo 
{

	private int regdNo, mfgYear;
	private String  regdOwner,fuelUsed,regdAdress;
	
	public VahiclePogo() {
		regdNo=0;
		mfgYear=0;
		regdOwner="***";
		fuelUsed="*";
		regdAdress="**";
	}
	public VahiclePogo(int regdNo,int mfgYear,String  regdOwner,String fuelUsed,String regdAdress) {

		this.regdNo=regdNo;
		this.mfgYear=mfgYear;
		this.regdOwner=regdOwner;
		this.fuelUsed=fuelUsed;
		this.regdAdress=regdAdress;		
	}
	
	public void setRegdNo(int regdNo) {
		this.regdNo=regdNo;
	}
	public  int getRegdNo() {
		return this.regdNo;
	}
	public int getMfgYear() {
		return this.mfgYear;
	}
	public void setMfgYear(int mfgYear) {
		this.mfgYear = mfgYear;
	}
	public String getRegdOwner() {
		return this.regdOwner;
	}
	public void setRegdOwner(String regdOwner) {
		this.regdOwner = regdOwner;
	}
	public String getFuelUsed() {
		return this.fuelUsed;
	}
	public void setFuelUsed(String fuelUsed) {
		this.fuelUsed = fuelUsed;
	}
	public String getRegdAdress() {
		return this.regdAdress;
	}
	public void setRegdAdress(String regdAdress) {
		this.regdAdress = regdAdress;
	}
}
