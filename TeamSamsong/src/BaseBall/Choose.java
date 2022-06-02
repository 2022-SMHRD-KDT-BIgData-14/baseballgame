package BaseBall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Choose {
	
	int cnt;
	Connection conn;
	PreparedStatement psmt;
	ResultSet rs;
	
	public void Choose(DTO dto) {
		
	cnt = 0;
	conn = null;
	psmt = null;
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";	
		
			conn = DriverManager.getConnection(url, db_id, db_pw);	
			
			String name = dto.getName();
			int teamId = dto.getTeamId();
			
			String sql = "update player_info set p_team = ? where p_nickname = ?";

			psmt = conn.prepareStatement(sql);
			
			psmt.setInt(1, teamId);
			psmt.setString(2, name);	
			
			cnt = psmt.executeUpdate();	
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
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
	
	public void C_check(DTO dto) {
		cnt = 0;
		conn = null;
		psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";	
			
			conn = DriverManager.getConnection(url, db_id, db_pw);

			String name = dto.getName();

			String sql = "select p_team from player_info where p_nickname = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();

			if (rs.next()) {
				if (rs.getInt(1) != 0) {
					System.out.println("이미 선택한 팀이 존재합니다!!");
				}
			}
		}
			
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
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
}