/*
 * SaleTableFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package hzu.com.cn.view;

import hzu.com.cn.dao.BuyDao;
import hzu.com.cn.dao.SaleDao;
import hzu.com.cn.model.Buy;
import hzu.com.cn.model.Sale;
import hzu.com.cn.util.DBUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  __USER__
 */
public class SaleTableFrm extends javax.swing.JFrame {
	DBUtil dbUtil = new DBUtil();
	SaleDao saleDao = new SaleDao();

	/** Creates new form SaleTableFrm */
	public SaleTableFrm() {
		initComponents();
		this.fillTable(new Sale());
	}

	private void fillTable(Sale sale) {
		DefaultTableModel dtm = (DefaultTableModel) jSaleTable.getModel();
		dtm.setRowCount(0);
		Connection con = null;
		try {
			con = dbUtil.getCon();
			ResultSet rs = saleDao.saleList(con, sale);
			while (rs.next()) {
				Vector v = new Vector();
				v.add(rs.getString("bookname"));
				v.add(rs.getString("author"));
				v.add(rs.getString("price"));
				v.add(rs.getString("press"));
				v.add(rs.getString("amount"));
				v.add(rs.getString("time"));
				dtm.addRow(v);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				dbUtil.getCon();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jSaleTable = new javax.swing.JTable();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("\u9500\u552e\u5386\u53f2\u8bb0\u5f55");

		jSaleTable.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {

				}, new String[] { "书名", "作者", "价格", "出版社", "数量", "时间" }) {
			boolean[] canEdit = new boolean[] { false, false, false, false,
					false, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jScrollPane1.setViewportView(jSaleTable);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18));
		jLabel1.setText("\u9500\u552e\u8bb0\u5f55");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				38,
																				38,
																				38)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGap(
																				214,
																				214,
																				214)
																		.addComponent(
																				jLabel1)))
										.addContainerGap(44, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(18,
						Short.MAX_VALUE).addComponent(jLabel1).addPreferredGap(
						javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 295,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								39, 39, 39)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new SaleTableFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JTable jSaleTable;
	private javax.swing.JScrollPane jScrollPane1;
	// End of variables declaration//GEN-END:variables

}