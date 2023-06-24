package network.homework;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import network.homework_db.VO;



public class DB_Client extends JFrame implements Runnable {
	JPanel jp1, jp2, jp3, jp4, jp5, jp6;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JButton jb1, jb2, jb3, jb4;
	JTextArea jta;
	JScrollPane jsp;

	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;

	public DB_Client() {
		super("DB 연동 정보");
		jp1 = new JPanel(new GridLayout(0, 2));
		jp2 = new JPanel(new GridLayout(0, 2));
		jp3 = new JPanel(new GridLayout(0, 2));
		jp4 = new JPanel(new GridLayout(0, 2));
		jp5 = new JPanel(new GridLayout(4, 0));
		jp6 = new JPanel();

		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();

		jb1 = new JButton("전체보기");
		jb2 = new JButton("삽입");
		jb3 = new JButton("삭제");
		jb4 = new JButton("검색");

		jp1.add(new JLabel("* CUSTID  :  ", JLabel.CENTER));
		jp1.add(jtf1);

		jp2.add(new JLabel("NAME  :  ", JLabel.CENTER));
		jp2.add(jtf2);

		jp3.add(new JLabel("ADDRESS  :  ", JLabel.CENTER));
		jp3.add(jtf3);

		jp4.add(new JLabel("PHONE  :  ", JLabel.CENTER));
		jp4.add(jtf4);

		jp5.add(jp1);
		jp5.add(jp2);
		jp5.add(jp3);
		jp5.add(jp4);

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);

		jp6.add(jb1);
		jp6.add(jb2);
		jp6.add(jb3);
		jp6.add(jb4);

		add(jp5, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);
		add(jp6, BorderLayout.SOUTH);

		setSize(600, 400);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 접속
		connected();

		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) {
					try {
						Protocol p = new Protocol();
						p.setCmd(0);
						out.writeObject(p);
						out.flush();
					} catch (Exception e2) {
					}
				} else {
					closed();
				}
			}
		});
		// 전체보기
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Protocol p = new Protocol();
					p.setCmd(1);
					out.writeObject(p);
					out.flush();
				} catch (Exception e2) {
				}

			}
		});
		// 삽입
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Protocol p = new Protocol();
				String custid = jtf1.getText().trim();
				String name = jtf2.getText().trim();
				String address = jtf3.getText().trim();
				String phone = jtf4.getText().trim();
				try {
					VO vo = new VO();
					Protocol p2 = new Protocol();
					vo.setCustid(custid);
					vo.setName(name);
					vo.setAddress(address);
					vo.setPhone(phone);
					p.setCmd(2);
					p.setVo(vo);
					out.writeObject(p);
					out.flush();
				} catch (Exception e2) {
					System.out.println(e2);
				}
			}
		});
	}// 생성자 끝

	// 접속 기능 메서드 생성
	public void connected() {
		try {
			s = new Socket("192.168.0.16", 7780);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void closed() {
		try {
			out.close();
			in.close();
			System.exit(0);
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {	// 1.전체보기, 2.삽입하기, 3.삭제, 4.검색, 5.고치기
					case 0:
						break esc;
					case 1:
						List<VO> list = p.getList();
						prn(list);
						break;
					case 2:
						List<VO> list2 = p.getList();
						prn(list2);
						break;
						
					}
				}
			} catch (Exception e) {
				System.out.println(e);
				// TODO: handle exception
			}		
		} // while문 끝
		closed();
	}

	public void prn(List<VO> list) {
		jta.setText("");
		jta.append("\n\t\t\t 회원 전체 정보 \n\n");
		jta.append("\t번호\t이름\t주소\t\t전화번호\n");
		for (VO k : list) {
			jta.append("\t" + k.getCustid() + "\t");
			jta.append(k.getName() + "\t");
			jta.append(k.getAddress() + "\t\t");
			jta.append(k.getPhone() + "\n");
		}
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
						new DB_Client();
			}
		});
	}
}
