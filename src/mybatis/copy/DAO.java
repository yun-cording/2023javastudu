package mybatis.copy;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import mybatis.com.ict.edu.VO;

// DV처리하는 메서드들을 가지고 있는 클래스 DAO

public class DAO {

	/* 
	/ 여기서 잠깐! Mybatis 개념부터 잡고 가실게요!
	 * 	Mybatis는 자바 오브젝트와 SQL사이의 자동 매핑 기능을 지원하는 ORM(Object relational Mapping)프레임워크이다.
	 *  매핑이란?
	 *  너무 길고, 보안에 노출되어 있는 경로를 간단하게 하는 것이 매핑입니다.
	 *	기존경로 : http://localhost:8181/helloworld/servlet/com.javalec.ex.HelloWorld
	 *	맵핑 후 경로 : http://localhost/helloworld/helloworld/
	 *	ORM이란?
	 *	객체(Object)와 DB의 테이블을 Mapping 시켜 RDB 테이블을 객체지향적으로 사용하게 해주는 기술이다.
	 *	객체는 객체대로 설계하고 , 관계형 데이터 베이스는 관계형 데이터 베이스로 설계한다.
  	 *	객체와 관계형 데이터베이스의 데이터를 자동으로 매핑(연결)해주는것을 말한다.
  	 *	ORM 프레임워크가 중간에서 매핑한다.
  	 *
  	 *	즉! Mybatis는 자바 오브젝트와 SQL 사이에 자동으로 매핑(길고 보안에 노출되어있는 경로를 간단하게하는)기능을
  	 *	지원하는 ORM(객체 와 DB 테이블을 매핑 시켜 RDB 테이블을 객체지향적으로 사용하게해주는 기술) 프레임워크이다.
  	 *	참고자료 
  	 *	https://www.youtube.com/watch?v=9b5P4YiyqOY
	 */
	
	//실제 사용하는 클래스 : SqlSession
	// SqlSession이 개발자가 맵핑클래스에 작성한 코드를 호출해주는 기능을 해줌
	private static SqlSession ss;
	
	// 싱글턴 패턴 ( 동기화 처리 ) : 프로그램이 종료될 때까지 한번 만들어진 객체를 재 사용한다.
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메서드들
	
	// Customer 테이블 전체보기
	// select , 결과는 여러개 , 파라미터가 없다
	
	public static List<VO> getList(){
		List<VO> list = null;
		// selectList() : 결과가 하나 이상일때
		// selectOne() : 결과가 반드시 하나일때
		// 파라미터가 있는 메서드와 파라미터가 없는 메서드로 나눈다.
		// 파라미터가 있는 메서드 : selectList("mepper의 id" , [파라미터]);
		// 파라미터가 없는 메서드 : selectList("mepper의 id");
		list = getSession().selectList("custList");
		return list;
	}
	
	// select , 결과는 하나 , 파라미터 있음(String)
	public static VO getOne(String custid) {
		VO vo = getSession().selectOne("custOne",custid);
		return vo;
	}
	
	//insert , delete , update 결과 int , 파라미터 있음
	// 반드시 commit를 해야 된다. select랑 다른점
	public static int getInsert(VO vo) {
		int result = getSession().insert("custIns", vo);
		ss.commit();
		return result;
	}
	
	public static int getDelete(VO vo) {
		int result = getSession().delete("custDel", vo);
		ss.commit();
		return result;
	}
	
	public static int getUpdate(VO vo) {
		int result = getSession().update("custUpdate", vo);
		ss.commit();
		return result;
	}
	
}