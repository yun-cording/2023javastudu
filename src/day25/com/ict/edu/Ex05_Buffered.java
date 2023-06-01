package day25.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// Ex04의 속도 향상을 위해서 BufferedOutputStream 사용
// BufferedOutputStream는 혼자서는 사용하지 않는다. OutputStream중 하나와 같이 사용 된다.

public class Ex05_Buffered {
	public static void main(String[] args) {
		String pathname = "C:\\Users\\zdbst\\Desktop\\수업내용메모/test02.txt";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			String msg = "Hello\n안녕\n大韓民國\n123456";
			
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				
			}
		}
	}
}