package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex05_File_up extends JFrame{
	
		JPanel jp ;
		JButton jb ;
		JTextArea jta;
		JTextField jtf ;
	public Ex05_File_up() {
		super("불러오기");
		jp = new JPanel();
		jb = new JButton("읽기");
		jta = new JTextArea();
		jtf = new JTextField(30);
		
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf);
		jp.add(jb);
		add(jp,BorderLayout.NORTH);
		add(jta);
		
		jb.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				String path = jtf.getText();
				File file = new File(path);
				FileInputStream fis = null ;
				
				
				try {
					fis = new FileInputStream(file);
					byte[] r= fis.readAllBytes();
					String msg = new String(r);
					jta.setText(msg);
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						fis.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				
				
			}
		});
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Ex05_File_up();
	}
}
