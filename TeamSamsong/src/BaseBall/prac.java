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
		
		System.out.print("�г����� �Է��ϼ��� >> ");
		inName = input.next();
		
		dao = new DAO();
		dto = new DTO(inName);
		int rs = dao.T_Check(dto);
		
		System.out.println(rs);
	}
}