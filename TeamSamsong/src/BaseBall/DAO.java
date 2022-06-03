package BaseBall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

	int cnt;
	int attack;
	int attack_sub;
	int defense;
	int defense_sub;
	int teamId;
	
	String Id;
	String pw;
	String nickname;
	String sql;	
	
	Connection conn; // DB 연결 객체
	PreparedStatement psmt; // SQL문 전달받아 실행하는 객체
	ResultSet rs; // Query의 결과값을 받아오는 객체

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
		} catch (SQLException e) {
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

			while (rs.next()) {
				if (id.equals(rs.getString(1))) {
					Id = rs.getString(1);
				}
			}
		} catch (SQLException e) {
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
			String name = dto.getName();

			String sql = "select nickname from player_info";

			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();

			while (rs.next()) {
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
			System.out.println("SSG 랜더스 팀을 선택하셨습니다");

			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 2) {
			System.out.println("키움 히어로즈 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 3) {
			System.out.println("기아 타이거즈 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 4; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

		}

		else if (teamNum == 4) {
			System.out.println("LG 트윈스 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

		}

		else if (teamNum == 5) {
			System.out.println("두산 베어스 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 5; k++) {
				System.out.print("★");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 6) {
			System.out.println("삼성 라이온즈 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 7) {
			System.out.println("롯데 자이언츠 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 4; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 8) {
			System.out.println("KT 위즈 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 2; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 3; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 9) {
			System.out.println("한화 이글스 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();
		}

		else if (teamNum == 10) {
			System.out.println("NC 다이노스 팀을 선택하셨습니다");
			System.out.print("ATT : ");
			for (int k = 0; k < 4; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 1; k++) {
				System.out.print("☆");
			}
			System.out.println();

			System.out.print("DEF : ");
			for (int k = 0; k < 3; k++) {
				System.out.print("★");
			}
			for (int k = 0; k < 2; k++) {
				System.out.print("☆");
			}
			System.out.println();

		}

		else if (teamNum < 1 || teamNum > 10) {
			System.out.println("올바른 선택이 필요합니다!!");
			System.out.println("다시 선택해 주세요.");

			main = new Main();
			main.sleep(800);
		}
	}

	public int T_Check(DTO dto) {
		conn = null;
		psmt = null;

		Connection();
		
		try {
			String sql = "select team_id from player_info where nickname = ?";

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

			String sql = "update player_info set team_id = ? where nickname = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, teamId);
			psmt.setString(2, name);

			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
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

		} catch (SQLException e) {
			e.printStackTrace();
		}

		finally {
			UnConnection();
		}
		return nickname;
	}

	private void Connection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";

			conn = DriverManager.getConnection(url, db_id, db_pw);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
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
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void athlete(DTO dto) {
		cnt = 0;
		conn = null;
		psmt = null;
		
		try {

			Connection();
			
			String sql = "select * from athlete a, player_info p where p.team_id = a.team_id and p.nickname = ? and a.attack!=0";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			rs = psmt.executeQuery();
			
			System.out.println("┌────────┬────────┬────────┐");
			System.out.println("│ NUMBER │  NAME  │ ATTACK │");			
			
			while (rs.next()) {
				int back = rs.getInt("back_number");
				String name = rs.getString("name");
				String attack = rs.getString("attack");
				
				System.out.print("│   " + back + "   ");
				System.out.print("│  " + name + "  ");
				System.out.print("│   " + attack +"   │");
				System.out.println();				
			}
			System.out.println("└────────┴────────┴────────┘");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally {			
			UnConnection();			
		}
	}

	public void athlete_sub(DTO dto) {
		cnt = 0;
		conn = null;
		psmt = null;
		
		try {
			Connection();
			
			String sql = "select * from athlete where team_id != (select team_id from PLAYER_INFO where nickname = ?) and defense > 0";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			rs = psmt.executeQuery();

			System.out.println("◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆");
			System.out.println("       !상대 투수 등판!");
			System.out.println("◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇◆◇");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally {
			UnConnection();
		}
	}

	public void athlete_sub2(DTO dto, int num) {
		cnt = 0;
		conn = null;
		psmt = null;
		
		try {
			Connection();
			
			String sql = "select * from athlete a, player_info p where p.team_id = a.team_id and p.nickname =? and back_number=?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			psmt.setInt(2, num);
			rs = psmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("name");
				String back_number = rs.getString("back_number");
				System.out.printf("선택한 선수는 %s(%s번)입니다", name, back_number);
				System.out.println();
			}			
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally {
			UnConnection();
		}		
	}
	
	
	public int Gaming(int num) {		
		Main main;
		
		attack = 0;
		attack_sub = 0;		
		cnt = 0;
		conn = null;
		psmt = null;		
		
		try {
			Connection();
			
			sql = "select * from athlete where back_number = ?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, num);
			rs = psmt.executeQuery();
			
			// 타자 공격력
			if (rs.next()) {
				attack = rs.getInt("attack");
				System.out.println("선택한 선수의 공격력은【" + attack + "】입니다.");
				System.out.println("◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈◈");
				
				main = new Main();
				main.sleep(600);
				attack_sub = attack;
			}
		}	
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			UnConnection();
		}
		
		return attack_sub;
	}
	
	
	public int Gaming_defense(int j) {
		defense = 0;
		defense_sub = 0;
		cnt = 0;
		conn = null;
		psmt = null;	
		
		try {
			Connection();

			sql = "select * from athlete where back_number = ?";
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, j);
			rs = psmt.executeQuery();

			if (rs.next()) {
				defense = rs.getInt("defense");
				System.out.println();
			}
			// 타자 공격력
			if (rs.next()) {
				defense = rs.getInt("defense");
				System.out.println();
				defense_sub = defense;
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			UnConnection();
		}
		
		return defense_sub;
	}
	
	
	public void rankingP(int rp, String nickname) {
		try {
			Connection();
			
			String sql = "insert into ranking values (?,?)";
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, rp);
			System.out.println(rp);
			psmt.setString(2, nickname);
			System.out.println(nickname);
			
			cnt = psmt.executeUpdate();
			if(cnt>0) {
				System.out.println("랭킹등록이 완료되었습니다!!");
			}else {
				System.out.println("랭킹등록에 실패했습니다!!");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			UnConnection();
		}
	}
}