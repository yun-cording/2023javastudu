package homework;

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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class test extends JFrame{
	JPanel jp ,jp1,  jp3 , jp2;
	JTextArea jta ;
	JTextField custid , name , address , phone ;
	JButton select_all , insert ,delete ,select ,load , update;
	JScrollPane jsp ;
	JLabel jbl1 , jbl2 , jbl3 , jbl4 ;

	
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
				
		add(jta);
		add(jp,BorderLayout.NORTH);
		add(jp3,BorderLayout.SOUTH);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		System.out.println(custid.getText());
		System.out.println(name.getText());
		System.out.println(address.getText());
		System.out.println(phone.getText());
		
		insert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText(custid.getText());
				
			}
		});
	}
	public static void main(String[] args) {
		new test();
		
	}
}

