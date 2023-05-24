package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//	카드 레이아웃 : 카드가 뒤집혀 진 상태에서 이벤트가 발생하면 하나씩 보여주는 형태의 레이아웃
//				(여기서 카드란 JPanel 이다.)

public class Ex01_CardLayout extends JFrame {
	JPanel card1, card2, card3, card4, card5, pg1, pg2;
	JButton jb1, jb2, jb3, jb4;
	CardLayout cardLayout;

	public Ex01_CardLayout() {
		super("카드레이아웃");

		// 각각의 카드패널을 만들자
		card1 = new JPanel();
		card1.setLayout(new BorderLayout());
		card1.setBackground(Color.pink);
		card1.add(new JLabel("첫 번 째", JLabel.CENTER));

		card2 = new JPanel();
		card2.setLayout(new BorderLayout());
		card2.setBackground(Color.red);
		card2.add(new JLabel("두 번 째", JLabel.CENTER));

		card3 = new JPanel();
		card3.setLayout(new BorderLayout());
		card3.setBackground(Color.blue);
		card3.add(new JLabel("세 번 째", JLabel.CENTER));

		card4 = new JPanel();
		card4.setLayout(new BorderLayout());
		card4.setBackground(Color.gray);
		card4.add(new JLabel("네 번 째", JLabel.CENTER));

		card5 = new JPanel();
		card5.setLayout(new BorderLayout());
		card5.setBackground(Color.magenta);
		card5.add(new JLabel("다섯 번 째", JLabel.CENTER));
		
		// pg1을 카드 레이아웃으로 변경하자
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		// 크기지정(size)
//		pg1.setSize(40/0,500);
		// pg1 카드레이웃으로 변경 되었으므로 카드를 추가하자
		// pg1.add("호출이름", 해당 컨테이너 (카드JPanel));
		// 해당 카드를 호출할때는 show(cardLayout,"호출이름");
		pg1.add("1", card1);
		pg1.add("2", card2);
		pg1.add("3", card3);
		pg1.add("4", card4);
		pg1.add("5", card5);
		
		// 첫 카드를 지정하지 않으면 맨 처음 카드가 나온다.
		// 첫 카드를 지정하자
		cardLayout.show(pg1 , "3");
		
		pg2 = new JPanel();

		jb1 = new JButton("<<");
		jb2 = new JButton("<");
		jb3 = new JButton(">");
		jb4 = new JButton(">>");
		pg2.add(jb1);
		pg2.add(jb2);
		pg2.add(jb3);
		pg2.add(jb4);

		add(pg1, BorderLayout.CENTER);
		add(pg2, BorderLayout.SOUTH);

//			pack();
		setLocationRelativeTo(null);
//		setBounds(100, 100, 500, 300);
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);// 프레임에서 보이게하려면 true , 안보이게 하려면 false
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				cardLayout.first(pg1);	// pg1그룹에 첫번째꺼로 화면이 이동 보여줌
				cardLayout.show(pg1, "1"); // 카드 화면중 1번으로 이름이 설정된 화면으로 이동 보여줌
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(pg1);
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(pg1);
				
			}
		});
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.last(pg1);
				
			}
		});
	
	}

	public static void main(String[] args) {
		new Ex01_CardLayout();
	}
}
