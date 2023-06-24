package jdbc.com.ict.edu5test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	//Data Access Object DB의 데이터에 접근하기 위한 객체로  실제로 db에접근하는 객체
		// DB에 접속해서 각종 SQL 처리하는 클래스
	
	// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
	Connection conn = null; // 연결 담당 
	// 2. SQL 구문 작성을 도와주는 클래스
	PreparedStatement pstm = null; // SQL 전달 담당
	// 3-1. select문의 결과를 받는 클래스
	ResultSet rs = null;  // 결과 응답

	// 3-2. select문을 제외한(delete , update , insert) 결과를 받는 변수 (숫자로 결과가 나옴)
	
	private static DAO dao = new DAO();
	public static DAO getInstance() {
		return dao;
	}
	
	// DB 접속 메서드
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.0.41:1521:xe";
			String user = "C##ysh";
			String password = "1111";
			conn = DriverManager.getConnection(url,user,password); // 연결하기위한 url , user ,password넣어줌
			return conn; // 
		} catch (Exception e) {
		}
		return null;
	}
	
	// 각종 DB처리 메서드
	
	// 전체보기
	public ArrayList<VO> getSelectAll(){
		try {
			conn = getConnection(); // 연결메서드 실행해서 연결 먼저
			String sql = "select * from customer order by custid"; //실행할 SQL문
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery(); // 결과로 sql전달한 pstm의 응답을 받음
			ArrayList<VO> list = new ArrayList<>();
			while(rs.next()) { //ResultSet rs에 읽을게 없을때까지 즉 db에정보를 다 가져올떄까지 실행
				VO vo = new VO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString("name"));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString("phone"));
				list.add(vo); // 가져온 정보들이 담긴 vo를 VO어레이리스트에 넣어둠
			}
			return list; // 그후 가져올 vo들정보가 담긴 리스트를 반환
		} catch (Exception e) {
		}finally {
			try {
				pstm.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return null;// 가져오기 실패했을경우엔 널을 반환
	}
	
	// 삽입
	public int getInsert(VO vo) {
		try {
			conn = getConnection();
			String sql = "insert into customer(custid, name , address, phone) values(?,?,?,?)";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1,vo.getCustid());
			pstm.setString(2,vo.getName());
			pstm.setString(3,vo.getAddress());
			pstm.setString(4,vo.getPhone());
			// 3-2. select문을 제외한(delete , update , insert) 결과를 받는 변수 (숫자로 결과가 나옴)
			int result = pstm.executeUpdate();
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
	
	// 삭제
	public int getDelete(VO vo) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid = ? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			// 3-2. select문을 제외한(delete , update , insert) 결과를 받는 변수 (숫자로 결과가 나옴)
			int result = pstm.executeUpdate();
		} catch (Exception e) {
		}finally {
			try {
				conn.close();
				pstm.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}
	
	// 하나 불러오기
	public VO getSelectOne(VO vo) {
		try {
			conn = getConnection();
			String sql = "selece * from customer where custid = ? ";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getCustid());
			rs = pstm.executeQuery();
			VO vo2 = new VO();
			while(rs.next()) {
				vo2.setCustid(rs.getString(1));
				vo2.setName(rs.getString(2));
				vo2.setAddress(rs.getString(3));
				vo2.setPhone(rs.getString(4));
			}
			return vo2;
		} catch (Exception e) {
		}finally {
			try {
				pstm.close();
				conn.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		return null;
	}
	
	// 고치기
	public int getUpdate(VO vo) {
		try {
			conn = getConnection();
			String sql = "update customer set name=?, address=? , phone=? where custid=?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, vo.getName());
			pstm.setString(2, vo.getAddress());
			pstm.setString(3, vo.getPhone());
			pstm.setString(4, vo.getCustid());
			int result = pstm.executeUpdate();
			return result;
		} catch (Exception e) {
		}finally {
			try {
				conn.close();
				pstm.close();
			} catch (Exception e2) {
			}
		}
		return 0;
	}

	// 아이디 체크
	public boolean getIdchk(String custid) {
		// 중복이면 false , 아니면 true
		boolean idchk = false;
		try {
			conn = getConnection();
			String sql = "select custid from customer where custid = ?";
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, custid);
			rs = pstm.executeQuery();
			int cnt = 0;
			if(rs.next()) {
				cnt++;
			}
			
			if(cnt == 0) {
				idchk = true;
			}
			return idchk;
		} catch (Exception e) {
		}finally {
			try {
				pstm.close();
				conn.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		return idchk;
	}
	
}