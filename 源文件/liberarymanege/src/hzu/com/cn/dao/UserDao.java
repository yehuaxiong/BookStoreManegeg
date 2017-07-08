package hzu.com.cn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import hzu.com.cn.model.BookType;
import hzu.com.cn.model.Sale;
import hzu.com.cn.model.User;

public class UserDao {

	public User login(Connection con, User user) throws Exception {
		User resultUser = null;
		String sql = "select * from user where userName=? and passWord=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassWord());
		//String sql = "select * from user where userName=user.getUserName() and passWord=user.getPassWord()";
		
		ResultSet rs = pstmt.executeQuery();
		if (rs.next()) {
			resultUser = new User();
			resultUser.setUserName(rs.getString("username"));
			resultUser.setPassWord(rs.getString("password"));
		}
		return resultUser;
	}
	public int userModify(Connection con,User user) throws SQLException{
		String sql="update user set username=?, password=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassWord());
			
		pstmt.setInt(3, user.getId());
		return pstmt.executeUpdate();
	}
	public ResultSet userList(Connection con,User user) throws SQLException{
		StringBuffer sb =new StringBuffer("select * from  user ");
		String userName=user.getUserName();
		if((!"".equals(userName))&&userName!=null){
			
			sb.append("and username like '%"+userName+"%'");
		}
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	public int userAdd(Connection con,User user) throws SQLException{
		String sql="insert into user values(null,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2,user.getPassWord());
		return pstmt.executeUpdate();
	}
}
