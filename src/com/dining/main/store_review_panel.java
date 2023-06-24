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
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class store_review_panel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public store_review_panel() {
		
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
		
		JLabel lblNewLabel = new JLabel("리뷰");
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(210, 260, 118, 54);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\label.png"));
		lblNewLabel_1.setBounds(0, 10, 540, 330);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("작성자:");
		lblNewLabel_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(61, 384, 67, 29);
		add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(163, 384, 317, 61);
		add(textArea);
		
		JLabel lblNewLabel_2_1 = new JLabel("2023/06/20");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2_1.setBounds(42, 416, 96, 29);
		add(lblNewLabel_2_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(163, 486, 317, 61);
		add(textArea_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("작성자:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2_2.setBounds(61, 491, 67, 29);
		add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("2023/06/20");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2_1_1.setBounds(42, 518, 96, 29);
		add(lblNewLabel_2_1_1);
		
		JTextArea textArea_1_1 = new JTextArea();
		textArea_1_1.setBounds(163, 587, 317, 61);
		add(textArea_1_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("작성자:");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2_2_1.setBounds(61, 587, 67, 29);
		add(lblNewLabel_2_2_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("2023/06/20");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2_1_1_1.setBounds(42, 619, 96, 29);
		add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("별점 주기");
		lblNewLabel_2_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 18));
		lblNewLabel_2_2_1_1.setBounds(61, 705, 67, 29);
		add(lblNewLabel_2_2_1_1);
		
		textField = new JTextField();
		textField.setBounds(148, 707, 67, 29);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("리뷰 남기기:");
		lblNewLabel_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(32, 744, 96, 43);
		add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 755, 327, 148);
		add(textField_1);
		textField_1.setColumns(10);
		
		RoundedButton btnNewButton = new RoundedButton("저장하기");
		btnNewButton.setBorderPainted(false);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setBounds(366, 710, 109, 29);
		add(btnNewButton);
		
	}

}