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
		
		System.out.println("[1]회원가입 [2]로그인");
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
		
		
	}
}