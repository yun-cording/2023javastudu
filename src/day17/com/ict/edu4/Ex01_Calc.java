package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex01_Calc extends JFrame{
	public Ex01_Calc() {
		super("계산기");
		JPanel np = new JPanel();
		JLabel jl1 = new JLabel("수1 : ");
		JTextField jtf1 = new JTextField(5);

		JLabel jl2 = new JLabel("수2 : ");
		JTextField jtf2 = new JTextField(5);
		
		JLabel jl3 = new JLabel("연산자 : ");
		JTextField jtf3 = new JTextField(5);
		JPanel jp = new JPanel(new GridLayout(5,3));

		np.add(jl1);
		np.add(jtf1);
		np.add(jl2);
		np.add(jtf2);
		np.add(jl3);
		np.add(jtf3);
		
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
		new Ex01_Calc();
	}
}
