package day26.com.ict.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex04_File_IO {
	public static void main(String[] args) {
		String movepath = "C:\\util\\숙제/java1.png";
		String copypath = "C:\\util\\java1.png";
		
		File movefile = new File(movepath);
		File copyfile = new File(copypath);
		
		FileOutputStream fos = null;
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(copyfile);
			fos = new FileOutputStream(movefile);
			byte[] b = fis.readAllBytes();
			fos.write(b);
			fos.flush();
			
		} catch (Exception e) {
			
		}finally {
			try {
				fos.close();
				fis.close();
			} catch (Exception e2) {
				
			}
		}
		
		
	}
}
