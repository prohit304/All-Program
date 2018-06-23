package roh;

public class Account
{

	public static void main(String[] args) 
	{
		AccoutDeatails ad=new AccoutDeatails();
		ad.setAccountno(123654);
		ad.setBalance(20000);
		ad.setHoldername("Rohit");
		ad.setAdress("Odisha");
		
		System.out.println(("Account Deatils of Rohit"));
		System.out.println("AccountNo :"+ad.getAccountno());
		System.out.println("Holdername :"+ad.getHoldername());
		System.out.println("Balance :"+ad.getBalance());
		System.out.println("Adress :"+ad.getAdress());

	}

}
