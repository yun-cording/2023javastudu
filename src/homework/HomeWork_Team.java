package homework;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;

public class HomeWork_Team extends JFrame {
	JPanel sp, tp, cp, wp, wps, wp1, wp2, wp3;
	JTextField jtf1, jtf2, jtf3, jtf4, jtf5, jtfdown;
	JLabel jlb1, jlb2, jlb3, jlb4, jlb5, jlbtop;
	String[][] contents = { { "111", "김상우", "010-2212-2133", "부산시 금정구", "ICT인재" } };
	JTable table;
	String[] table_header = { "ID", "Name", "Phone", "Address", "Company" };
	JScrollPane scrolledTable;
	String[] button_labels = { "추가", "삭제", "수정", "", "", "검색", "지우기", "전체보기" };
	String[] items = { "이름", "아이디", "전화번호", "주소", "회사명" };
	JComboBox<String> jcb = new JComboBox<>(items);

	public HomeWork_Team() {
		super("");
		sp = new JPanel();
		tp = new JPanel();
		cp = new JPanel();
		wp = new JPanel(new GridLayout(3, 0));
		wp1 = new JPanel();
		wp2 = new JPanel(new GridLayout(6, 2, 5, 5));
		wp3 = new JPanel();
//		wp = new JPanel();

		tp.add(new JLabel("Address Book"));

		jlb1 = new JLabel("ID : ");
		jlb2 = new JLabel("이름 : ");
		jlb3 = new JLabel("전화 : ");
		jlb4 = new JLabel("주소 : ");
		jlb5 = new JLabel("회사 : ");

		jtf1 = new JTextField(15);
		jtf2 = new JTextField(15);
		jtf3 = new JTextField(15);
		jtf4 = new JTextField(15);
		jtf5 = new JTextField(15);
		wp2.add(jlb1);
		jlb1.setHorizontalAlignment(JLabel.CENTER);
		wp2.add(jtf1);
		wp2.add(jlb2);
		jlb2.setHorizontalAlignment(JLabel.CENTER);
		wp2.add(jtf2);
		wp2.add(jlb3);
		jlb3.setHorizontalAlignment(JLabel.CENTER);
		wp2.add(jtf3);
		wp2.add(jlb4);
		jlb4.setHorizontalAlignment(JLabel.CENTER);
		wp2.add(jtf4);
		wp2.add(jlb5);
		jlb5.setHorizontalAlignment(JLabel.CENTER);
		wp2.add(jtf5);

		wp.add(wp1);
		wp.add(wp2);
		wp.add(wp3);

		for (int i = 0; i < 8; i++) {
			if (i == 3) {
				sp.add(new JComboBox<>(items));
			} else if (i == 4) {
				jtf1 = new JTextField(15);
				sp.add(jtf1);
			} else {
				sp.add(new JButton(button_labels[i]));
			}
		}

		table = new JTable(contents, table_header);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

		scrolledTable = new JScrollPane(table); // 스크롤 될 수 있도록 JScrollPane 적용
		scrolledTable.setBorder((new LineBorder(Color.black)));

		cp.add(scrolledTable);

		add(wp, BorderLayout.WEST);
		add(cp, BorderLayout.CENTER);
		add(sp, BorderLayout.SOUTH);
		add(tp, BorderLayout.NORTH);

		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HomeWork_Team();
	}
}
