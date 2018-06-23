package roh;

public class Bookbuy {
	public static void main(String[] args) {
	
		BookRefference b=new BookRefference ();
		
		b.setAuthername("Auter : Rohit");
		b.setBookid(235);
		b.setBookname("The Complete Reference");
		b.setPages(100);
		
		System.out.println("BookId :"+b.getBookid());
		System.out.println("Bookname :"+b.getBookname());
		System.out.println("AutherName :"+b.getAuthername());
		System.out.println("Pages :"+b.getPages());

	}     

}
