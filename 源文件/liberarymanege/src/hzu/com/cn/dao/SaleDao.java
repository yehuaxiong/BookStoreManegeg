package hzu.com.cn.dao;

import hzu.com.cn.model.Buy;
import hzu.com.cn.model.Sale;
import hzu.com.cn.model.Stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SaleDao {
	public int saleAdd(Connection con,Sale sale) throws SQLException{
		String sql="insert into sale values(?,?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		pstmt.setString(1, sale.getBookName());
		pstmt.setString(2,sale.getAuthor());
		pstmt.setFloat(3,sale.getPrice());
		pstmt.setString(4,sale.getPress());
		pstmt.setInt(5,sale.getAmount());
		pstmt.setString(6,sale.getTime());
		return pstmt.executeUpdate();
	}
	public ResultSet saleList(Connection con,Sale sale) throws SQLException{
		String sb ="select * from  sale";
		PreparedStatement pstmt = con.prepareStatement(sb);
		return pstmt.executeQuery();
	}

}
