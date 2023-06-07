package homework;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class HomeWork_person extends JFrame{
	JPanel jp ,jp1,  jp3 , jp2;
	JTextArea jta ;
	JTextField custid , name , address , phone ;
	JButton select_all , insert ,delete ,select ,load , update;
	JScrollPane jsp ;
	JLabel jbl1 , jbl2 , jbl3 , jbl4 ;

	
	public HomeWork_person() {
		super("DB 연동 정보");
		jp = new JPanel(new GridLayout(0,2));
		jp1 = new JPanel(new GridLayout(4,0));
		jp2 = new JPanel(new GridLayout(4,0));
		jp3 = new JPanel();
		jbl1 = new JLabel("CUSTID : ");
		jbl2 = new JLabel("NAME : ");
		jbl3 = new JLabel("ADDRESS : ");
		jbl4 = new JLabel("PHONE : ");
		jta = new JTextArea(15 ,20);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		custid = new JTextField(30);
		name = new JTextField(30);
		address = new JTextField(30);
		phone = new JTextField(30);
		
		select_all = new JButton("전체보기");
		insert = new JButton("삽입");
		delete = new JButton("삭제");
		select = new JButton("검색");
		load = new JButton("불러오기");
		update = new JButton("고치기");
		update.setEnabled(false);
		jp1.add(jbl1);
		jbl1.setHorizontalAlignment(JLabel.CENTER);
		// jp1.add(new JLabel("CUSTID : " , JLabel.CENTER)); 이렇게도 가능
		jp2.add(custid);
		jp1.add(jbl2);
		jbl2.setHorizontalAlignment(JLabel.CENTER);
		jp2.add(name);
		jp1.add(jbl3);
		jbl3.setHorizontalAlignment(JLabel.CENTER);
		jp2.add(address);
		jp1.add(jbl4);
		jbl4.setHorizontalAlignment(JLabel.CENTER);
		jp2.add(phone);

		jp3.add(select_all);
		jp3.add(insert);
		jp3.add(delete);
		jp3.add(select);
		jp3.add(load);
		jp3.add(update);
		
		jp.add(jp1);
		jp.add(jp2);
				
		add(jsp);
		add(jp,BorderLayout.NORTH);
		add(jp3,BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		// JTextField 초기값들 빈칸으로 지정 나중에 내용 입력했는지 확인용
//		custid.setText("");
//		name.setText("");
//		address.setText("");
//		phone.setText("");
		select_all.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = null ;
				PreparedStatement pstm = null ;
				ResultSet rs = null ;
				int result = 0 ;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
					String user = "C##ysh";
					String password = "1111";
					conn = DriverManager.getConnection(url,user,password);
					
					String sql = "select * from customers";
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					while(rs.next()) {
						jta.setText(rs.getString(1) + "\t");
						jta.setText(rs.getString(2) + "\t");
						jta.setText(rs.getString(3) + "\t");
						jta.setText(rs.getString(4) + "\n");
					}
					
				} catch (Exception e2) {
					// TODO: handle exception
				}finally {
					try {
						conn.close();
						pstm.close();
						rs.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
		
		insert.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(! custid.getText().equals(null) && ! name.getText().equals(null) 
							&& ! address.getText().equals(null)  && ! phone.getText().equals(null) ) {
				Connection conn = null ;
				PreparedStatement pstm = null ;
				ResultSet rs = null ;
				int result = 0 ;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
					String user = "C##ysh";
					String password = "1111";
					conn = DriverManager.getConnection(url,user,password);
					String sql = "insert into customer(custid , name , address , phone) values(?,?,?,?)";
					
					int cust = Integer.parseInt(custid.getText().trim());// 인트형으로 형변환
					
					pstm.getConnection().prepareStatement(sql);
					pstm.setInt(1, cust);
					pstm.setString(2, name.getText().trim());
					pstm.setString(3, address.getText().trim());
					pstm.setString(4, phone.getText().trim());
					result = pstm.executeUpdate();
					if(result>0) { // 삽입이 성공했으면 텍스트에 입력값 나타내기
						sql = "select * from customer";
						pstm = conn.prepareStatement(sql);
						rs = pstm.executeQuery();
						while(rs.next()) {
							jta.setText(rs.getString(1)+ "\t");
							jta.setText(rs.getString(2)+ "\t");
							jta.setText(rs.getString(3)+ "\t");
							jta.setText(rs.getString(4)+ "\n");
							}
					}
				} catch (Exception e2) {
					System.out.println("삽입실패");
				}finally {
					try {
						conn.close();
						rs.close();
						pstm.close();
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
				
			}else {
				JOptionPane.showMessageDialog(getParent(), "내용을 제대로 입력하세요", "MESSAGE 창", JOptionPane.QUESTION_MESSAGE);
			}
			}
		});
		
		delete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = null ;
				PreparedStatement pstm = null ;
				ResultSet rs = null ;
				int result = 0 ;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
					String user = "C##ysh";
					String password = "1111";
					conn = DriverManager.getConnection(url,user,password);
					
					// 보통은 primary key를 이용해서 삭제한다.
					String sql = "delete from customer where custid = ?";
					
					pstm = conn.prepareStatement(sql);
					int cust = Integer.parseInt(custid.getText().trim());
					pstm.setInt(1, cust);
					result = pstm.executeUpdate();
					
					
					if(result>0) { // 델리트 실행됐다면 확인차 
					sql = "select * from customer";
					pstm = conn.prepareStatement(sql);
					rs = pstm.executeQuery();
					while(rs.next()) {
						jta.setText(rs.getString(1)+ "\t");
						jta.setText(rs.getString(2)+ "\t");
						jta.setText(rs.getString(3)+ "\t");
						jta.setText(rs.getString(4)+ "\n");
						}
					}else {
						System.out.println("삭제실패");
					}
				} catch (Exception e1) {
					System.out.println("삭제실패");
				}finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		
		select.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = null ;
				PreparedStatement pstm = null ;
				ResultSet rs = null ;
				int result = 0 ;
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
					String user = "C##ysh";
					String password = "1111";
					conn = DriverManager.getConnection(url,user,password);
					
					String sql = "select * from customer where custid = ?";
					// ? => 바인딩변수
					pstm = conn.prepareStatement(sql);
					int cust = Integer.parseInt(custid.getText().trim());
					pstm.setInt(1, cust);
					rs = pstm.executeQuery();
					while(rs.next()) {
						System.out.print(rs.getString(1)+ "\t");
						System.out.print(rs.getString(2)+ "\t");
						System.out.print(rs.getString(3)+ "\t");
						System.out.print(rs.getString(4)+ "\t");
						}
					
				} catch (Exception e1) {
					
					
				}finally {
					try {
						rs.close();
						pstm.close();
						conn.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});
		
		load.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(),"파일불러오기" , FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				if(! msg.equals("nullnull")) {
					jta.setText("");
					File file = new File(msg);
					FileInputStream fis = null;
					try {
						fis = new FileInputStream(file);
						byte[] r = fis.readAllBytes();
						String msg2 = new String(r);
						jta.setText(msg2);
					} catch (Exception e2) {
						// TODO: handle exception
					}finally {
						try {
							fis.close();
						} catch (Exception e3) {
							// TODO: handle exception
						}
					}
				}
				
				
			}
		});
		
		if(! custid.getText().equals("nullnull") && ! name.getText().equals("nullnull") 
				&& ! address.getText().equals("nullnull")  && ! phone.getText().equals("nullnull") ) {
			update.setEnabled(true);
			update.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					Connection conn = null ;
					PreparedStatement pstm = null ;
					ResultSet rs = null ;
					int result = 0 ;
					try {
						Class.forName("oracle.jdbc.driver.OracleDriver");
						String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
						String user = "C##ysh";
						String password = "1111";
						conn = DriverManager.getConnection(url,user,password);
						
						String sql = "update customer set name = ? , address = ?  , phone = ? where custid = ?";
						// ? => 바인딩변수
						pstm = conn.prepareStatement(sql);
						int cust = Integer.parseInt(custid.getText().trim());
						pstm.setInt(1, cust);
						pstm.setString(2, name.getText().trim());
						pstm.setString(3, address.getText().trim());
						pstm.setString(4, phone.getText().trim());
						result = pstm.executeUpdate();
						if(result>0) { // 인서트가 실행됐다면 확인차 
						sql = "select * from customer";
						pstm = conn.prepareStatement(sql);
						rs = pstm.executeQuery();
						while(rs.next()) {
							System.out.print(rs.getString(1)+ "\t");
							System.out.print(rs.getString(2)+ "\t");
							System.out.print(rs.getString(3)+ "\t");
							System.out.print(rs.getString(4)+ "\n");
							}
						}
						
					} catch (Exception e3) {
						System.out.println("실패");
					}finally {
						try {
							rs.close();
							pstm.close();
							conn.close();
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
				}
			});
			
		}		
	}
	public static void main(String[] args) {
		new HomeWork_person();
	}
}
