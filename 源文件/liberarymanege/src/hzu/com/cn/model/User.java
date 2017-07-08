package hzu.com.cn.model;

public class User {
	private int id;
	private String UserName;
	private String passWord;
	private float monney;
	
	public User() {
		super();
	}
	
	
	public User(String userName, String passWord) {
		super();
		UserName = userName;
		this.passWord = passWord;
	}


	public User(int id,String userName, String passWord) {
		super();
		this.id=id;
		this.UserName = userName;
		this.passWord = passWord;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public float getMonney() {
		return monney;
	}

	public void setMonney(float monney) {
		this.monney = monney;
	}
	
}
