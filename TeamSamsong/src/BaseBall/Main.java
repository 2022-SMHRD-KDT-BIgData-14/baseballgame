package BaseBall;

import java.util.Scanner;

public class Main extends Thread {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DTO dto;
		DAO dao;
		
		String inID;
		String inPW;
		String inName;
		int teamNum;
		
		while(true) {
			System.out.println("┌───────────────────────────────────────┐");
			System.out.println("│               Main Menu               │");
			System.out.println("├───────────────────────────────────────┤");
			System.out.println("│       [1]로그인  [2]회원 가입  [3]종료      │");
			System.out.println("└───────────────────────────────────────┘");
			
			System.out.print("메뉴를 선택하세요 >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.println("┌───────────────────────────────────────┐");
				System.out.println("│           L   O   G   I   N           │");
				System.out.println("└───────────────────────────────────────┘");
				
				while(true) {
					System.out.print("ID를 입력하세요 >> ");
					inID = input.next();
					System.out.print("PW를 입력하세요 >> ");
					inPW = input.next();
				
					dao = new DAO();
					dto = new DTO(inID, inPW);				
					String rsLogin = dao.Login(dto);
					String rsID = dao.Login(dto);
					
					if (rsID == null) {
						System.out.println("존재하는 ID가 아닙니다!!");
						sleep(700);
						continue;
					}					
					if (rsLogin.equals(inPW)) {
						System.out.println("로그인 성공");
					}
					else if (!rsLogin.equals(inPW)){
						System.out.println("로그인 실패...");
						System.out.println("PW를 다시 확인해 주세요!!");
						System.out.println("다시 입력해 주세요.");
						sleep(700);
						continue;
					}
					break;
				}
				
				if (num == 1) {					
					System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
					System.out.printf("         %s님 어서오세요. 환영합니다!!      ", inID);
					System.out.println("\n☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
					
					System.out.println("┌───────────────────────────────────────┐");
					System.out.println("│              Search Menu              │");
					System.out.println("├───────────────────────────────────────┤");
					System.out.println("│     [1]팀 선택  [2]선수 조회  [3]랭킹 조회 　 │");
					System.out.println("└───────────────────────────────────────┘");
					
					System.out.print("메뉴를 선택하세요 >> ");
					num = input.nextInt();
					
					if (num == 1) {						
						while(true) {
							System.out.print("닉네임을 입력하세요 >> ");
							inName = input.next();							
							
							dao = new DAO();
							dto = new DTO(inID, inPW, inName);
							int rs = dao.T_Check(dto);
							String rsNick = dao.N_Check(dto);							
							
							//닉네임이 틀리다면 다시 입력
							if(!inName.equals(rsNick)) {
								System.out.println("닉네임이 올바르지 않습니다!!");
								System.out.println("다시 입력해 주세요.");
								sleep(700);
								continue;
							}
							
							//이미 팀이 존재한다면 팀 선택 X
							if(rs != 0) {
								System.out.println("┌───────────────────────────────────────┐");
								System.out.println("├───────  이미 팀이 등록되어 있습니다!!  ───────┤");       
								System.out.println("├─────────   다음 메뉴로 이동합니다　　─────────┤"); 
								System.out.println("└───────────────────────────────────────┘");
								break;
							}
							
							System.out.println("================= 팀 목록 =================");
							System.out.print("      [1]SSG 랜더스\t[2]키움 히어로즈" + "\n" 
										   + "      [3]KIA 타이거즈\t[4]LG 트윈스" + "\n"
										   + "      [5]두산 베어스\t[6]삼성 라이온즈" + "\n"
										   + "      [7]롯데 자이언츠\t[8]KT 위즈" + "\n"
										   + "      [9]LG 트윈스\t[10]NC 다이노스" + "\n");
							System.out.println("=========================================");
							
							System.out.print("팀[번호]을 선택하세요 >> ");
							teamNum = input.nextInt();							
							
							dao = new DAO();
							dto = new DTO(inName, teamNum);
							dao.Choose(dto);
							
							dao = new DAO();							
							dao.Team_Info(teamNum);							
							
							if (teamNum < 1 || teamNum > 10) {
								continue;
							}
							
							break;
						}
						
						while (true) {
							System.out.println("┌───────────────────────────────────────┐");
							System.out.println("│               Game Menu               │");
							System.out.println("├───────────────────────────────────────┤");
							System.out.println("│    [1]게임 진행 [2]스페셜 뽑기 [3]이전 메뉴　 　│");
							System.out.println("└───────────────────────────────────────┘");
							
							System.out.print("메뉴를 선택하세요 >> ");
							num = input.nextInt();
							
							if (num == 1) {

							}
							
							else if (num == 2) {

							}
							
							else if (num == 3) {
								break;
							}
							
							else {
								System.out.println("올바른 선택이 필요합니다!!");
								System.out.println("다시 입력해 주세요.");
								sleep(800);
							}
						}
					}					
				}
			}
			
			if (num == 2) {
				System.out.println("┌───────────────────────────────────────┐");
				System.out.println("│             J   O   I   N             │");
				System.out.println("└───────────────────────────────────────┘");
				
				while (true){
					System.out.print("ID 입력 >> ");
					inID = input.next();
					System.out.print("PW 입력 >> ");
					inPW = input.next();
					System.out.print("NAME 입력 >> ");
					inName = input.next();

					dao = new DAO();
					dto = new DTO(inID, inPW, inName);
					dao.Join(dto);
					String rsId = dao.I_Check(dto);

					if (!inID.equals(rsId)) {
						System.out.println("회원 가입이 완료되었습니다!!");
						break;
					}
				}
			}			
			
			if (num == 3) {				
				System.out.println("게임을 종료합니다.");	
				System.out.println("감사합니다.");
				sleep(800);
			}
			
			else {
				System.out.println("올바른 선택이 필요합니다!!");
				System.out.println("다시 입력해 주세요.");
				sleep(800);
			}
		}
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} 
		catch (Exception e) {
			System.out.println("잠시만 기다려주세요!!");
		}
	}
}