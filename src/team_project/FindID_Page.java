package team_project;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FindID_Page extends JFrame{
	JPanel main_jp , top_jp , mid_jp1, mid_jp2 , bottom_jp;
	JButton find_jb , cancel_jb ;
	JTextField email_jtf , birth_jtf ;
	public FindID_Page() {
	super("FindID_Page");
		main_jp = new JPanel(new GridLayout(4,2));
		mid_jp1 = new JPanel();
		mid_jp2 = new JPanel();
		top_jp = new JPanel();
		bottom_jp = new JPanel();
		find_jb = new JButton("찾기");
		cancel_jb = new JButton("취소");
		email_jtf = new JTextField(20);
		birth_jtf = new JTextField(20);
		JLabel jlb = new JLabel("아이디 찾기");
		top_jp.add(jlb);
		mid_jp1.add(new JLabel(" 이메일  "));
		mid_jp1.add(email_jtf);
		mid_jp2.add(new JLabel("생년월일"));
		mid_jp2.add(birth_jtf);
		main_jp.add(top_jp);
		main_jp.add(mid_jp1);
		main_jp.add(mid_jp2);
		main_jp.add(bottom_jp);
		bottom_jp.add(find_jb);
		bottom_jp.add(cancel_jb);
		add(main_jp);
		
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
	}	
	public static void main(String[] args) {
		new FindID_Page();
		
	}
}