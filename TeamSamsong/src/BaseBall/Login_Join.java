package BaseBall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Join {

	int cnt;  //���� ���� ������ �����ϴ� ����
	Connection conn;  //DB ���� ��ü
	PreparedStatement psmt;  //SQL�� ���޹޾� �����ϴ� ��ü
	ResultSet rs;  //Query�� ������� �޾ƿ��� ��ü
	
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

	public void Login(DTO dto) {
		
		cnt = 0;
		conn = null;
		psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";	
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			String sql = "select p_pw from player_info where p_id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				String loginPW = rs.getString(1);
				
				if (loginPW.equals(dto.getPw())) {
					System.out.println("�α��� ����!!");
				}
				else {
					System.out.println("�α��� ����...");
					System.out.println("���̵� Ȥ�� ��й�ȣ�� Ȯ�����ּ���!!");
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