package day28.com.ict.edu;
//3. 오브젝트 스트림 : 객체 직렬화 후 객체 단위로 입/출력
// 	최상위 클래스 : ObjectInputStream : readObject() => 객체 역직렬화 메서드
// 			   ObjectOutputStream : writerObject() => 객체 직렬화 메서드

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : 객체 입력 스트림
// readObject() : 객체 역직렬화 메서드

public class Ex04_ObjectInputStream {
	public static void main(String[] args) {
		String pathname = "C:\\util/object02.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			//역직렬화
			ArrayList<Ex04_VO> list = (ArrayList<Ex04_VO>) ois.readObject();
			
			for (Ex04_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getAddr()+"\t");
				if(k.isGender()) {
					System.out.print("남성\t");
				}else {
					System.out.print("여성\t");
				}
				System.out.print(k.getheight()+"\n");
				
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
				bis.close();
				ois.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}
