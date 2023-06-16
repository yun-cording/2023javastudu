package network.homework;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClientPage1 extends JPanel {
	CardLayout chat;
	JPanel jp , jp1 , jp2;
	
	public ChatClientPage1(CardLayout cardLayout,JPanel jp) {
	this.chat = cardLayout;
	this.jp = jp;
	
	jp = new JPanel();
	jp.setBorder(new EmptyBorder(10,10,10,10));
	jp.setLayout(cardLayout);
	add(jp);
	
	jp1 = new JPanel();
	jp.add(jp1,"login");
	jp1.setLayout(new BorderLayout());
	
	jp2 = new JPanel();
	jp1.add(jp2, BorderLayout.SOUTH);
	jp2.setLayout(new GridLayout(2,1));
	
	JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	jp3.add(new JLabel("닉네임 : "));
	
	JTextField jtf = new JTextField(10);
	jp3.add(jtf);
	jp2.add(jp3);
	
	JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	JButton jb = new JButton(" 입장하기 ");
	jp4.add(jb);
	
	jp2.add(jp4);
	
	JLabel img = new JLabel("");
	img.setHorizontalAlignment(SwingConstants.CENTER);
	img.setIcon(new ImageIcon(ChatClient.class.getResource("/images/image.png")));
	jp.add(img, BorderLayout.CENTER);
	
	}
}