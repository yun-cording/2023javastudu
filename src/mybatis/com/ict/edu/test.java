package mybatis.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

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

public class test extends JFrame {
	JPanel jp, jp1, jp3, jp2;
	JTextArea jta;
	JTextField custid, name, address, phone;
	JButton select_all, insert, delete, select, update , clean;
	JScrollPane jsp;
	JLabel jbl1, jbl2, jbl3, jbl4;
	List<VO> list = null;

	public test() {
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
		update = new JButton("고치기");
		clean = new JButton("지우기");
		
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
		jp3.add(update);
		jp3.add(clean);
		
		jp.add(jp1);
		jp.add(jp2);
				
		add(jta);
		add(jp,BorderLayout.NORTH);
		add(jp3,BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		select_all.addActionListener(new ActionListener() {	
			
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				list = DAO.getList();
				prn(list);

			}
		});
		
		insert.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent e) {
				if(custid.getText().length()>0) {
					JOptionPane.showMessageDialog(getParent(), "custid빼고 입력해주세요");
					delete.setEnabled(false);
					update.setEnabled(false);
					select_all.setEnabled(false);
					select.setEnabled(false);
					clean.setEnabled(false);
				}else if(name.getText().length()>0 && address.getText().length()>0
						&& phone.getText().length()>0) {
					jta.setText("");
					String name2 = name.getText();
					String address2 = address.getText();
					String phone2 = phone.getText();
					
					VO vo = new VO();
					vo.setName(name2);
					vo.setAddress(address2);
					vo.setPhone(phone2);
					
					int result = DAO.getInsert(vo);
					
					if(result>0) {
						list = DAO.getList();
						prn(list);
					}
					delete.setEnabled(true);
					update.setEnabled(true);
					select_all.setEnabled(true);
					select.setEnabled(true);
					clean.setEnabled(true);
				}
				else {
					JOptionPane.showMessageDialog(getParent(), "제대로 입력해주세요");
				}
			}
		});
	
		delete.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				VO vo = new VO();
				vo.setCustid(custid.getText());
				int result = DAO.getDelete(vo);
				if(result>0) {
					list = DAO.getList();
					prn(list);
				}
								
			}
		});
		
		select.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				String custid2 = custid.getText();
				VO vo = DAO.getOne(custid2);
				prn2(vo);
				if(vo == null) {
					JOptionPane.showMessageDialog(getParent(), "없는 정보입니다");
				}else if(custid.getText().length()>0) {
					update.setEnabled(true);
					select.setEnabled(false);
					select_all.setEnabled(false);
					insert.setEnabled(false);
					delete.setEnabled(false);
					clean.setEnabled(false);
					custid.setEnabled(false);
				update.addActionListener(new ActionListener() {		
					
					public void actionPerformed(ActionEvent e) {
						jta.setText("");
						String custid2 = custid.getText();
						String name2 = name.getText();
						String address2 = address.getText();
						String phone2 = phone.getText();
						VO vo = new VO();
						vo.setCustid(custid2);
						vo.setName(name2);
						vo.setAddress(address2);
						vo.setPhone(phone2);
						
						int result3 = DAO.getUpdate(vo);
						if(result3>0) {
							list = DAO.getList();
							prn(list);
						}
						
						select.setEnabled(true);
						select_all.setEnabled(true);
						insert.setEnabled(true);
						delete.setEnabled(true);
						clean.setEnabled(true);
						update.setEnabled(false);
						custid.setEnabled(true);
					}
				});
				}
				
			}
		});
		
		clean.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				custid.setText("");
				name.setText("");
				address.setText("");
				phone.setText("");
			}
		});
		
	}

	public static void main(String[] args) {
		new test();
	}

	// 테이블 전체보기 메서드
	public void prn(List<VO> list) {
		for (VO k : list) {
			jta.append(k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t");
			jta.append(k.getPhone() + "\n");
		}
	}

	public void prn2(VO vo) {
		jta.append(vo.getCustid() + "\t");
		jta.append(vo.getName() + "\t");
		jta.append(vo.getAddress() + "\t");
		jta.append(vo.getPhone() + "\n");
	}

}
