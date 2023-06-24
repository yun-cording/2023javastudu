package mybatis.copy;

import java.util.List;
import java.util.Scanner;

import mybatis.com.ict.edu.DAO;
import mybatis.com.ict.edu.VO;

//마이바티스 셋팅하기
//1. config.xml 만들기 - DB 접속
//2. mapper.xml 만들기 - 실제 SQL 작성하는파일 ( 실제 DB에 갖다와서 결과를 내보내는 파일)
//3. VO.java - DB에 들어갈 파라미터 및 결과를 저장을 담당하는 파일 (테이블의 컬럼명과 일치)
//4. DAO.java - mapper와 연결되서 자바에서 DB 실행 시키는 파일 (DB 처리하는 클래스들을 모아놓은 파일)
//5. DBService - config.xml 파일을 읽고 MyBatis를 실행할 수 있도록 하는 파일

//1. 환경설정파일(config.xml) 만들기

public class console {

	// 테이블 전체보기 메서드
	public void prn(List<VO> list) {
		System.out.println("번호\t이름\t주소\t전화번호");
		for (VO k : list) {
			System.out.print(k.getCustid() + "\t");
			System.out.print(k.getName() + "\t");
			System.out.print(k.getAddress() + "\t");
			System.out.print(k.getPhone() + "\n");
		}
	}
	
	// 선택한정보 보기 메서드
	public void prn2(VO vo) {
		System.out.println("번호\t이름\t주소\t전화번호");

		System.out.print(vo.getCustid() + "\t");
		System.out.print(vo.getName() + "\t");
		System.out.print(vo.getAddress() + "\t");
		System.out.print(vo.getPhone() + "\n");
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		console console = new console();// main메서드는 스테틱이라 다른메서드 호출을 못하므로 사용하기위해 자기자신을 객체생성해서 사용
		System.out.println("선택하세요.");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.print(">>>>>>>>>>");
		int menu = scan.nextInt();

		List<VO> list = null;

		switch (menu) {
		case 1:
			list = DAO.getList();
			console.prn(list);
			break;
		case 2:
			System.out.print("custid를 입력하세요 >>");
			String custid = scan.next();
			VO vo = DAO.getOne(custid);
			console.prn2(vo);
			break;
		case 3:
			System.out.println("삽입정보를 입력하세요 >>>");
			System.out.print("이름 :");
			String name = scan.next();
			System.out.print("주소 :");
			String address = scan.next();
			System.out.print("전화번호 :");
			String phone = scan.next();
			VO vo2 = new VO();
			vo2.setName(name);
			vo2.setAddress(address);
			vo2.setPhone(phone);
			int result = DAO.getInsert(vo2);
			if(result>0) {
				list = DAO.getList();
				console.prn(list);	
			}			
			break;
		case 4:
			System.out.print("삭제할 custid를 입력하세요>>");
			String custid2 = scan.next();
			VO vo3 = new VO();
			vo3.setCustid(custid2);
			
			int result2 = DAO.getDelete(vo3);
			if(result2>0) {
				list = DAO.getList();
				console.prn(list);
			}
			break;
		case 5:
			System.out.println("갱신 정보를 입력하세요");
			System.out.print("갱신할 번호 :");
			String custid3 = scan.next();
			System.out.print("이름 :");
			String name2 = scan.next();
			System.out.print("주소 :");
			String address2 = scan.next();
			System.out.print("전화번호 :");
			String phone2 = scan.next();
			VO vo4 = new VO();
			vo4.setCustid(custid3);
			vo4.setName(name2);
			vo4.setAddress(address2);
			vo4.setPhone(phone2);
			
			int result3 = DAO.getUpdate(vo4);
			if(result3>0) {
				list = DAO.getList();
				console.prn(list);
			}
			break;
			
			default: System.out.println("제대로 입력하세요!!"); break;
		}

	}
}
