package BaseBall;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.print("ID �Է� >> ");
		String inID = input.nextLine();
		System.out.print("PW �Է� >> ");
		String inPW = input.nextLine();
		System.out.print("NAME �Է� >> ");
		String inName = input.nextLine();
		
		Login_Join lj = new Login_Join();
		DTO dto = new DTO(inID, inPW, inName);
		lj.Join(dto);
		
	}
}