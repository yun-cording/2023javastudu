package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Ex04_Statement_insert {
	public static void main(String[] args) {
		// 접속과 처리르 위한 클래스 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
			String user = "C##ysh";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// insert (6번 , 이강인 , 대한민국 서울 , 000-9000-0001) 추가
			String sql = "insert into customer(custid , name , address , phone)"
					+ " values(8 , '이강인' , '대한민국 서울' , '010-9000-0001')";
			
			stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql);
			
			result = stmt.executeUpdate(sql); 
			
			System.out.println(result);// 삽입된 겟수에 따라서 숫자가 다르게나옴 1개 삽입되면 1 , 한번에 5개 업데이트하면 5나옴
			if(result>0) {
				// 성공하면 select 문을 이용해서 보자
				sql = "select * from customer order by custid asc";
				//stmt = conn.createStatement(); 생략가능
				rs = stmt.executeQuery(sql);
				
				while(rs.next()) {
					System.out.println(rs.getString("custid")+"\t");
					System.out.println(rs.getString("name")+"\t");
					System.out.println(rs.getString("address")+"\t");
					System.out.println(rs.getString("phone")+"\n");
				}
			}
						
		} catch (Exception e) {
			System.out.println("제대로된 데이터를 넣어주세요 : " + e);
		}finally {
		}try {
			conn.close();
			stmt.close();
			rs.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
