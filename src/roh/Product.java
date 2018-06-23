package roh;

public class Product 
{

	private int productid,price,quantity;
	private String name;
	
	public void setData(int id,int p,int qt,String n)
	{
		productid=id;
		price=p;
		quantity=qt;
		name=n;
	}
	
	public void setData(int id,int p,int qt)
	{
		productid=id;
	     price=p;
		quantity=qt;
	}
	  
	public void showData() {
		  System.out.println("Product id :"+productid);
		  System.out.println("Product Name :"+name);
		  System.out.println("Product Quantity :"+quantity);
		  System.out.println("Price :"+price);
	  }
}

