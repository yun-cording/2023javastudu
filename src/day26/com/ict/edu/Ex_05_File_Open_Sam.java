package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex_05_File_Open_Sam extends JFrame{
	JPanel jp ;
	JTextField jtf;
	JButton jb ;
	JTextArea jta ; 
	JScrollPane jsp;
	public Ex_05_File_Open_Sam() {
		super("불러오기");
		jp = new JPanel();
		jtf = new JTextField(20);
		jb = new JButton("불러오기");
		jta = new JTextArea();
		jsp = new JScrollPane(jta , ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf);
		jp.add(jb);
		add(jp,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		
		
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		//저장하기 버튼 눌렀을때
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				F_open();
			}
		});
		//엔터눌렀을때
		jtf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				F_open();
			}
		});
		jtf.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기" , FileDialog.LOAD);
				fd.setVisible(true);
				String msg = fd.getDirectory()+fd.getFile();
				System.out.println(msg);
				if(! msg.equals("nullnull")) {
					jtf.setText(msg);	
				}
			}
		});
	}
	
	private void F_open(){
		String pathname = jtf.getText().trim(); // trim 앞뒤 빈칸제거 스페이스바 같은 빈칸들
		if(pathname.length()>0){
			File file = new File(pathname);
			FileInputStream fis = null;
			BufferedInputStream bis = null;
			try {
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
			
				byte[] b =new byte[(int)file.length()];
				
				bis.read(b);
				String msg = new String(b).trim();
				jta.setText(msg);
				F_open();
			} catch (Exception e) {

			}finally {
				try {
					fis.close();
					bis.close();
				} catch (Exception e2) {

				}
			}
		}
	}
	
	public static void main(String[] args) {
		new Ex_05_File_Open_Sam();
	}
}
