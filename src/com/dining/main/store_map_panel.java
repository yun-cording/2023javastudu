package com.dining.main;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class store_map_panel extends JPanel {

	/**
	 * Create the panel.
	 */
	public store_map_panel() {
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel sidetool = new JLabel("");
		sidetool.setOpaque(true);
		sidetool.setBackground(new Color(255, 240, 245));
		sidetool.setBounds(405, 97, 91, 15);
		add(sidetool);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorderPainted(false);
		menuBar.setToolTipText("");
		menuBar.setBackground(new Color(255, 240, 245));
		menuBar.setBounds(418, 40, 62, 61);
		add(menuBar);
		
		JMenu movemenu = new JMenu("");
		movemenu.setOpaque(true);
		movemenu.setIconTextGap(0);
		movemenu.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\menubutton.png"));
		movemenu.setBorderPainted(true);
		movemenu.setBackground(new Color(255, 240, 245));
		menuBar.add(movemenu);
		
		JMenuItem movemenu_1 = new JMenuItem("주간Best");
		movemenu_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_1.setOpaque(true);
		movemenu_1.setBorderPainted(true);
		movemenu_1.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_1);
		
		JMenuItem movemenu_2 = new JMenuItem("음식카테고리");
		movemenu_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_2.setOpaque(true);
		movemenu_2.setBorderPainted(true);
		movemenu_2.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_2);
		
		JMenuItem movemenu_3 = new JMenuItem("오늘 뭐먹죠?");
		movemenu_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		movemenu_3.setOpaque(true);
		movemenu_3.setBorderPainted(true);
		movemenu_3.setBackground(new Color(65, 105, 225));
		movemenu.add(movemenu_3);
		
		JMenuItem mypage = new JMenuItem("MY Page");
		mypage.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 14));
		mypage.setOpaque(true);
		mypage.setBorderPainted(true);
		mypage.setBackground(new Color(65, 105, 225));
		movemenu.add(mypage);
		
		JButton homeButton = new JButton("");
		homeButton.setBorderPainted(false);
		homeButton.setIcon(new ImageIcon("C:\\TeamProject\\\\src\\image\\homebutton_1.png"));
		homeButton.setBackground(new Color(255, 240, 245));
		homeButton.setBounds(329, 37, 77, 69);
		add(homeButton);
		
		JLabel lblNewLabel = new JLabel("가게 이미지");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 122, 414, 350);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("가게 위치");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBackground(new Color(255, 128, 64));
		lblNewLabel_1.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(49, 548, 414, 350);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("음식점 주소 :");
		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(94, 494, 91, 23);
		add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(195, 495, 268, 24);
		add(textArea);
		
		JButton homeButton_1 = new JButton("");
		homeButton_1.setIcon(new ImageIcon("C:\\Users\\zdbst\\Desktop\\ㄱㄱ.png"));
		homeButton_1.setBorderPainted(false);
		homeButton_1.setBackground(new Color(255, 240, 245));
		homeButton_1.setBounds(242, 40, 77, 69);
		add(homeButton_1);
	}
}