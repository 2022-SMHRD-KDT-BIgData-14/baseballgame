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
			System.out.println("[1]ȸ�� ���� [2]�α��� [3]�� ���� [4]�� ���� [5]���� ���� [6]��ŷ ��ȸ [7]���� ����");
			System.out.print("�޴��� �����ϼ��� >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.print("ID �Է� >> ");
				inID = input.next();
				System.out.print("PW �Է� >> ");
				inPW = input.next();
				System.out.print("NAME �Է� >> ");
				inName = input.next();
				
				lj = new Login_Join();
				dto = new DTO(inID, inPW, inName);
				lj.Join(dto);
				
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�!!");
			}
			
			if (num == 2) {
				System.out.print("ID�� �Է��ϼ��� >> ");
				inID = input.next();
				System.out.print("PW�� �Է��ϼ��� >> ");
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
				System.out.println("������ �����մϴ�.");
			}

		}
	}
}