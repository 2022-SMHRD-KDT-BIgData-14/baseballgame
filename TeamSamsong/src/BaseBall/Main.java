package BaseBall;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Login_Join lj;
		DTO dto;
		TeamChoose tc;
		
		String inID;
		String inPW;
		String inName;
		int teamNum;
		
		while(true) {
			System.out.println("[1]로그인 [2]회원 가입 [3]종료");
			System.out.print("메뉴를 선택하세요 >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.print("ID를 입력하세요 >> ");
				inID = input.next();
				System.out.print("PW를 입력하세요 >> ");
				inPW = input.next();
				
				lj = new Login_Join();
				dto = new DTO(inID, inPW);
				lj.Login(dto);				
				
				if (inPW != "") {
					
				}
				
				if (num == 1) {
					//int[] playerArr = new int[5];
					System.out.println(inID + "님 환영합니다. 어서오세요!");
					System.out.println("[1]팀 선택 [2]랭킹 조회 [3]스폐셜 뽑기");					
					System.out.print("메뉴를 선택하세요 >> ");
					num = input.nextInt();
					
					if (num == 1) {
						while(true) {
							
							System.out.print("닉네임을 입력하세요 >> ");
							inName = input.next();
							
							System.out.println("==================== 팀 목록 ====================");
							System.out.print("[1]SSG 랜더스\t   [2]키움 히어로즈" + "\n" 
										   + "[3]KIA 타이거즈\t   [4]LG 트윈스" + "\n"
										   + "[5]두산 베어스\t   [6]삼성 라이온즈" + "\n"
										   + "[7]롯데 자이언츠\t   [8]KT 위즈" + "\n"
										   + "[9]LG 트윈스\t   [10]NC 다이노스" + "\n");
							System.out.println("===============================================");
							
							System.out.print("팀[번호]을 선택하세요 >> ");
							teamNum = input.nextInt();							
							
							tc = new TeamChoose();
							dto = new DTO(inName, teamNum);
							tc.Choose(dto);
							
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
								// 선수 능력치 부여
								//for (int j = 0; j < athlete.length; j++) {
								//	athlete[j] = rand.nextInt(15) + 60;
								//}
								// 선수 DB에 삽입
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
							
							else {
								System.out.println("올바른 선택이 필요합니다!!");
								continue;
							}							
							break;							
						}						
						System.out.println("팀 등록이 완료되었습니다!!");
						
						while (true) {
							System.out.println("[1]게임 진행 [2]선수 조회 [3]이전 메뉴");							
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
								System.out.println("잘못선택하셨습니다");

							}
						}
					}					
				}
			}
			
			if (num == 2) {				
				System.out.print("ID 입력 >> ");
				inID = input.next();
				System.out.print("PW 입력 >> ");
				inPW = input.next();
				System.out.print("NAME 입력 >> ");
				inName = input.next();
				
				lj = new Login_Join();
				dto = new DTO(inID, inPW, inName);
				lj.Join(dto);
				
				System.out.println("회원가입이 완료되었습니다!!");
			}			
			
			if (num == 3) {				
				System.out.println("게임을 종료합니다.");	
				System.out.println("감사합니다.");
			}
		}
	}
}