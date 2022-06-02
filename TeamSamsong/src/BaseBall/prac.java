package BaseBall;

import java.util.Scanner;

public class prac {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		DTO dto;
		DAO dao;
		
		String inID;
		String inPW;
		String inName;
		int teamNum;
		
		System.out.print("ID를 입력하세요 >> ");
		inID = input.next();
		System.out.print("PW를 입력하세요 >> ");
		inPW = input.next();
		
		System.out.print("닉네임을 입력하세요 >> ");
		inName = input.next();
		
		dao = new DAO();
		dto = new DTO(inID, inPW, inName);
		String rsId = dao.I_Check(dto);
		
		System.out.println(rsId);
	}
}