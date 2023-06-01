package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// 박세리의 주소를 대한민국 제주도 , 전화번호를 변경
public class Ex06_Statement_update {
	public static void main(String[] args) {
		// 오라클에 접속하고 처리하기 위한 3가지 클래스
		Connection conn = null ;
		Statement stmt = null ;
		ResultSet rs = null ;
		int result = 0 ;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
			String user = "C##ysh";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			String sql = "update customer set address = '대한민국 제주도' , phone = '000-9000-0001' where name ='박세리'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			System.out.println(result);
			if(result > 0) {
				sql = "select * from customer order by custid asc";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				rs.close();
				conn.close();
				stmt.close();
			} catch (Exception e2) {

			}
		}
		
	}
}
