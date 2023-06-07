package jdbc.com.ict.edu5;

import java.awt.FileDialog;
import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// 메뉴 : 메뉴바 , 메뉴 , 메뉴아이템
// 메뉴바에 메뉴를 붙인다. 메뉴에 메뉴아이템을 붙인다.
// 메뉴아이템 < 메뉴< 메뉴바 < 프레임
// 메뉴바는 프레임에 붙인다. (setJMenuBar)
public class Ex01_Menu extends JFrame {
	JTextArea jta;
	JScrollPane jsp;
	JMenuBar jmb;
	JMenu m_file, m_from, font_form, m_help;
	JMenuItem i_newFile, i_openFile, i_saveFile, i_exitFile, i_Item1, i_Item2, i_Item3, i_help, i_info;

	public Ex01_Menu() {
		super("간단메모장");

		jta = new JTextArea();
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);

		// 메뉴바 , 메뉴 , 메뉴 아이템 순으로 생성
		jmb = new JMenuBar();

		m_file = new JMenu(" 파  일 ");
		m_from = new JMenu(" 서  식 ");
		font_form = new JMenu(" 글자서식 ");
		m_help = new JMenu(" 도 움 말 ");

		i_newFile = new JMenuItem(" 새파일 ");
		i_openFile = new JMenuItem(" 열  기 ...");
		i_saveFile = new JMenuItem(" 저  장 ...");
		i_exitFile = new JMenuItem(" 종  료 ...");
		i_Item1 = new JMenuItem(" 도 움 , 기울기 , 30");
		i_Item2 = new JMenuItem("궁 서 , 굵 게 , 40");
		i_Item3 = new JMenuItem(" 굴 림 , 기 본 , 20");
		i_help = new JMenuItem(" 도 움 말 ");
		i_info = new JMenuItem(" 메 모 장 정보");

		// 메뉴아이템을 메뉴에 붙이자
		m_file.add(i_newFile);
		m_file.add(i_openFile);
		m_file.addSeparator();
		m_file.add(i_saveFile);
		m_file.addSeparator();
		m_file.add(i_exitFile);
		// 서식 안에 글자서식을 넣고 그후에 메뉴아이템들 넣기
		m_from.add(font_form);

		font_form.add(i_Item1);
		font_form.add(i_Item2);
		font_form.add(i_Item3);

		m_help.add(i_help);
		m_help.add(i_info);

		// 메뉴를 메뉴바에 붙이자.
		jmb.add(m_file);
		jmb.add(m_from);
		jmb.add(m_help);

		// 메뉴바를 프레임에 붙인다.
		setJMenuBar(jmb);
		add(jsp);

		setSize(600, 600);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 새파일
		i_newFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 메모장안에 글자 존재 여부 판단.
				int size = jta.getText().length();
				if (size == 0) {
					jta.setText("");
				} else {
					int res = JOptionPane.showOptionDialog(getParent(), "변경 내용을 제목 없음에 저장 하시겠습니까?", "간단 메모장",
							JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null, null);
					if (res == 0) {
						// 실제 저장하는 코드
						FileDialog fd = new FileDialog((JFrame) getParent(), "저장하기", FileDialog.SAVE);
						fd.setVisible(true);
						String msg = fd.getDirectory()+fd.getFile();
						// 파일에 내용이 있으면 저장하는 내용 실행
						File file = new File(msg);
						FileOutputStream fos = null;
						try {
							fos = new FileOutputStream(file , true);
							String str = jta.getText();
							byte[] arr = str.getBytes();
							fos.write(arr);
						} catch (Exception e2) {
							// TODO: handle exception
						}finally {
							try {
								fos.close();
							} catch (Exception e3) {
								// TODO: handle exception
							}
						}

					} else if (res == 1) {
						jta.setText("");
					} else if (res == 2) {
						return;
					}
				}

			}
		});
		// 열기
		i_openFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((JFrame) getParent(), "파일 열기", FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				if(! msg.equals("nullnull")) {
					jta.setText("");
					File file = new File(msg);
					FileInputStream fis = null;
					
					try {
						fis = new FileInputStream(file);
						byte[] r = fis.readAllBytes();
						String msg2 = new String(r);
						jta.setText(msg2);
					} catch (Exception e2) {
						// TODO: handle exception
					}finally {
						try {
							fis.close();
						} catch (Exception e3) {
							// TODO: handle exception
						}
					}
				}
			}
		});
		// 저장
		i_saveFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(! jta.getText().equals("")) {
					FileDialog fd = new FileDialog((JFrame) getParent(), "저장하기", FileDialog.SAVE);
					fd.setVisible(true);
					String msg = fd.getDirectory()+fd.getFile();
					// 파일에 내용이 있으면 저장하는 내용 실행
					if(! msg.equals("nullnull")) {
						File file = new File(msg);
						FileWriter fw = null;
						BufferedWriter bw = null;
						try {
							fw = new FileWriter(file);
							bw = new BufferedWriter(fw);
							String str = null;
							bw.write(str);
							bw.flush();
						} catch (Exception e2) {
						}finally {
							try {
								bw.close();
								fw.close();
							} catch (Exception e3) {
							}
						}
					}
					
				}else {
					// 파일에 아무 내용을 안적었으면 저장할내용이 없다고 얘기할 파일 다이얼로그 추가하기
					JOptionPane.showMessageDialog(getParent(), "저장할 내용이없습니다", "MESSAGE 창", JOptionPane.QUESTION_MESSAGE);
					
				}
			}
		});

		i_exitFile.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
				// 원래는 내용이 변경되면 저장할지를 물어보고
				// 내용이 변경되지 않으면 그냥 종료
				int res = JOptionPane.showOptionDialog(getParent(),"변경내용을 저장할까요?","간단 메모장", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, null , null);
				if(res == 0) {
					
				}else if(res == 1) {
					System.exit(0);
				}else {
					return;
				}
			}
		});

		i_Item1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
//				Font font = new Font(글꼴, 스타일 ,사이즈);
				Font font = new Font("돋움", Font.ITALIC, 30);
				jta.setFont(font);
			}
		});
		i_Item2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 궁서 , 굵게 , 40
				Font font = new Font("궁서", Font.BOLD, 40);
				jta.setFont(font);
			}
		});
		i_Item3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// r 굴림 , 기본 , 20
				Font font = new Font("굴림", Font.PLAIN, 20);
				jta.setFont(font);
			}
		});

		i_help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 메세지창 호출
				JOptionPane.showMessageDialog(getParent(), " 도움말 ");
			}
		});

		i_info.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 메세지창 호출
				JOptionPane.showMessageDialog(getParent(), " 간단 메모장 그잡채 ");
			}
		});

	}

	public static void main(String[] args) {
		new Ex01_Menu();
	}
}