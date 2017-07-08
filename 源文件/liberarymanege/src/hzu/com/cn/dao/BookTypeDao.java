package hzu.com.cn.dao;

import hzu.com.cn.model.BookType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookTypeDao {
	public int bookTypeAdd(Connection con,BookType bookType) throws SQLException{
		String sql="insert into booktype values(null,?,?)";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		return pstmt.executeUpdate();
	}
	
	public ResultSet bookTyeList(Connection con,BookType bookType) throws SQLException{
		//String sql="select * from  booktype";
		StringBuffer sb =new StringBuffer("select * from  booktype ");
		String bookTypeName=bookType.getBookTypeName();
		if((!"".equals(bookTypeName))&&bookTypeName!=null){
			
			sb.append("and bookTypeName like '%"+bookTypeName+"%'");
		}
		
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	
	public int bookTypeDelete(Connection con,String id) throws SQLException{
			
			String sql="delete from booktype where id=?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			return pstmt.executeUpdate();
	}
	
	public int bookTypeModify(Connection con,BookType bookType) throws SQLException{
		String sql="update booktype set bookTypeName=?,bookTypeDesc=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, bookType.getBookTypeName());
		pstmt.setString(2, bookType.getBookTypeDesc());
		pstmt.setInt(3, bookType.getId());
		return pstmt.executeUpdate();
	}
}
