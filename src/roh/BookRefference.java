package roh;

public class BookRefference {
	
	private  int bookid,pages,slno;
	private String bookname,authername;
	
 public void setBookid(int id) {
		bookid=id;
	}
	
	public void setPages(int pg) {
		pages=pg;
	}
	public void setBookname(String bn) {
		bookname=bn;
	}
	public void setAuthername(String an) {
		authername=an;
	}

	public int getBookid() {
		return bookid;
	}

	public int getPages() {
		return pages;
	}

	public String getBookname() {
		return bookname;
	}

	public String getAuthername() {
		return authername;
	
	}
	{
/**public String toString() {
	return bookid+""+pages+" "+bookname+" "+authername;
}*/
	if(slno==pages)
		pages=bookid;
	else if(bookname=="authername")
		bookname=authername;
	else if(slno==bookid)
		bookid=pages;
	}
		
}
