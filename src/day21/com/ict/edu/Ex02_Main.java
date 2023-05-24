package day21.com.ict.edu;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Main extends JFrame {
	JPanel pg1;
	CardLayout cardLayout ;
	
	public Ex02_Main() {
		super("카드레이아웃2");
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		
		Ex02_LogIn login = new Ex02_LogIn(cardLayout, pg1); // 객체생성할때 생성자에 가져올 정보를 입력
		Ex02_Join join = new Ex02_Join(this);
		Ex02_LogIn_ok loginok = new Ex02_LogIn_ok(this);
		
		pg1.add("login", login);
		pg1.add("loginok",loginok);
		pg1.add("join",join);
		
		add(pg1);
		
		
		
		setLocationRelativeTo(null);
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		setVisible(true);
		}
	public static void main(String[] args) {
		new Ex02_Main();
	}
}
