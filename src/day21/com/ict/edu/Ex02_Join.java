package day21.com.ict.edu;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex02_Join extends JPanel {
	Ex02_Main main;
	JButton jb ;
	// main에 있는 cardLayout, pg1을 이용하기 위해서 정보를 받아야 한다.
	// 새로 만들면 정보교류를 할 수 없다.
	// 단 , 전달 정보가 많으면 클래스(객체)자체를 받자.
	public Ex02_Join(Ex02_Main main) {
		// 생성자에서 받은 인자는 무조건 전역변수로 만들자
		this.main = main;
		jb = new JButton("뒤로가기");
		
		add(new JLabel("회원가입 창입니다."));
		add(jb);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.pg1,"login");
				
			}
		});
				
	}
}