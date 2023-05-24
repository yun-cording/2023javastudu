package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;

// 대한민국 , 캐나다 , 영국 , 스위스의 수도가 각각 HashMap에 저장시키고
// 원하는 나라가 key값이 되어 , 화면에서 나라를 물어보면 수도가
// 출력되는 프로그램 작성

public class Ex02_Main extends JFrame {
	JPanel jp;
	JTextField jtf;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;

	public Ex02_Main() {
		super("수 도 알아내기");

		jp = new JPanel();
		jtf = new JTextField(15);
		jb1 = new JButton("알려줘");
		jb2 = new JButton("싫어");
		jta = new JTextArea(10, 30);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true); // 자동 줄바꿈
		jta.setEditable(false);

		jp.add(new JLabel("나라 입력 : "));

		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);

		add(jp, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jtf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				DataPrn();
			}
		});

		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				DataPrn();

			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				jtf.setText("");
				jta.setText("");
				// 커서 위치 지정
				jtf.requestFocus();// 커서가 자동으로 jtf로 이동함
			}
		});
	
	}
	// 위 중복된 코드가 있으므로 메서드를 만들자
	public void DataPrn() {
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "어타와");
		map.put("영국", "런던");
		map.put("중국", "차이나");

		Set<String> keys = map.keySet();
		if (jtf.getText().length() == 0) {
			jta.append("데이터를 입력하세요\n");
			jtf.requestFocus();
		} else {
			String str = jtf.getText().trim();
			if (keys.contains(str)) {
				String city = map.get(str);
				jta.append(str + "의 수도는 " + city + "입니다.\n");
			} else {
				jta.append("데이터에 없는 나라 입니다.");
			}
			jtf.setText("");
			jtf.requestFocus();
		}
	
	}

	public static void main(String[] args) {
		new Ex02_Main();

	}
}
	