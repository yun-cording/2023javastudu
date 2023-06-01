package homework;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;

public class HomeWork_person extends JFrame{
	JPanel jp ,jp1,  jp3 , jp2;
	JTextArea jta ;
	JTextField jtf1 , jtf2 , jtf3 , jtf4 ;
	JButton jb1 , jb2 ,jb3 ,jb4 ,jb5 , jb6;
	JScrollPane jsp ;
	JLabel jbl1 , jbl2 , jbl3 , jbl4 ;
	String[] name = {"ID" , "Name" , "Phone" , "Address" , "Company"};
	String[][] date = {
			{},
	};
	
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
		jtf1 = new JTextField(30);
		jtf2 = new JTextField(30);
		jtf3 = new JTextField(30);
		jtf4 = new JTextField(30);
		
		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");
		jb5 = new JButton("불러오기");
		jb6 = new JButton("고치기");
		jb6.setEnabled(false);
		jp1.add(jbl1);
		jbl1.setHorizontalAlignment(JLabel.CENTER);
		// jp1.add(new JLabel("CUSTID : " , JLabel.CENTER)); 이렇게도 가능
		jp2.add(jtf1);
		jp1.add(jbl2);
		jbl2.setHorizontalAlignment(JLabel.CENTER);
		jp2.add(jtf2);
		jp1.add(jbl3);
		jbl3.setHorizontalAlignment(JLabel.CENTER);
		jp2.add(jtf3);
		jp1.add(jbl4);
		jbl4.setHorizontalAlignment(JLabel.CENTER);
		jp2.add(jtf4);

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		jp3.add(jb4);
		jp3.add(jb5);
		jp3.add(jb6);
		
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
	}
	public static void main(String[] args) {
		new HomeWork_person();
	}
}
