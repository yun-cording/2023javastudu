package network.multichat.copy;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClient extends JFrame implements Runnable {
	CardLayout cardLayout;
	JPanel pg, login_p, wait_p, chat_p;
	JLabel img;
	JButton login_bt, memo_bt, join_bt, mkRoom_bt, exit_bt, send_bt, out_bt;
	JList user_list, room_list, join_list;
	JTextField msg_tf;
	JTextArea jta;
	// 접속
	Socket s = null;
	// 객체를 파일에 읽고 쓰는 ObjectOutputStream , ObjectInputStream
	// ex) Date data = new Date(); 여기서 data부분이 Date클래스의 객체 date
	// 이러한 객체를 파일에 써서 저장하게 되면 프로그램이 재실행 되어도 해당 객체를 파일에서 읽어서 사용할수 있어서 유용함
	// 객체를 파일에 쓴다라는 말은 다른말로 하면 객체를 스트림으로 만든다. 다른말로 객체의 직렬화라고도 함.
	// 이렇게 객체를 직렬화 해서 쓰러면 Serializable 인터페이스를 구현한 클래스로 만든 객체여야한다.
	// 이말은 우리가 여기서 사용중인 Protocol 클래스에서 implements Serializable 했으니 프로토콜을 직렬화해서 사용할수 있었던것
	ObjectOutputStream out = null;
	ObjectInputStream in = null;	

	public ChatClient() {
		super("멀티 채팅");
		cardLayout = new CardLayout();
		pg = new JPanel();
		pg.setBorder(new EmptyBorder(10, 10, 10, 10));
		pg.setLayout(cardLayout);

		// 첫번재 카드
		login_p = new JPanel(new BorderLayout());

		img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient.class.getResource("/images/image.PNG")));

		JPanel jp1 = new JPanel(new GridLayout(2, 1));
		JPanel jp1_1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp1_1.add(new JLabel("닉네임 : "));
		JTextField nickname_tf = new JTextField(10);
		jp1_1.add(nickname_tf);

		JPanel jp1_2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		login_bt = new JButton(" 입장하기 ");
		jp1_2.add(login_bt);

		jp1.add(jp1_1);
		jp1.add(jp1_2);

		login_p.add(img, BorderLayout.CENTER);
		login_p.add(jp1, BorderLayout.SOUTH);

		// 두번째 카드
		wait_p = new JPanel();
		wait_p.setLayout(new BorderLayout());

		// 동쪽
		JPanel east_p = new JPanel();
		east_p.setLayout(new BorderLayout());
		wait_p.add(east_p, BorderLayout.EAST);

		// 크기 지정
		east_p.setPreferredSize(new Dimension(120, 300));
		east_p.add(new JLabel(" [대기실] "), BorderLayout.NORTH);

		user_list = new JList();
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(user_list);
		east_p.add(jsp, BorderLayout.CENTER);

		JPanel east_south = new JPanel();
		east_south.setLayout(new GridLayout(4, 1, 0, 0));
		memo_bt = new JButton("쪽지보내기");
		join_bt = new JButton("방 참여");
		mkRoom_bt = new JButton("방 만들기");
		exit_bt = new JButton("종료");

		east_south.add(memo_bt);
		east_south.add(join_bt);
		east_south.add(mkRoom_bt);
		east_south.add(exit_bt);
		east_p.add(east_south, BorderLayout.SOUTH);

		JPanel center_p = new JPanel();
		center_p.setLayout(new BorderLayout());

		center_p.add(new JLabel("[ 방 제목 ] "), BorderLayout.NORTH);

		room_list = new JList();
		room_list.setFont(new Font("굴림", Font.BOLD, 20));

		JScrollPane jsp2 = new JScrollPane();
		jsp2.setViewportView(room_list);
		center_p.add(jsp2, BorderLayout.CENTER);

		wait_p.add(center_p, BorderLayout.CENTER);

		// 세번째 카드
		chat_p = new JPanel();
		chat_p.setLayout(new BorderLayout());

		JPanel ch_east = new JPanel();
		ch_east.setLayout(new BorderLayout());
		ch_east.setPreferredSize(new Dimension(90, 300));
		ch_east.add(new JLabel(" [참여자] "), BorderLayout.NORTH);

		join_list = new JList();
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setViewportView(join_list);
		ch_east.add(jsp3, BorderLayout.CENTER);

		out_bt = new JButton("방 나가기");
		ch_east.add(out_bt, BorderLayout.SOUTH);

		JPanel ch_center = new JPanel();
		ch_center.setLayout(new BorderLayout());

		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		JScrollPane jsp4 = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		ch_center.add(jsp4, BorderLayout.CENTER);

		JPanel center_south = new JPanel();
		center_south.setLayout(new BorderLayout());

		msg_tf = new JTextField();
		send_bt = new JButton("보내기");

		center_south.add(msg_tf, BorderLayout.CENTER);
		center_south.add(send_bt, BorderLayout.EAST);

		ch_center.add(center_south, BorderLayout.SOUTH);

		chat_p.add(ch_east, BorderLayout.EAST);
		chat_p.add(ch_center, BorderLayout.CENTER);

		pg.add(login_p, "login");
		pg.add(wait_p, "wait");
		pg.add(chat_p, "chat");

		// 첫 카드를 지정
		cardLayout.show(pg, "login");

		add(pg);
		setSize(450, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		//====================여기까지 스윙창 모양구성
		
		// 이제 기능 구현
		
		// 창 닫기
		addWindowListener(new WindowAdapter() { // 윈도우 리스너 종류가 많아서 어뎁터로 생성후
			@Override
			public void windowClosing(WindowEvent e) { // 실제로사용한 윈도우 클로징 메서드만 생성
				if(s != null) { // null이 아닌경우이니 접속된 상태 일경우				
				Protocol p = new Protocol();
				p.setCmd(0); // 창닫는거니 프로토콜 0번:종료 세팅
				try {
					out.writeObject(p);
					out.flush();
				} catch (Exception e2) {
				}
				} else { // 그외에 접속이 안되어있으면 종료 메서드 closed 실행
					closed();
				}
				
			}
		});
	
		// 입장하는 버튼 login_bt
		login_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickname_tf.getText().trim(); // 스트링 네임 생성후 닉네임을 입력받음(trim() : 앞뒤 빈칸제거)
				if(name.length()>0) { // 이름 입력창이 입력이 됐을경우
					// 서버 접속 메서드 connected 실행
					if(connected()) { 
						try {
							Protocol p = new Protocol();
							p.setCmd(2); //프로토콜 2:접속 및 갱신 세팅
							p.setMsg(name); // 이름 넣어줌
							out.writeObject(p); // 아웃스트림으로 적어서 프로토콜로 보냄
							cardLayout.show(pg, "wait");//카드레이아웃 pg의 wait창 나타내줌
						} catch (Exception e2) {
						}
					}else {
						JOptionPane.showMessageDialog(getParent(), "닉네임을 입력하세요");
						nickname_tf.setText("");
						nickname_tf.requestFocus();
					}
				}
			}
		});
		
		exit_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					Protocol p = new Protocol();
					p.setCmd(0); // 0번 종료
					out.writeObject(p);
				} catch (Exception e2) {
				}
			}
		});
		
		memo_bt.addActionListener(new ActionListener() { // 쪽지보내기 버튼
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String msg = JOptionPane.showInputDialog("내용을 입력하세요");//내용입력하라고 안내문구
					if(msg.length()<=0 || msg == null) { // 입력값이 없거나 null일경우
						JOptionPane.showMessageDialog(getParent(), "내용을 입력하세요");
					}else {
						Protocol p = new Protocol();
						p.setCmd(6);
						p.setMsg(msg);
						//대기실 리스트에서 특정 사람 선택
						p.setC_index(user_list.getSelectedIndex());//유저목록중 선택된사람한테
						
						out.writeObject(p);
						out.flush();
					}
				} catch (Exception e2) {
				}
			}
		});
		
		mkRoom_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			// 사용자에게 방 제목 받기
				String name = JOptionPane.showInputDialog(getParent(),"방 제목을 입력하세요");
				if(name.length()<=0 || name == null) {
					JOptionPane.showMessageDialog(getParent(), "내용을 입력하세요");
				}else {
					try {
						Protocol p = new Protocol();
						p.setCmd(3);
						p.setMsg(name);
						
						out.writeObject(p);
						out.flush();
						cardLayout.show(pg,"chat");
						} catch (Exception e2) {
					}
				}
			}
		});
		join_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			int r_index = room_list.getSelectedIndex(); // 방 목록중 선택한 것
			if(r_index>=0) {
				try {
					Protocol p = new Protocol();
					p.setCmd(4);
					p.setR_index(r_index);
					out.writeObject(p);
					out.flush();
					cardLayout.show(pg,"chat");
				} catch (Exception e2) {
				}
			}
			}
		});
		
		send_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			sendMessage();	
			}
		});
		
		msg_tf.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			sendMessage();	
			}
		});
		
		out_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				jta.setText("");
				Protocol p = new Protocol();
				p.setCmd(5);
				out.writeObject(p);
				out.flush();
				cardLayout.show(pg,"wait");
			} catch (Exception e2) {
			}	
			}
		});
		
	}

	// 서버로 연결하는 기능 커넥티드 
	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("192.168.0.16" , 7779); // 자기 아이피주소와 서버랑 통신할 소켓 넘버 7779(서버랑 같아야함)
			out = new ObjectOutputStream(s.getOutputStream()); //42번줄 설명 참조
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start(); // 스레드를 생성해서 (this).start = (ChatClient).start => run 메서드로 이동
			return value; // 이대로 작동이 되면 value에 있는 true값이 전달되어서 연결이 됨
		} catch (Exception e) {
			System.out.println(e); //연결이 실패했을경우 오류를 메세지를 보기위한 내용
		}
		return false; // 연결에 실패했으니 false 반환
	}
	
	// 종료 메서드 모든 스트림 소켓 닫아주고 시스템 종료
	private void closed() {
		try {
			out.close();
			in.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
		}
	}
	
	private void sendMessage() {
		try {
			String msg = msg_tf.getText().trim();
			if(msg.length()>0) {
				Protocol p = new Protocol();
				p.setCmd(1);
				p.setMsg(msg);
				out.writeObject(p);
				out.flush();
				msg_tf.setText("");
				msg_tf.requestFocus();
			}
		} catch (Exception e) {
		}
	}
	
	@Override
	public void run() {
		esc:while(true) {
			try {
				//
				Object obj = in.readObject(); 
				if(obj != null) {
					Protocol p = (Protocol)obj;
					switch(p.getCmd()) { // 스위치문으로 프로토콜에서 설정된 cmd에 따라 해당기능을 실행하기 위해
					// 0 : 종료 , 1:메세지 , 2:접속 및 갱신 , 4:방참여 , 5: 대화방참여자목록 , 6:쪽지보내기
					case 0: // 종료
						break esc; // esc라는 명칭의 레이블을 통해 스위치케이스문뿐만아니라 while문도 탈출하기 위함
					case 1: // 메세지 전달
						jta.append(p.getMsg()+"\n"); // jta창에 append 출력한다. 프로토콜에 저장되어있는 메세지를
						jta.setCaretPosition(jta.getText().length());//사용하면 화면 맨밑에 꺼가 안보임?로 알고있음
						break;
					case 2: //2: 접속 및 갱신
						//대기자 명단
						user_list.setListData(p.getNames());//프로토콜에 저장되어 있는이름들 즉 대기자 목록
						//
						room_list.setListData(p.getRooms());//프로토콜에 저장되어 있는방들 즉 방 목록
						break;
					case 4: // 4: 방참여
						join_list.setListData(p.getNames()); // 프로토콜에 저장되어 있는 방에 참여한 사람들 목록
						jta.append(p.getMsg()+"\n"); //
						break;
					case 5: // 대화방 참여자 목록
						join_list.setListData(p.getNames()); // 프로토콜에 저장되어 있는 방에 참여한 사람들 목록
						break;
					case 6: // 쪽지 보내기 기능
						JOptionPane.showMessageDialog(getParent(), p.getMsg()); //getParent() 객체의 부모요소 반환하는 역활
						/*사용하는 경우
						 * 상속 계층에서 현재 객체의 직계 부모 클래스를 얻고자 할 때.
						 * 객체가 속한 컨테이너, 예를 들면 패널이나 프레임,의 부모 컨테이너를 얻고자 할 때.
						 * 파일 시스템에서 디렉토리 구조를 탐색하거나 파일의 상위 디렉토리를 찾고자 할 때.
						 */
						break;
										
					}
				}
			} catch (Exception e) {
			}
		} // 무한루프문 끝
		closed(); // 무한루프문이 끝나면 종료메서드를 실행해서 소켓 및 모든 시스템 닫아줌
//		System.exit(0);
		
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ChatClient();
			}
		});
	}
}
