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

import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class store_home_panel extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the panel.
	 */
	public store_home_panel() {
		
		setForeground(new Color(0, 0, 0));
		setBackground(new Color(255, 240, 245));
		setBounds(100, 100, 540, 960);
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("4.5");
		lblNewLabel_1.setBounds(329, 131, 22, 22);
		add(lblNewLabel_1);
		
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
		
		JLabel lblNewLabel = new JLabel("가게 대표메뉴 이미지");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Sandoll 삼립호빵체 TTF Outline", Font.PLAIN, 50));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(49, 181, 414, 270);
		add(lblNewLabel);
		
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
		
		RoundedButton btnNewButton = new RoundedButton("끼로끼로하영이");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(65, 105, 225));
		btnNewButton.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 26));
		btnNewButton.setBounds(59, 110, 204, 61);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(224, 484, 218, 31);
		add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1_5 = new JLabel("주차 여부 : ");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5.setBounds(82, 734, 132, 33);
		add(lblNewLabel_1_5);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 539, 218, 31);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(224, 592, 218, 31);
		add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(224, 642, 218, 31);
		add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(224, 690, 218, 31);
		add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(224, 736, 218, 31);
		add(textField_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("가게 지역 : ");
		lblNewLabel_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_1.setBounds(82, 482, 132, 33);
		add(lblNewLabel_1_5_1);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("가게 주소 : ");
		lblNewLabel_1_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_2.setBounds(82, 539, 132, 33);
		add(lblNewLabel_1_5_2);
		
		JLabel lblNewLabel_1_5_3 = new JLabel("가게대표메뉴 : ");
		lblNewLabel_1_5_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_3.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_3.setBounds(59, 597, 151, 33);
		add(lblNewLabel_1_5_3);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("전화 번호 : ");
		lblNewLabel_1_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_2_1.setBounds(82, 647, 132, 33);
		add(lblNewLabel_1_5_2_1);
		
		JLabel lblNewLabel_1_5_2_1_1 = new JLabel("주차 여부 : ");
		lblNewLabel_1_5_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5_2_1_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 24));
		lblNewLabel_1_5_2_1_1.setBounds(82, 691, 132, 33);
		add(lblNewLabel_1_5_2_1_1);
		
		RoundedButton btnNewButton_2 = new RoundedButton("상세위치 지도보기");
		btnNewButton_2.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setBackground(new Color(65, 105, 225));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(59, 839, 174, 61);
		add(btnNewButton_2);
		
		RoundedButton btnNewButton_2_1 = new RoundedButton("리뷰 작성 및 보기");
		btnNewButton_2_1.setFont(new Font("Sandoll 삼립호빵체 TTF Basic", Font.PLAIN, 20));
		btnNewButton_2_1.setBackground(new Color(65, 105, 225));
		btnNewButton_2_1.setBorderPainted(false);
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.setBounds(268, 839, 174, 61);
		add(btnNewButton_2_1);
		
		JButton StarPointButton_1 = new JButton("");
		StarPointButton_1.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\heart.png"));
		StarPointButton_1.setBorderPainted(false);
		StarPointButton_1.setBackground(new Color(255, 240, 245));
		StarPointButton_1.setBounds(391, 111, 77, 61);
		add(StarPointButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\TeamProject\\src\\image\\star3.png"));
		lblNewLabel_2.setBounds(304, 112, 77, 61);
		add(lblNewLabel_2);
	}
}