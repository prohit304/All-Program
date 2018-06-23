package roh;

public class AccoutDeatails {
	public int accountno,balance;
	public String holdername,adress;
	
	 public void setAccountno(int a)
	{
		 accountno=a;}
	 public void setBalance(int b) {
		
		balance=b;
	 }
		
		
	
	    public void setHoldername(String h)
	    {
		holdername=h;
		}
		public void setAdress(String d) {
		adress=d;	}
	
		
		
	   public int getAccountno(){
		return accountno;
	}
	 public int getBalance() {
		return balance;	
	}
	  
	 public String getHoldername() {
		  return holdername;
	  }
	  public String getAdress() {
		   return adress;
	   }
	   
}
