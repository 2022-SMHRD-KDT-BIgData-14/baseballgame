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
		
		System.out.print("ID�� �Է��ϼ��� >> ");
		inID = input.next();
		System.out.print("PW�� �Է��ϼ��� >> ");
		inPW = input.next();
		
		System.out.print("�г����� �Է��ϼ��� >> ");
		inName = input.next();
		
		dao = new DAO();
		dto = new DTO(inID, inPW, inName);
		String rsId = dao.I_Check(dto);
		
		System.out.println(rsId);
	}
}