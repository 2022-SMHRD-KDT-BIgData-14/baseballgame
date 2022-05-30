package BaseBall;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		Login_Join lj;
		DTO dto;
		
		String inID;
		String inPW;
		String inName;
		
		while(true) {
			System.out.println("[1]회원 가입 [2]로그인 [3]팀 선택 [4]팀 변경 [5]게임 실행 [6]랭킹 조회 [7]게임 종료");
			System.out.print("메뉴를 선택하세요 >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
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
			
			if (num == 2) {
				System.out.print("ID를 입력하세요 >> ");
				inID = input.next();
				System.out.print("PW를 입력하세요 >> ");
				inPW = input.next();
				
				lj = new Login_Join();
				dto = new DTO(inID, inPW);
				lj.Login(dto);
			}
			
			if (num == 3) {
				
			}
			
			if (num == 4) {

			}
			
			if (num == 5) {

			}
			
			if (num == 6) {
			}
			
			if (num == 7) {
				System.out.println("게임을 종료합니다.");
			}

		}
	}
}