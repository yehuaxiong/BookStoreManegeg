/*
 * AboutUsFrm.java
 *
 * Created on __DATE__, __TIME__
 */

package hzu.com.cn.view;

/**
 *
 * @author  __USER__
 */
public class AboutUsFrm extends javax.swing.JFrame {

	/** Creates new form AboutUsFrm */
	public AboutUsFrm() {
		initComponents();
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
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1
				.setText("WHAT WE DO\n\u6211\u4eec\u505a\u4ec0\u4e48\uff1f\n\u672c\u7740\u4e13\u4e1a\u3001\u8ba4\u771f\u548c\u8bda\u4fe1\u7684\u539f\u5219\uff0c\u5728\u4e3a\u5ba2\u6237\u63d0\u4f9b\u5b8c\u7f8e\u7684\u63a8\u5e7f\u89e3\u51b3\u65b9\u6848\u548c\u5168\u65b9\u4f4d\u7684\u8f6f\u4ef6\u5f00\u53d1\u3001\u6280\u672f\u670d\u52a1\u3002\u5728\u5ba2\u6237\u5b9e\u9645\u64cd\u4f5c\u8fc7\u7a0b\u4e2d\u4e0d\u65ad\u6539\u8fdb\u81ea\u8eab\u529f\u80fd\uff0c\u4e3a\u5ba2\u6237\u63d0\u4f9b\u6700\u53ca\u65f6\uff0c\u6700\u5177\u5b9e\u6548\u7684\u8f6f\u4ef6\u3002\nTHE GOAL\n\u6211\u4eec\u7684\u76ee\u6807\n\u4ee5\u5ba2\u6237\u5b9e\u9645\u9700\u6c42\u4e3a\u6839\u672c\uff0c\u4e0d\u65ad\u5f00\u53d1\u521b\u65b0\u6700\u65b0\u7684\u8425\u9500\u63a8\u5e7f\u6280\u672f\u548c\u65b9\u6848\u3002\u878d\u5408\u5728\u8f6f\u4ef6\u529f\u80fd\u4e2d\u8ba9\u7528\u6237\u8fbe\u5230\u6700\u4f73\u6548\u679c\n\u8054\u7cfb\u65b9\u5f0f\uff1a727147973@qq.com");
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300,
				Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AboutUsFrm().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}