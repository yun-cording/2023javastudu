package day16.com.ict.edu2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class EX09_JTab extends JFrame {
	public EX09_JTab() {
		super("JTab");

		// XXXPane = 컨테이너 = 다른 컨테이너를 가질수 있고 , 컴포넌트도 가질수 있다.
		JTabbedPane jtab = new JTabbedPane();

		JPanel jp1 = new JPanel();
		// 배경색
		jp1.setBackground(Color.BLUE);
		JButton jb1 = new JButton("+");
		JButton jb2 = new JButton("-");
		JButton jb3 = new JButton("*");
		JButton jb4 = new JButton("/");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		
		jtab.addTab("블루 탭", jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.cyan);
		jtab.addTab("시안 탭", jp2);
		
		JRadioButton jrb1 = new JRadioButton(" + ");
		JRadioButton jrb2 = new JRadioButton(" - ");
		JRadioButton jrb3 = new JRadioButton(" * ");
		JRadioButton jrb4 = new JRadioButton(" / ");
		
		jrb1.setBackground(Color.BLACK);
		jrb2.setBackground(Color.BLACK);
		jrb3.setBackground(Color.BLACK);
		jrb4.setBackground(Color.BLACK);
		
		JPanel jp3 = new JPanel();
		jtab.addTab("운동 탭", jp3);
		jp3.setBackground(Color.lightGray);
		JCheckBox jcb1 = new JCheckBox("축구");
		JCheckBox jcb2 = new JCheckBox("농구");
		JCheckBox jcb3 = new JCheckBox("배구");
		JCheckBox jcb4 = new JCheckBox("야구");
		jcb1.setBackground(Color.GREEN);
		jcb2.setBackground(Color.GREEN);
		jcb3.setBackground(Color.GREEN);
		jcb4.setBackground(Color.GREEN);
		
		
		ButtonGroup bg = new ButtonGroup();// 기능적인면 버튼이 1개만 선택되도록
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		jp2.add(jrb1);// 버튼 화면에 보여주는
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
					
		jp3.add(jcb1);
		jp3.add(jcb2);
		jp3.add(jcb3);
		jp3.add(jcb4);
		
		add(jtab);
		

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new EX09_JTab();
	}
}
