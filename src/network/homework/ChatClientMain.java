package network.homework;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChatClientMain extends JFrame {
	CardLayout cardLayout ;
	JPanel jp;
	
	public ChatClientMain() {
		super("카드레이아웃클래스화");
		jp = new JPanel();
		cardLayout = new CardLayout();
		jp.setLayout(cardLayout);
		ChatClientPage1 cp1 = new ChatClientPage1(cardLayout,jp);
//		ChatClientPage2 cp2 = new ChatClientPage2(this);
		
		jp.add("chatpage1",cp1);
//		jp.add("chatpage2",cp2);
		
		add(jp);
	
		
		
		setSize(380, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ChatClientMain();
	}
}
