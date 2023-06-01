package day26.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex05_File_save extends JFrame {
	JPanel jp;
	JTextArea jta;
	JButton jb;
	JTextField jtf;
	JScrollPane jsp;

	public Ex05_File_save() {
		super("저장하기");
		jsp = new JScrollPane();
		jp = new JPanel();
		jta = new JTextArea();
		jb = new JButton("SAVE");
		jtf = new JTextField(30);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf);
		jp.add(jb);
		add(jp, BorderLayout.NORTH);
		add(jsp);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = jtf.getText();
				File file = new File(path);
				FileOutputStream fos = null;
				try {
					fos = new FileOutputStream(file, true);
					String str = jta.getText();
					byte[] arr = str.getBytes();
					fos.write(arr);

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						fos.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			}
		});

	}

	public static void main(String[] args) {
		new Ex05_File_save();

	}
}