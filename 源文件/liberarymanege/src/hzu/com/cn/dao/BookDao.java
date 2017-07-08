package hzu.com.cn.dao;

import hzu.com.cn.model.Book;
import hzu.com.cn.model.BookType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookDao {
	public int bookAdd(Connection con,Book book) throws SQLException{
		String sql="insert into tbook values(null,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, book.getBookName());
		pstmt.setString(2,book.getAuthor());
		pstmt.setString(3,book.getSex());
		pstmt.setFloat(4,book.getPrice());
		pstmt.setString(5,book.getBookDesc());
		pstmt.setInt(6,book.getBookTypeId());
		return pstmt.executeUpdate();
	}
}
