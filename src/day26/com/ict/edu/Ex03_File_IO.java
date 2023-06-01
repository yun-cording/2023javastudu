package day26.com.ict.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03_File_IO {
	public static void main(String[] args) {
		String readpath = "C:/util/test.txt";
		String writepath = "C:/util/test2.txt";
		
		File readfile = new File(readpath);
		File writefile = new File(writepath);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
		 fis = new FileInputStream(readfile);
		 fos = new FileOutputStream(writefile , true);
		 byte[] r = fis.readAllBytes();
		 fos.write(r);
		 fos.flush();
		 /*이렇게도 사용 가능
		  * int b = 0 ;
		  * while((b = bis.read()) != -1 ){
		  * 	bos.write(b);
		  * }
		  */
		 
		 
		} catch (Exception e) {

		}finally {
			try {
				
				fis.close();
				fos.close();
			} catch (Exception e2) {

			}
		}
		
}
}	