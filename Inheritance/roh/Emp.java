package roh;

public class Emp {
	
	private int id;
	protected double bs;
	private String name,job,adress;

	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	
	public double getBs() {
		return this.bs;
	}
	public void setBs(double bs) {
		this.bs = bs;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	public void setJob(String Job) {
		this.job=job;
	}
	
	public String getName() {
		return this.name;	
	}
	public String getJob() {
		return this.job;
	}
	
	
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdress() {
		return adress;
	}
	

	
}
