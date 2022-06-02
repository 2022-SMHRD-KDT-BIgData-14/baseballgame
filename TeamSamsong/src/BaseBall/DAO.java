package BaseBall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
	
	int cnt;
	int teamId;
	String Id;
	String pw;
	String nickname;
	Connection conn;  //DB ���� ��ü
	PreparedStatement psmt;  //SQL�� ���޹޾� �����ϴ� ��ü
	ResultSet rs;  //Query�� ������� �޾ƿ��� ��ü
	
	public String Login(DTO dto) {		
		cnt = 0;
		conn = null;
		psmt = null;
		
		Connection();
		
		try {
			String sql = "select pw from player_info where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				pw = rs.getString(1);				
			}			
		}		
		catch (SQLException e) {
			e.printStackTrace();
		}		
		
		finally {			
			UnConnection();
		}
		return pw;
	}
	
	public void Join(DTO dto) {
		cnt = 0;
		conn = null;
		psmt = null;
		
		Connection();
		
		try {
			String id = dto.getId();
			String pw = dto.getPw();
			String name = dto.getName();
			
			String sql = "insert into player_info values (?, ?, ?, null, null)";

			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, id);			
			psmt.setString(2, pw);
			psmt.setString(3, name);	
			
			cnt = psmt.executeUpdate();			
		}		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			UnConnection();
		}
	}		
	
	public String I_Check(DTO dto) {
		conn = null;
		psmt = null;
		
		Connection();		
		
		try {
			String id = dto.getId();
			
			String sql = "select id from player_info";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();			
			
			while(rs.next()) {
				if (id.equals(rs.getString(1))) {
					Id = rs.getString(1);							
				}
			}
		}		
		catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		finally {			
			UnConnection();
		}
		return Id;
	}
	
	public String Name_Check(DTO dto) {
		conn = null;
		psmt = null;
		
		Connection();		
		
		try {
			String name = dto.getId();
			
			String sql = "select nickname from player_info";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();			
			
			while(rs.next()) {
				if (name.equals(rs.getString(1))) {
					nickname = rs.getString(1);							
				}
			}
		}		
		catch (SQLException e) {			
			e.printStackTrace();
		}		
		
		finally {			
			UnConnection();
		}
		return nickname;
	}
	
	public void Team_Info(int teamNum) {
		
		Main main;		
		
		if (teamNum == 1) {
			System.out.println("SSG ������ ���� �����ϼ̽��ϴ�");

			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 2) {
			System.out.println("Ű�� ������� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 3) {
			System.out.println("��� Ÿ�̰��� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 4; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

		}

		else if (teamNum == 4) {
			System.out.println("LG Ʈ���� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

		}

		else if (teamNum == 5) {
			System.out.println("�λ� ��� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 5; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 6) {
			System.out.println("�Ｚ ���̿��� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 7) {
			System.out.println("�Ե� ���̾��� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 4; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 8) {
			System.out.println("KT ���� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 9) {
			System.out.println("��ȭ �̱۽� ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
		}

		else if (teamNum == 10) {
			System.out.println("NC ���̳뽺 ���� �����ϼ̽��ϴ�");
			System.out.print("ATT : ");
			for (int k = 0; k < 4; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("��");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("��");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("��");
			}
			System.out.println();
			
		}
		
		else if (teamNum < 1 || teamNum > 10){	
			System.out.println("�ùٸ� ������ �ʿ��մϴ�!!");
			System.out.println("�ٽ� ������ �ּ���.");
			
			main = new Main();
			main.sleep(800);			
		}		
	}	
	
	public int T_Check(DTO dto) {
		conn = null;
		psmt = null;
		
		Connection();
		
		try {	
			String sql = "select teamid from player_info where nickname = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				teamId = rs.getInt(1);				
			}	
		}		
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			UnConnection();
		}
		return teamId;	
	}
	
	public void Choose(DTO dto) {		
		cnt = 0;
		conn = null;
		psmt = null;
		
		Connection();
		
		try {		
			String name = dto.getName();
			int teamId = dto.getTeamId();
				
			String sql = "update player_info set teamid = ? where nickname = ?";

			psmt = conn.prepareStatement(sql);
				
			psmt.setInt(1, teamId);
			psmt.setString(2, name);	
				
			cnt = psmt.executeUpdate();	
		}		
		catch (SQLException e) {
			e.printStackTrace();
		}
			
		finally {
			UnConnection();
		}
	}

	public String N_Check(DTO dto) {
		cnt = 0;
		conn = null;
		psmt = null;
			
		Connection();

		try {
			String id = dto.getId();

			String sql = "select nickname from player_info where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			rs = psmt.executeQuery();

			if (rs.next()) {
				nickname = rs.getString(1);
			}
		}		
		catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			UnConnection();
		}
		return nickname;
	}
	
	public class Play {

	}

	private void Connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";	
		
			conn = DriverManager.getConnection(url, db_id, db_pw);			
		}		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void UnConnection() {
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