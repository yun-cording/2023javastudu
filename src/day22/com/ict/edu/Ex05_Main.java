package day22.com.ict.edu;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame{
	Ex05_Canvas canvas = new Ex05_Canvas();
	public Ex05_Main() {
		super("원 찍기");
		
		add(canvas);
		
		setSize(300,300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05_Main();
	}
}
