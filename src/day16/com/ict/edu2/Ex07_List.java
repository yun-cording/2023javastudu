package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Ex07_List extends JFrame {
	public Ex07_List() {
	super("리스트");
	
	JPanel jp = new JPanel();
	
	String[] items = {"좋아하는 운동" , "야구" , "농구" , "축구" , "배구"};
	
	JList<String> jcom = new JList<>(items);
	
	// jlabel
	// 텍스트 에어리어
	
	jp.add(jcom);
	
	add(jp);
	
	Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
	setBounds(ds.width/2-250,ds.height/2-250,500,500);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	
	
	}
	public static void main(String[] args) {
		new Ex07_List();
	}
}
