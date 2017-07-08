/*
 * MainFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package hzu.com.cn.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author  __USER__
 */
public class MainFrm extends javax.swing.JFrame {

	/** Creates new form MainFrm */
	public MainFrm() {
		initComponents();
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		table = new javax.swing.JDesktopPane();
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu1 = new javax.swing.JMenu();
		jMenu3 = new javax.swing.JMenu();
		jMIBookAdd = new javax.swing.JMenuItem();
		jMIBookTypeManage = new javax.swing.JMenuItem();
		jMenu4 = new javax.swing.JMenu();
		jMAddBook = new javax.swing.JMenuItem();
		jMenuItem2 = new javax.swing.JMenuItem();
		jMenuItem1 = new javax.swing.JMenuItem();
		jMenu5 = new javax.swing.JMenu();
		jMenuItem3 = new javax.swing.JMenuItem();
		jMenuItem4 = new javax.swing.JMenuItem();
		jMIExit = new javax.swing.JMenuItem();
		jMenu2 = new javax.swing.JMenu();
		jMenuItem5 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("\u56fe\u4e66\u7ba1\u7406\u7cfb\u7edf\u4e3b\u754c\u9762");

		jMenu1.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\base.png")); // NOI18N
		jMenu1.setText("\u57fa\u672c\u6570\u636e\u7ef4\u62a4");

		jMenu3.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\bookTypeManager.png")); // NOI18N
		jMenu3.setText("\u56fe\u4e66\u7c7b\u522b\u7ba1\u7406");

		jMIBookAdd.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\add.png")); // NOI18N
		jMIBookAdd.setText("\u6dfb\u52a0\u56fe\u4e66\u7c7b\u522b");
		jMIBookAdd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMIBookAddActionPerformed(evt);
			}
		});
		jMenu3.add(jMIBookAdd);

		jMIBookTypeManage.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\edit.png")); // NOI18N
		jMIBookTypeManage.setText("\u7ef4\u62a4\u56fe\u4e66\u7c7b\u522b");
		jMIBookTypeManage
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jMIBookTypeManageActionPerformed(evt);
					}
				});
		jMenu3.add(jMIBookTypeManage);

		jMenu1.add(jMenu3);

		jMenu4.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\bookManager.png")); // NOI18N
		jMenu4.setText("\u56fe\u4e66\u7ba1\u7406");

		jMAddBook.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\add.png")); // NOI18N
		jMAddBook.setText("\u56fe\u4e66\u8fdb\u8d2d");
		jMAddBook.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMAddBookActionPerformed(evt);
			}
		});
		jMenu4.add(jMAddBook);

		jMenuItem2.setIcon(new javax.swing.ImageIcon(
				"D:\\Myeclipse\\Workspace\\pic\\edit.png")); // NOI18N
		jMenuItem2
				.setText("\u56fe\u4e66\u9500\u552e\u53ca\u4fe1\u606f\u66f4\u6539");
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu4.add(jMenuItem2);

		jMenu1.add(jMenu4);

		jMenuItem1.setIcon(new javax.swing.ImageIcon(
				"D:\\Myeclipse\\Workspace\\pic\\userName.png")); // NOI18N
		jMenuItem1.setText("\u7528\u6237\u4fe1\u606f\u4fee\u6539");
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu1.add(jMenuItem1);

		jMenu5.setIcon(new javax.swing.ImageIcon(
				"D:\\Myeclipse\\Workspace\\pic\\record.png")); // NOI18N
		jMenu5.setText("\u5386\u53f2\u8bb0\u5f55");

		jMenuItem3.setIcon(new javax.swing.ImageIcon(
				"D:\\Myeclipse\\Workspace\\pic\\record.png")); // NOI18N
		jMenuItem3.setText("\u9500\u552e\u5386\u53f2\u8bb0\u5f55");
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem3);

		jMenuItem4.setIcon(new javax.swing.ImageIcon(
				"D:\\Myeclipse\\Workspace\\pic\\record.png")); // NOI18N
		jMenuItem4.setText("\u8fdb\u8d2d\u5386\u53f2\u8bb0\u5f55");
		jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem4ActionPerformed(evt);
			}
		});
		jMenu5.add(jMenuItem4);

		jMenu1.add(jMenu5);

		jMIExit.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\exit.png")); // NOI18N
		jMIExit.setText("\u9000\u51fa\u7cfb\u7edf");
		jMIExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMIExitActionPerformed(evt);
			}
		});
		jMenu1.add(jMIExit);

		jMenuBar1.add(jMenu1);

		jMenu2.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\about.png")); // NOI18N
		jMenu2.setText("\u5173\u4e8e\u6211\u4eec");

		jMenuItem5.setIcon(new javax.swing.ImageIcon(
				"F:\\java 实训\\第三课\\images2\\me.png")); // NOI18N
		jMenuItem5.setText("\u5173\u4e8e\u8bfe\u7a0b\u8bbe\u8ba1");
		jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem5ActionPerformed(evt);
			}
		});
		jMenu2.add(jMenuItem5);

		jMenuBar1.add(jMenu2);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(table,
				javax.swing.GroupLayout.Alignment.TRAILING,
				javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		AboutUsFrm aboutUsFrm = new AboutUsFrm();
		aboutUsFrm.setVisible(true);
		this.table.add(aboutUsFrm);
	}

	private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		BuyTableFrm buyTableFrm = new BuyTableFrm();
		buyTableFrm.setVisible(true);
		this.table.add(buyTableFrm);
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		SaleTableFrm saleTableFrm = new SaleTableFrm();
		saleTableFrm.setVisible(true);
		this.table.add(saleTableFrm);
	}

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		UserEditFrm userEditFrm = new UserEditFrm();
		userEditFrm.setVisible(true);
		this.table.add(userEditFrm);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Query_Modify query_Modify = new Query_Modify();
		query_Modify.setVisible(true);
		this.table.add(query_Modify);
	}

	private void jMAddBookActionPerformed(java.awt.event.ActionEvent evt) {
		BookAddInterFrm bookAddInterFrm = new BookAddInterFrm();
		bookAddInterFrm.setVisible(true);
		this.table.add(bookAddInterFrm);
	}

	private void jMIBookTypeManageActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		BookTypeManageInterFrm bookTypeManageInterFrm = new BookTypeManageInterFrm();
		bookTypeManageInterFrm.setVisible(true);
		this.table.add(bookTypeManageInterFrm);
	}

	private void jMIBookAddActionPerformed(java.awt.event.ActionEvent evt) {
		BookTypeInterFrm bookTypeInterFrm = new BookTypeInterFrm();
		bookTypeInterFrm.setVisible(true);
		this.table.add(bookTypeInterFrm);
	}

	private void jMIExitActionPerformed(java.awt.event.ActionEvent evt) {
		int a;
		a = JOptionPane.showConfirmDialog(null, "您是否要退出系統");

		if (a == 0)
			this.dispose();

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JMenuItem jMAddBook;
	private javax.swing.JMenuItem jMIBookAdd;
	private javax.swing.JMenuItem jMIBookTypeManage;
	private javax.swing.JMenuItem jMIExit;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenu jMenu2;
	private javax.swing.JMenu jMenu3;
	private javax.swing.JMenu jMenu4;
	private javax.swing.JMenu jMenu5;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JMenuItem jMenuItem4;
	private javax.swing.JMenuItem jMenuItem5;
	private javax.swing.JDesktopPane table;
	// End of variables declaration//GEN-END:variables

}