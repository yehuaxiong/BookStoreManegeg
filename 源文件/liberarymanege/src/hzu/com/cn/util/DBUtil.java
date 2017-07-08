package hzu.com.cn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
//	private String dbUrl="jdbc:mysql://localhost:3306/liberary";
	private String dbUrl="jdbc:mysql://localhost:3306/bookstore";
	private String dbUserName="root";
	private String dbPassWord="123456";
	private String jdbcName="com.mysql.jdbc.Driver";
	
	
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassWord);
		
		return con;
	}
	public void colseCon(Connection con) throws SQLException{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DBUtil dbUtil=new DBUtil();
		try {
			dbUtil.getCon();
			System.out.println("successful");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
