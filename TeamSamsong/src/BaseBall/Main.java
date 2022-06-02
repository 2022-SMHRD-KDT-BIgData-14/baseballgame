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
			System.out.println("����������������������������������������������������������������������������������");
			System.out.println("��               Main Menu               ��");
			System.out.println("����������������������������������������������������������������������������������");
			System.out.println("��       [1]�α���  [2]ȸ�� ����  [3]����      ��");
			System.out.println("����������������������������������������������������������������������������������");
			
			System.out.print("�޴��� �����ϼ��� >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.println("����������������������������������������������������������������������������������");
				System.out.println("��           L   O   G   I   N           ��");
				System.out.println("����������������������������������������������������������������������������������");
				
				while(true) {
					System.out.print("ID�� �Է��ϼ��� >> ");
					inID = input.next();
					System.out.print("PW�� �Է��ϼ��� >> ");
					inPW = input.next();
				
					dao = new DAO();
					dto = new DTO(inID, inPW);				
					String rsLogin = dao.Login(dto);
					String rsID = dao.Login(dto);
					
					if (rsID == null) {
						System.out.println("�����ϴ� ID�� �ƴմϴ�!!");
						sleep(700);
						continue;
					}					
					if (rsLogin.equals(inPW)) {
						System.out.println("�α��� ����");
					}
					else if (!rsLogin.equals(inPW)){
						System.out.println("�α��� ����...");
						System.out.println("PW�� �ٽ� Ȯ���� �ּ���!!");
						System.out.println("�ٽ� �Է��� �ּ���.");
						sleep(700);
						continue;
					}
					break;
				}
				
				if (num == 1) {					
					System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
					System.out.printf("         %s�� �������. ȯ���մϴ�!!      ", inID);
					System.out.println("\n�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
					
					System.out.println("����������������������������������������������������������������������������������");
					System.out.println("��              Search Menu              ��");
					System.out.println("����������������������������������������������������������������������������������");
					System.out.println("��     [1]�� ����  [2]���� ��ȸ  [3]��ŷ ��ȸ �� ��");
					System.out.println("����������������������������������������������������������������������������������");
					
					System.out.print("�޴��� �����ϼ��� >> ");
					num = input.nextInt();
					
					if (num == 1) {						
						while(true) {
							System.out.print("�г����� �Է��ϼ��� >> ");
							inName = input.next();							
							
							dao = new DAO();
							dto = new DTO(inID, inPW, inName);
							int rs = dao.T_Check(dto);
							String rsNick = dao.N_Check(dto);							
							
							//�г����� Ʋ���ٸ� �ٽ� �Է�
							if(!inName.equals(rsNick)) {
								System.out.println("�г����� �ùٸ��� �ʽ��ϴ�!!");
								System.out.println("�ٽ� �Է��� �ּ���.");
								sleep(700);
								continue;
							}
							
							//�̹� ���� �����Ѵٸ� �� ���� X
							if(rs != 0) {
								System.out.println("����������������������������������������������������������������������������������");
								System.out.println("����������������  �̹� ���� ��ϵǾ� �ֽ��ϴ�!!  ����������������");       
								System.out.println("��������������������   ���� �޴��� �̵��մϴ١�����������������������"); 
								System.out.println("����������������������������������������������������������������������������������");
								break;
							}
							
							System.out.println("================= �� ��� =================");
							System.out.print("      [1]SSG ������\t[2]Ű�� �������" + "\n" 
										   + "      [3]KIA Ÿ�̰���\t[4]LG Ʈ����" + "\n"
										   + "      [5]�λ� ���\t[6]�Ｚ ���̿���" + "\n"
										   + "      [7]�Ե� ���̾���\t[8]KT ����" + "\n"
										   + "      [9]LG Ʈ����\t[10]NC ���̳뽺" + "\n");
							System.out.println("=========================================");
							
							System.out.print("��[��ȣ]�� �����ϼ��� >> ");
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
							System.out.println("����������������������������������������������������������������������������������");
							System.out.println("��               Game Menu               ��");
							System.out.println("����������������������������������������������������������������������������������");
							System.out.println("��    [1]���� ���� [2]����� �̱� [3]���� �޴��� ����");
							System.out.println("����������������������������������������������������������������������������������");
							
							System.out.print("�޴��� �����ϼ��� >> ");
							num = input.nextInt();
							
							if (num == 1) {

							}
							
							else if (num == 2) {

							}
							
							else if (num == 3) {
								break;
							}
							
							else {
								System.out.println("�ùٸ� ������ �ʿ��մϴ�!!");
								System.out.println("�ٽ� �Է��� �ּ���.");
								sleep(800);
							}
						}
					}					
				}
			}
			
			if (num == 2) {
				System.out.println("����������������������������������������������������������������������������������");
				System.out.println("��             J   O   I   N             ��");
				System.out.println("����������������������������������������������������������������������������������");
				
				while (true){
					System.out.print("ID �Է� >> ");
					inID = input.next();
					System.out.print("PW �Է� >> ");
					inPW = input.next();
					System.out.print("NAME �Է� >> ");
					inName = input.next();

					dao = new DAO();
					dto = new DTO(inID, inPW, inName);
					dao.Join(dto);
					String rsId = dao.I_Check(dto);

					if (!inID.equals(rsId)) {
						System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�!!");
						break;
					}
				}
			}			
			
			if (num == 3) {				
				System.out.println("������ �����մϴ�.");	
				System.out.println("�����մϴ�.");
				sleep(800);
			}
			
			else {
				System.out.println("�ùٸ� ������ �ʿ��մϴ�!!");
				System.out.println("�ٽ� �Է��� �ּ���.");
				sleep(800);
			}
		}
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} 
		catch (Exception e) {
			System.out.println("��ø� ��ٷ��ּ���!!");
		}
	}
}