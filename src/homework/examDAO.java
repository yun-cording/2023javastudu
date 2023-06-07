package homework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.com.ict.edu4.VO;

public class examDAO {
	Connection conn = null;
	PreparedStatement pstm = null;
	ResultSet rs = null;
	int result = 0;
	
	private static examDAO dao = new examDAO();
	public static examDAO getInstance() {
		return dao;
	}
	
	// db 접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "ysh";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password);
			return conn;
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
		return null;
	} // db접속 메서드 끝
	
	public ArrayList<examVO> getSelectAll(){
		try {
			conn = getConnection();
			String sql = "select * from 고객테이블";
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			ArrayList<examVO> list = new ArrayList<>();
			while(rs.next()) {
				examVO vo = new examVO();
				vo.set고객아이디(rs.getString(1));
				vo.set고객이름(rs.getString(2));
				vo.set나이(rs.getString(3));
				vo.set등급(rs.getString(4));
				vo.set직업(rs.getString(5));
				vo.set적립금(rs.getString(6));
				list.add(vo);
			}
			return list;
		} catch (Exception e) {
		}finally {
			try {
				conn.close();
				rs.close();
				pstm.close();
			} catch (Exception e2) {
				
			}
		}
		return null;
	}

	public examVO getSelectOne(String c_id) {
		try {
			conn = getConnection();
			String sql = "select * from 고객테이블 where 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, c_id);
			rs = pstm.executeQuery();
			examVO vo = new examVO();
			while (rs.next()) {
				vo.set고객아이디(rs.getString(1));
				vo.set고객이름(rs.getString(2));
				vo.set나이(rs.getString(3));
				vo.set등급(rs.getString(4));
				vo.set직업(rs.getString(5));
				vo.set적립금(rs.getString(6));
			}
			return vo;
		} catch (Exception e) {
		}finally {
			try {
				conn.close();
				rs.close();
				pstm.close();
			} catch (Exception e2) {

			}
		}
		return null;
	}

	public int getInsert(examVO vo2) {
		try {
			conn = getConnection();
			String sql = "insert into 고객테이블(고객아이디 , 고객이름 , 나이 , 등급 , 직업 , 적립금) values(?,?,?,?,?,?)";
			pstm.setString(1, vo2.get고객아이디());
			pstm.setString(2, vo2.get고객이름());
			pstm.setString(3, vo2.get나이());
			pstm.setString(4, vo2.get등급());
			pstm.setString(5, vo2.get직업());
			pstm.setString(6, vo2.get적립금());
			
			result = pstm.executeUpdate();
			return result;
			
		} catch (Exception e) {
			System.out.println("아이디 중복");
		} finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
		return 0;
	}

	public int getDelete(examVO vo3) {
		try {
			conn = getConnection();
			String sql = "delete from 고객테이블 where 고객아이디 = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo3.get고객아이디());
			result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		}finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
		return 0;
	}
		
}
