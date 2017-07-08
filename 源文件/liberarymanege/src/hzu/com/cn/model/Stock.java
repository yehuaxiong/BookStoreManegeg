package hzu.com.cn.model;

public class Stock {
	private int id;
	private String bookName;
	private String author;
	private float price;
	private String press;
	private int amount;
	private String bookDesc;
	private int bookTypeId;
	public Stock() {
		super();
	}
	
	public Stock(int id,int amount) {
		super();
		this.id = id;
		this.amount = amount;
	}

	public Stock(String bookName, String author, float price, String press,
			int amount, String bookDesc, int bookTypeId) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.press = press;
		this.amount = amount;
		this.bookDesc = bookDesc;
		this.bookTypeId = bookTypeId;
	}
	public Stock(int id, String bookName, String author, float price,String press) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.press = press;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getBookDesc() {
		return bookDesc;
	}
	public void setBookDesc(String bookDesc) {
		this.bookDesc = bookDesc;
	}
	public int getBookTypeId() {
		return bookTypeId;
	}
	public void setBookTypeId(int bookTypeId) {
		this.bookTypeId = bookTypeId;
	}
	
}
