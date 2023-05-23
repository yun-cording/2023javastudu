package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

public class Ex10_Cyan extends JPanel{
	public Ex10_Cyan() {
	setBackground(Color.CYAN);
	
	JRadioButton jrb1 = new JRadioButton("치킨");
	JRadioButton jrb2 = new JRadioButton("피자");
	JRadioButton jrb3 = new JRadioButton("고기");
	JRadioButton jrb4 = new JRadioButton("회");
	jrb1.setBackground(Color.ORANGE);
	jrb2.setBackground(Color.ORANGE);
	jrb3.setBackground(Color.ORANGE);
	jrb4.setBackground(Color.ORANGE);
	
	add(jrb1);
	add(jrb2);
	add(jrb3);
	add(jrb4);
//	JTabbedPane jtab = new JTabbedPane();
//	add(jtab);
	
	}	
}
