package BaseBall;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Team_Info {
	
	int teamId;
	Connection conn;  //DB 연결 객체
	PreparedStatement psmt;  //SQL문 전달받아 실행하는 객체
	ResultSet rs;  //Query의 결과값을 받아오는 객체
	
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
		
		else if (teamNum < 1 || teamNum > 10){	
			System.out.println("올바른 선택이 필요합니다!!");
			System.out.println("다시 선택해 주세요.");
			
			main = new Main();
			main.sleep(800);			
		}
		
		System.out.println("팀 등록이 완료되었습니다!!");
	}	
	
	public int T_Check(DTO dto) {
		conn = null;
		psmt = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_0516_5";
			String db_pw = "smhrd5";	
			
			conn = DriverManager.getConnection(url, db_id, db_pw);
			
			String sql = "select p_team from player_info where p_nickname = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getName());
			rs = psmt.executeQuery();
			
			if (rs.next()) {
				teamId = rs.getInt(1);				
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
		return teamId;	
	}
}