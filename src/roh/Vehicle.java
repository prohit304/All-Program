package roh;

public class Vehicle {

	private int registatino, vehicleno;
	private String name,colour;
	
	public void setData(int no,int v,String n,String c)
	{
		registatino=no;
		vehicleno=v;
		name=n;
		colour=c;
	}
	public void setData(int no,int v,String n) {
	
		registatino=no;
		vehicleno=v;
		name=n;
	}
	 
	public void showData()
	{
		System.out.println("Registatino :"+registatino);
		System.out.println("vehicleno :"+vehicleno);
		System.out.println("name :"+name);
		System.out.println("Colour :"+colour);
	}
}
