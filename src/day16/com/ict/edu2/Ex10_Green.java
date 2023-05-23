package day16.com.ict.edu2;

import java.awt.Color;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ex10_Green extends JPanel {
	public Ex10_Green() {
		setBackground(Color.green);
		
		JCheckBox jcb1 = new JCheckBox("축구");
		JCheckBox jcb2 = new JCheckBox("농구");
		JCheckBox jcb3 = new JCheckBox("야구");
		JCheckBox jcb4 = new JCheckBox("배구");
		jcb1.setBackground(Color.green);
		jcb1.setBackground(Color.green);
		jcb1.setBackground(Color.green);
		jcb1.setBackground(Color.green);
		add(jcb1);
		add(jcb2);
		add(jcb3);
		add(jcb4);
//		JTabbedPane jtab = new JTabbedPane();
//		add(jtab);
	}
	
}
