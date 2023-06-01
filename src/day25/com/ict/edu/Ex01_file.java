package day25.com.ict.edu;

import java.io.File;

// File 클래스 : 특정위치에(경로=path)에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
// 주요 생성자 : File(String 경로) , File(String 상위경로 , String 하위경로)
//			File(File 상위경로 , String 하위경로)
// 주요 메서드 : createNewFile() : 파일 생성
// 			 		mkdir()  : 디렉토리 생성
//					delete() : 삭제
//					isFile() : 파일이면 true
//			   isDirectory() : 디렉토리이면 true
//			  파일과 디렉토리 차이점 : 크기가 존재하면 파일
//					  list() : 특정위치의 내용(파일,디렉토리)을 배열에 저장
//					exists() : 존재유무
//				   getName() : 파일
//					length() : 파일 크기를 byte 로 변환해서 표시
//		   getAbsolutePath() : 절대 주소 표시 ( 루트부터 시작해서 위치 표시 )
//				   getPath() : 상대주소 ( 현재위치부터 시작해서 위치표시 )


public class Ex01_file {
	public static void main(String[] args) {
		// java 에서 경로 구분자 표시 알아서 자동으로 인식하는 방법
	    // 윈도우 예) c:\temp...
        // 리눅스 예) /home/yangyag/.
		// https://yangyag.tistory.com/398
		String pathname = "C:\\Users\\zdbst\\Desktop\\수업내용메모";
		File file = new File(pathname);
		String[] arr = file.list();
		for (String k : arr) {
			System.out.println(k);
			System.out.println();
			File file2 = new File(pathname, k); // (상위경로 , 하위경로) 합쳐진것
			System.out.println(file2);
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : " + k );
			}else {
				System.out.println("파일 : " + k );
			}
		}
	}
}