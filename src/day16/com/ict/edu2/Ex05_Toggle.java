package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class Ex05_Toggle extends JFrame {

	public Ex05_Toggle() {
		super("토글버튼");

		JPanel jp = new JPanel();

//		JRadioButton jrb1 = new JRadioButton();
//		jrb1.setText("코딩");
//		jrb1.setSelected(true);

		ButtonGroup bg = new ButtonGroup();
		JToggleButton jtb1 = new JToggleButton();
		jtb1.setText("야구");
		jtb1.setSelected(true);

		JToggleButton jtb2 = new JToggleButton("축구");
		JToggleButton jtb3 = new JToggleButton("농구", true);
		JToggleButton jtb4 = new JToggleButton("배구");

//		bg.add(jrb1);
//		jp.add(jrb1);
		jp.add(jtb1);
		jp.add(jtb2);
		jp.add(jtb3);
		jp.add(jtb4);
		
		add(jp);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 200, ds.height / 2 - 200, 400, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex05_Toggle();
	}

}
