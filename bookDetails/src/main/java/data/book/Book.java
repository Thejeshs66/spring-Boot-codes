package data.book;

public class Book {

	private int BookId;
	private String BookName;
	private double Price;
	
	public Book() {
		
	}
	public Book(int bookId, String bookName, double price) {
		super();
		BookId = bookId;
		BookName = bookName;
		Price = price;
	}
	public int getBookId() {
		return BookId;
	}
	public String getBookName() {
		return BookName;
	}
	public double getPrice() {
		return Price;
	}
	
}
