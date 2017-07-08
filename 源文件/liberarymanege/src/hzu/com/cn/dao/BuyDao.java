package hzu.com.cn.dao;

import hzu.com.cn.model.Buy;
import hzu.com.cn.model.Sale;
import hzu.com.cn.model.Stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuyDao {
	public int buyAdd(Connection con,Buy buy) throws SQLException{
		String sql="insert into buy values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, buy.getBookName());
		pstmt.setString(2,buy.getAuthor());
		pstmt.setFloat(3,buy.getPrice());
		pstmt.setString(4,buy.getPress());
		pstmt.setInt(5,buy.getAmount());
		pstmt.setString(6,buy.getTime());
		return pstmt.executeUpdate();
	}
	public ResultSet buyList(Connection con,Buy buy) throws SQLException{
		String sb ="select * from  buy";
		PreparedStatement pstmt = con.prepareStatement(sb);
		return pstmt.executeQuery();
	}
}
