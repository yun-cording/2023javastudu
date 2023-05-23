package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
import javax.swing.border.Border;

public class Ex04_Cafe extends JFrame {
	public Ex04_Cafe() {
		super("카페 주문");

		JPanel jp1 = new JPanel();
		jp1.add(new JLabel("원하는 음료 선택하세요"));

		JPanel jp2 = new JPanel();
		JRadioButton jrd1 = new JRadioButton("아메리카노(3000원)");
		JRadioButton jrd2 = new JRadioButton("카페모카(4000원)");
		JRadioButton jrd3 = new JRadioButton("카페라떼(3500원)");
		JRadioButton jrd4 = new JRadioButton("과일쥬스(3000원)");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrd1);
		bg.add(jrd2);
		bg.add(jrd3);
		bg.add(jrd4);

		jp2.add(jrd1);
		jp2.add(jrd2);
		jp2.add(jrd3);
		jp2.add(jrd4);

		JPanel jp3 = new JPanel();
		JTextField su = new JTextField(20);
		JTextField input = new JTextField(20);

		jp3.add(new JLabel(" 수 량 : "));
		jp3.add(su);
		jp3.add(new JLabel(" 입 금 액 : "));
		jp3.add(input);

		JTextArea jta = new JTextArea(20, 0);
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JPanel jp4 = new JPanel();
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);

		JPanel pg1 = new JPanel();
		JPanel pg2 = new JPanel();

		pg1.setLayout(new BorderLayout());
		pg2.setLayout(new BorderLayout());

		pg1.add(jp1, BorderLayout.NORTH);
		pg1.add(jp2,BorderLayout.CENTER);
		
		pg2.add(jp3,BorderLayout.NORTH);
		pg2.add(jsp,BorderLayout.CENTER);
		pg2.add(jp4, BorderLayout.SOUTH);
		
		add(pg1, BorderLayout.NORTH);
		add(pg2, BorderLayout.CENTER);
		
		
		pack();
		setLocationRelativeTo(null);
//		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
//		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex04_Cafe();
	}
}
