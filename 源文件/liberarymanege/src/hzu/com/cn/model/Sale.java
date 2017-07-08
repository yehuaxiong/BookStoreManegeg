package hzu.com.cn.model;

public class Sale {
	private String bookName;
	private String author;
	private float price;
	private String press;
	private int amount;
	private String time;
	
	public Sale() {
		super();
	}

	public Sale(String bookName, String author, float price, String press,
			int amount, String time) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.price = price;
		this.press = press;
		this.amount = amount;
		this.time = time;
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

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}
