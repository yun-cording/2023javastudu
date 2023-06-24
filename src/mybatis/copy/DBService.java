package mybatis.copy;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBService {
	
	// Mybatis를 사용하기 위해서 SqlSession 클래스가 필요하고
	// SqlSessionFactory 클래스를 가지고 SqlSession클래스를 만든다.
	private static SqlSessionFactory factory;
	
	// config.xml 파일 위치를 resource변수에 저장
	static String resource = "mybatis/copy/config.xml"; 
	
	// static 초기화
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
		}
	}
	
	// DAO에서 factory를 호출할 메서드
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
