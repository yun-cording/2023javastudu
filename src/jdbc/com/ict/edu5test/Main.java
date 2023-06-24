package jdbc.com.ict.edu5test;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import jdbc.com.ict.edu5.Ex02_DAO;
import jdbc.com.ict.edu5.Ex02_VO;

import java.awt.FlowLayout;
import java.awt.Font;

public class Main extends JFrame {
	private JTextField jtf1;
	private JTextField jtf4;
	private JTextField jtf2;
	private JTextField jtf3;

	public Main() {
		super("DB 연동 정보");
		getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel bottom = new JPanel();
		getContentPane().add(bottom, BorderLayout.SOUTH);

		JButton insert = new JButton("삽입");

		JButton delete = new JButton("삭제");

		JButton search_update = new JButton("검색");
		bottom.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton selectAll = new JButton("전체보기");
		bottom.add(selectAll);
		bottom.add(insert);
		bottom.add(delete);
		bottom.add(search_update);

		JPanel center = new JPanel();
		getContentPane().add(center, BorderLayout.CENTER);
		center.setLayout(new BorderLayout(0, 0));

		JTextArea textArea = new JTextArea();
		JScrollPane jsp = new JScrollPane(textArea, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		textArea.setLineWrap(true);
		textArea.setEditable(false);
		center.add(jsp, BorderLayout.CENTER);

		JPanel top = new JPanel();
		getContentPane().add(top, BorderLayout.NORTH);
		top.setLayout(new BorderLayout(0, 0));

		JPanel 왼쪽 = new JPanel();
		top.add(왼쪽, BorderLayout.CENTER);
		왼쪽.setLayout(new GridLayout(0, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("CUSTID :");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		왼쪽.add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("NAME :");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		왼쪽.add(lblNewLabel_3);

		JLabel lblNewLabel_1 = new JLabel("ADDRESS");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		왼쪽.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("PHONE");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		왼쪽.add(lblNewLabel_2);

		JPanel 오른쪽 = new JPanel();
		top.add(오른쪽, BorderLayout.EAST);
		오른쪽.setLayout(new GridLayout(0, 1, 0, 0));

		jtf1 = new JTextField();
		오른쪽.add(jtf1);
		jtf1.setColumns(25);

		jtf2 = new JTextField();
		오른쪽.add(jtf2);
		jtf2.setColumns(25);

		jtf3 = new JTextField();
		오른쪽.add(jtf3);
		jtf3.setColumns(25);

		jtf4 = new JTextField();
		오른쪽.add(jtf4);
		jtf4.setColumns(25);

		setSize(600, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		selectAll.addActionListener(new ActionListener() { // 전체보기
			@Override
			public void actionPerformed(ActionEvent e) {
				String str = search_update.getText();
				if (str.equals("고치기")) {
					search_update.setText("검색하기");
					jtf1.setText("");
					jtf1.setEditable(true);
					jtf4.setText("");
					jtf2.setText("");
					jtf3.setText("");
				}
				textArea.setText("");
				textArea.setFont(new Font(getName(), Font.PLAIN, 15));
				ArrayList<VO> list = DAO.getInstance().getSelectAll();
				textArea.append("\n\t\t 회원 전체 정보 \n\n");
				textArea.append("\t번호\t이름\t주소\t전화번호\n");
				for (VO k : list) {
					textArea.append("   " + k.getCustid() + "\t");
					textArea.append(k.getName() + "\t");
					textArea.append(k.getAddress() + "\t");
					textArea.append(k.getPhone() + "\n");
				}
			}
		});

		insert.addActionListener(new ActionListener() { // 삽입
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				// custid가 null이면 삽입 불가
				// and 조건으로
				if (custid.length() > 0) {
					// custid 중복이면 삽입불가
					boolean idchk = DAO.getInstance().getIdchk(custid);
					if (idchk) {
						textArea.setText("");
						VO vo = new VO();
						vo.setCustid(custid);
						vo.setName(name);
						vo.setAddress(address);
						vo.setPhone(phone);
						int res = DAO.getInstance().getInsert(vo);
						if (res > 0) {
							JOptionPane.showMessageDialog(getParent(), "삽입 성공");
							ArrayList<VO> list = DAO.getInstance().getSelectAll();
							textArea.append("\n\t\t 회원 전체 정보 \n\n");
							textArea.append("\t번호\t이름\t주소\t전화번호\n");
							for (VO k : list) {
								textArea.append("   " + k.getCustid() + "\t");
								textArea.append(k.getName() + "\t");
								textArea.append(k.getAddress() + "\t");
								textArea.append(k.getPhone() + "\n");
							}
						} else {
							JOptionPane.showConfirmDialog(getParent(), "삽입 실패");
						}
					} else {
						JOptionPane.showMessageDialog(getParent(), "같은 custid가 존재합니다.");
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력 해주세요");
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});

		delete.addActionListener(new ActionListener() { // 삭제
			@Override
			public void actionPerformed(ActionEvent e) {
				String custid = jtf1.getText().trim();
				if (custid.length() > 0) {
					// 중복이면 삭제가능
					boolean idchk = DAO.getInstance().getIdchk(custid);
					textArea.setText("");
					// false 중복
					if (idchk) {
						JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						ArrayList<VO> list = DAO.getInstance().getSelectAll();
						textArea.append("\n\t\t 회원 전체 정보 \n\n");
						textArea.append("\t번호\t이름\t주소\t전화번호\n");
						for (VO k : list) {
							textArea.append("   " + k.getCustid() + "\t");
							textArea.append(k.getName() + "\t");
							textArea.append(k.getAddress() + "\t");
							textArea.append(k.getPhone() + "\n");
						}
					} else {
						Ex02_VO vo = new Ex02_VO();
						vo.setCustid(custid);
						int result = Ex02_DAO.getInstance().getDelete(vo);
						if (result > 0) {
							JOptionPane.showMessageDialog(getParent(), "삭제 성공");
							ArrayList<VO> list = DAO.getInstance().getSelectAll();
							textArea.append("\n\t\t 회원 전체 정보 \n\n");
							textArea.append("\t번호\t이름\t주소\t전화번호\n");
							for (VO k : list) {
								textArea.append("   " + k.getCustid() + "\t");
								textArea.append(k.getName() + "\t");
								textArea.append(k.getAddress() + "\t");
								textArea.append(k.getPhone() + "\n");
							}
						} else {
							JOptionPane.showMessageDialog(getParent(), "삭제 실패");
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "custid를 입력 해주세요");
				}
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				jtf4.setText("");
			}
		});

		search_update.addActionListener(new ActionListener() { // 검색 및 고치기
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton obj = (JButton)(e.getSource());
				String msg = obj.getText();
				if(msg.equals("검색")) {
					String custid = jtf1.getText().trim();
					if(custid.length()>0) {
						// custid가 중복이면 삭제가능
						boolean idchk = DAO.getInstance().getIdchk(custid);
						textArea.setText("");
						//false 중복
						if(idchk) {
							JOptionPane.showMessageDialog(getParent(), "custid가 존재하지 않습니다.");
						}else {
							VO vo = new VO();
							vo.setCustid(custid);
							VO vo2 = DAO.getInstance().getSelectOne(vo);
							textArea.setText("");
							jtf2.setText(vo2.getName());
							jtf3.setText(vo2.getAddress());
							jtf4.setText(vo2.getPhone());
							jtf1.setEditable(false);
							search_update.setText("고치기");
							selectAll.setEnabled(false);
							insert.setEnabled(false);
							delete.setEnabled(false);
						}
					}else {
						JOptionPane.showMessageDialog(getParent(), "custid를 입력해주세요.");
					}
				}else if(msg.equals("고치기")) {
					VO vo = new VO();
					vo.setCustid(jtf1.getText());
					vo.setName(jtf2.getText());
					vo.setAddress(jtf3.getText());
					vo.setPhone(jtf4.getText());
					
					int result = DAO.getInstance().getUpdate(vo);
					if(result >0 ) {
						textArea.setText("");
						JOptionPane.showMessageDialog(getParent(), "수정 성공");
						ArrayList<VO> list = DAO.getInstance().getSelectAll();
						textArea.append("\n\t\t 회원 전체 정보 \n\n");
						textArea.append("\t번호\t이름\t주소\t전화번호\n");
						for (VO k : list) {
							textArea.append("   " + k.getCustid() + "\t");
							textArea.append(k.getName() + "\t");
							textArea.append(k.getAddress() + "\t");
							textArea.append(k.getPhone() + "\n");
						}
					}
					search_update.setText("검색");
					selectAll.setEnabled(true);
					insert.setEnabled(true);
					delete.setEnabled(true);
					jtf1.setText("");
					jtf1.setEditable(true);
					jtf2.setText("");
					jtf3.setText("");
					jtf4.setText("");
					
				}
			}
		});

	}

	public static void main(String[] args) {
		new Main();
	}
}
