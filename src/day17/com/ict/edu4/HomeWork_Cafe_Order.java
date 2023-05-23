package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class HomeWork_Cafe_Order extends JFrame{
	public HomeWork_Cafe_Order() {
		super("계산기");
		JPanel np = new JPanel(new GridLayout(3,3));
		JPanel np1 = new JPanel(new GridLayout(2,2));
		JPanel np2 = new JPanel(new GridLayout(2,2));
		JPanel np3 = new JPanel(new GridLayout(2,2));
		JTextField jtf1 = new JTextField(5);


		JTextField jtf2 = new JTextField(5);
		JTextField jtf3 = new JTextField(5);
//		JTextArea jta = new JTextArea();
		JRadioButton jrb1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jrb2 = new JRadioButton("카페모카(4000)");
		JRadioButton jrb3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jrb4 = new JRadioButton("과일쥬스(3000)");
//		 반드시 JRadioButton 는 ButtonGroup 만들어서 넣자
		ButtonGroup bg = new ButtonGroup();

		
		np.add(np1);
		np.add(np2);
		np.add(np3);
		
		np1.add(new JLabel("원하는 음료 선택하세요"));
		
		np2.add(jrb1);
		np2.add(jrb2);
		np2.add(jrb3);
		np2.add(jrb4);
		np.add(new JLabel("수량 :"));
		np.add(jtf1);
		np.add(new JLabel("입금액 : "));
		np.add(jtf2); 
		
		JTextArea jta = new JTextArea();
		jta.setLineWrap(true); // 자동줄 바꿈
		JScrollPane jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		//	편집 불가능하게 만들자
		jta.setEditable(false); // 출력창 편집불가능하게 만들기
		
		JPanel sp = new JPanel();
		JButton jb1 = new JButton("계  산");
		JButton jb2 = new JButton("종  료");
		JButton jb3 = new JButton("취  소");
		sp.add(jb1);
		sp.add(jb2);
		sp.add(jb3);
		
		add(sp,BorderLayout.SOUTH); // 패널을 보더레이아웃으로 프레임에 붙이는것 아래
		add(np,BorderLayout.NORTH);// 패널을 보더레이아웃으로 프레임에 붙이는것 위
		add(jsp,BorderLayout.CENTER); // 패널을 보더레이아웃으로 프레임에 붙이는것 가운데
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250,ds.height/2-250,500,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new HomeWork_Cafe_Order();
	}
}
