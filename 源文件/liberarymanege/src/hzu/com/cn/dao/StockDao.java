package hzu.com.cn.dao;

import hzu.com.cn.model.Book;
import hzu.com.cn.model.BookType;
import hzu.com.cn.model.Stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDao {
	public ResultSet bookTyeList(Connection con,Stock stock) throws SQLException{
		StringBuffer sb =new StringBuffer("select * from  stock ");
		String bookName=stock.getBookName();
		if((!"".equals(bookName))&&bookName!=null){
			
			sb.append("and bookname like '%"+bookName+"%'");
		}
		
		PreparedStatement pstmt = con.prepareStatement(sb.toString().replaceFirst("and", "where"));
		return pstmt.executeQuery();
	}
	public int stockModify(Connection con,Stock stock) throws SQLException{
		String sql="update stock set bookname=?,author=?,price=?,press=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, stock.getBookName());
		pstmt.setString(2, stock.getAuthor());
		pstmt.setFloat(3, stock.getPrice());
		pstmt.setString(4, stock.getPress());
		pstmt.setInt(5, stock.getId());
		return pstmt.executeUpdate();
	}
	public int stockEditAm(Connection con,Stock stock) throws SQLException{
		String sql="update stock set amount=? where id=?";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, stock.getAmount());
		pstmt.setInt(2, stock.getId());
		return pstmt.executeUpdate();
	}
	public int stockAdd(Connection con,Stock stock) throws SQLException{
		String sql="insert into stock values(null,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, stock.getBookName());
		pstmt.setString(2,stock.getAuthor());
		pstmt.setFloat(3,stock.getPrice());
		pstmt.setString(4,stock.getPress());
		pstmt.setInt(5,stock.getAmount());
		pstmt.setString(6,stock.getBookDesc());
		pstmt.setInt(7,stock.getBookTypeId());
		return pstmt.executeUpdate();
	}
}
