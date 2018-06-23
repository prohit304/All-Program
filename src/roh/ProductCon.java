package roh;

public class ProductCon
{
	private int productid,price,quantity;
	private String name;

	public ProductCon(int id,int p,int qt,String n) {
		productid=id;
		price=p;
		quantity=qt;
		name=n;
		
	}
	public void showProductCon() {
		System.out.println("ID :"+productid);
		System.out.println("NAME :"+name);
		System.out.println("PRICE :"+price);
		System.out.println("QUANTITY :"+quantity);
	}
}
