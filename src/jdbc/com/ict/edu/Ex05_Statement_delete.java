package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05_Statement_delete {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
			String user = "C##ysh";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			
			// 이름이 이강인 삭제
			String sql = "delete from customer where name = '이강인'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if(result > 0) {
				sql = "select * from customer order by custid asc";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
				
				
			}else {
				System.out.println("삭제 성공");
			}			
		} catch (Exception e) {


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
