package roh;

public class OverridingVehicle {

	public static void main(String[] args) {

     Vehicle v=new Vehicle();
     v.setData(1234, 789, "pulser","black");
     v.showData();
     
     Vehicle v1=new Vehicle();
     v1.setData(788, 5234, "Avenger");
	v.showData();
	}

}
