package BaseBall;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DTO dto;
		Join join;
		Login login;				
		Choose tc;
		Team_Info ti;
		Play play;
		
		String inID;
		String inPW;
		String inName;
		int teamNum;
		
		System.out.print("닉네임을 입력하세요 >> ");
		inName = input.next();
		
		ti = new Team_Info();
		dto = new DTO(inName);
		int rs = ti.T_Check(dto);
		
		System.out.println(rs);
	}
}