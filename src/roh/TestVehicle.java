package roh;

public class TestVehicle 
{

	public static void main(String[] args)
	{
    
		System.out.println("***************************************");
		 VahiclePogo vp=new  VahiclePogo(11122333,2018,"Rohit","Petrol","HYD");
		 System.out.println("Vehicle RC Book");
		 System.out.println("Vehicle RegdNo :"+ vp.getRegdNo());
		 System.out.println("MFG Year :"+vp.getMfgYear());
		 System.out.println("Owner Name :"+vp.getRegdOwner());
		 System.out.println("Fuel Type :"+vp.getFuelUsed());
		 System.out.println("Adress :"+vp.getRegdAdress());
		 
		 //Updating Details
		 vp.setRegdOwner("Shiva");
		 vp.setRegdNo(778899);
		 System.out.println("\n Owner Name :"+vp.getRegdOwner());
		 System.out.println("Vehicle RegdNo :"+ vp.getRegdNo());

		 System.out.println("***************************************");
	}

}
