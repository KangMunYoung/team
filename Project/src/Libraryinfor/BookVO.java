package Libraryinfor;

public class BookVO {
	private String bookName;
	private String bookWriter;
	private String price;
	private String lender;
	private String lenderCheck;
	
	public BookVO() {
		
	}
	public BookVO(String bookName, String bookWriter, String price, String lender ,String lenderCheck) {
	this.bookName = bookName;
	this.bookWriter = bookWriter;
	this.price = price;
	this.lender  = lender;
	this.lenderCheck = lenderCheck;
	
	}
	//대여책출력
	public void booPrint() {
		System.out.printf("%-10s %-10s %-10s %-10s %-10s\n" , bookName, bookWriter, price,lender,lenderCheck);
	}
	//타이틀 출력
	public static void bookPrint() {
		System.out.printf("%-10s %-10s %-10s %-10s %-10s\n","대여가능한책","저자","가격","대여자","대여여부");
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String book) {
		this.bookName = book;
	}
	public String getBookWriter() {
		return bookWriter;
	}
	public void setBookWriter(String writer) {
		this.bookWriter = writer;
	}
	public String getPrice() {
		return price;
}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getLender() {
		return lender;
	}
	public void setLender(String lender) {
		this.lender = lender;
	}
	public String getLenderCheck() {
		return lenderCheck;
	}
	public void setLenderCheck(String lenderCheck) {
		this.lenderCheck = lenderCheck;
	}

	
}