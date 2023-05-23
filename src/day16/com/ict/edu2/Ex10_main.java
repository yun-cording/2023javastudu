package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class Ex10_main extends JFrame {
	Ex10_main() {
		super("JTab_2");

		// JPanel 을 상속한 클래스 객체로 만들기
		
		Ex10_Cyan cyan = new Ex10_Cyan();
		Ex10_Green green = new Ex10_Green();
		Ex10_Blue blue = new Ex10_Blue();

		
		JTabbedPane jtab = new JTabbedPane();
		jtab.addTab("blue tab1",blue);
		jtab.add("cyan tab2",cyan);
		jtab.add("green tab3",green);
		// JTab를 JFrame에 넣자
		add(jtab);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 300, 600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10_main();

	}
}
