package BaseBall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Join {

	int cnt;  //변한 행의 개수를 저장하는 변수
	Connection conn;  //DB 연결 객체
	PreparedStatement psmt;  //SQL문 전달받아 실행하는 객체
	ResultSet rs;  //Query의 결과값을 받아오는 객체
	
	public void Join(DTO dto) {
		cnt = 0;
		conn = null;
		psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";	
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			
			String sql = "insert into player_info values (?, ?, ?, null)";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);			
			psmt.setString(2, pw);
			psmt.setString(3, name);	
			
			cnt = psmt.executeUpdate();
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			System.out.println("이미 존재하는 ID 입니다!!");
			System.out.println("다른 ID로 회원가입 해주세요.");
		}
		
		finally {

			try {
				if (rs != null) {
					rs.close();
				}

				if (psmt != null) {
					psmt.close();
				}

				if (conn != null) {
					conn.close();
				}
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void J_Check() {
		
	}
}