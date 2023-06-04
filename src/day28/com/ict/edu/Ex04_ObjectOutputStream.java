package day28.com.ict.edu;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : 객체 출력 스트림
// writeObject : 객체 직렬화 메서드

public class Ex04_ObjectOutputStream {
	public static void main(String[] args) {
		// 1. 객체 만들기
		Ex04_VO vo1 = new Ex04_VO("고길동", 22, "서울중랑구", true , 174.5);
		Ex04_VO vo2 = new Ex04_VO("이길동", 21, "서울종로구", false , 175.5);
		Ex04_VO vo3 = new Ex04_VO("홍길동", 20, "서울광진구", true , 176.5);
		Ex04_VO vo4 = new Ex04_VO("박길동", 29, "서울노원구", false , 177.5);
		Ex04_VO vo5 = new Ex04_VO("김길동", 28, "서울마포구", true , 172.5);
		
		// 2. 만들어진 객체를 컬랙션으로 모으자
		ArrayList<Ex04_VO> list = new ArrayList<>();
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);
		
		// 3. 모든 객체들을 직렬화 한 후에 파일에 저장한다.
		// 직렬화가 된 정보는 볼 수 없다.
		// 읽을 때 역 직렬화를 해야 볼 수 있다.
		String pathname = "C:\\util/object02.ser";
		File file = new File(pathname);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
		
			// 4. 객체 직렬화
			oos.writeObject(list);
			oos.flush();
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fos.close();
				bos.close();
				oos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}