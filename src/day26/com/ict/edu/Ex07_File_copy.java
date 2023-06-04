package day26.com.ict.edu;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ex07_File_copy extends JFrame{
		JPanel jp , jp1 , jp2; 
		JButton jb ; 
		JTextField jtf1 , jtf2; 
		
	public Ex07_File_copy() {
		super("복사하기");
		jp = new JPanel(new GridLayout(2,3));
		jp1 = new JPanel();
		jp2 = new JPanel();
		jb = new JButton("복사하기");
		jtf1 = new JTextField(20);
		jtf2 = new JTextField(20);
		jp1.add(new JLabel("원본위치 : "));
		jp1.add(jtf1);
		jp1.add(new JLabel("                        "));
		jp2.add(new JLabel("사본위치 : "));
		jp2.add(jtf2);
		jp2.add(jb);
		jp.add(jp1);
		jp.add(jp2);
		
		add(jp);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				F_copy();
			}
		});
		jtf1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				F_copy();
			}
		});
		
		jtf2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				F_copy();
			}
		});
		
	}
	private void F_copy() {
		String movepath = jtf1.getText().trim();
		String copypath = jtf2.getText().trim();
		if(movepath.length()>0){
			File movefile = new File(movepath);
			File copyfile = new File(copypath);
			FileInputStream fis = null;
			FileOutputStream fos = null;
			try {
				fis = new FileInputStream(movefile);
				fos = new FileOutputStream(copyfile);
				byte[] b = fis.readAllBytes();
				fos.write(b);
				fos.flush();
				
			} catch (Exception e) {
				// TODO: handle exception
			}finally {
				try {
					fis.close();
					fos.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		new Ex07_File_copy();
	}
}