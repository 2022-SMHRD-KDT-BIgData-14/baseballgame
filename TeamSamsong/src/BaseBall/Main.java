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
			System.out.println("[1]�α��� [2]ȸ�� ���� [3]����");
			System.out.print("�޴��� �����ϼ��� >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.print("ID�� �Է��ϼ��� >> ");
				inID = input.next();
				System.out.print("PW�� �Է��ϼ��� >> ");
				inPW = input.next();
				
				lj = new Login_Join();
				dto = new DTO(inID, inPW);
				lj.Login(dto);				
				
				if (inPW != "") {
					
				}
				
				if (num == 1) {
					//int[] playerArr = new int[5];
					System.out.println(inID + "�� ȯ���մϴ�. �������!");
					System.out.println("[1]�� ���� [2]��ŷ ��ȸ [3]����� �̱�");					
					System.out.print("�޴��� �����ϼ��� >> ");
					num = input.nextInt();
					
					if (num == 1) {
						while(true) {
							
							System.out.print("�г����� �Է��ϼ��� >> ");
							inName = input.next();
							
							System.out.println("==================== �� ��� ====================");
							System.out.print("[1]SSG ������\t   [2]Ű�� �������" + "\n" 
										   + "[3]KIA Ÿ�̰���\t   [4]LG Ʈ����" + "\n"
										   + "[5]�λ� ���\t   [6]�Ｚ ���̿���" + "\n"
										   + "[7]�Ե� ���̾���\t   [8]KT ����" + "\n"
										   + "[9]LG Ʈ����\t   [10]NC ���̳뽺" + "\n");
							System.out.println("===============================================");
							
							System.out.print("��[��ȣ]�� �����ϼ��� >> ");
							teamNum = input.nextInt();							
							
							tc = new TeamChoose();
							dto = new DTO(inName, teamNum);
							tc.Choose(dto);
							
							if (teamNum == 1) {
								System.out.println("SSG ������ ���� �����ϼ̽��ϴ�");
								
								System.out.print("ATT : ");		
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
								// ���� �ɷ�ġ �ο�
								//for (int j = 0; j < athlete.length; j++) {
								//	athlete[j] = rand.nextInt(15) + 60;
								//}
								// ���� DB�� ����
							} 
							
							else if (teamNum == 2) {
								System.out.println("Ű�� ������� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
							}
							
							else if (teamNum == 3) {
								System.out.println("��� Ÿ�̰��� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 4; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 1; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();

							}
							
							else if (teamNum == 4) {
								System.out.println("LG Ʈ���� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();

							} 
							
							else if (teamNum == 5) {
								System.out.println("�λ� ��� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 5; k++) {
									System.out.print("��");
								}									
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
							}
							
							else if (teamNum == 6) {
								System.out.println("�Ｚ ���̿��� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();								
							}
							
							else if (teamNum == 7) {
								System.out.println("�Ե� ���̾��� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 4; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 1; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
							}
							
							else if (teamNum == 8) {
								System.out.println("KT ���� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
							} 
							
							else if (teamNum == 9) {
								System.out.println("��ȭ �̱۽� ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
							}
							
							else if (teamNum == 10) {
								System.out.println("NC ���̳뽺 ���� �����ϼ̽��ϴ�");
								System.out.print("ATT : ");		
								for (int k = 0; k < 4; k++) {
									System.out.print("��");
								}	
								for (int k = 0; k < 1; k++) {
									System.out.print("��");
								}		
								System.out.println();
								
								System.out.print("DEF : ");
								for (int k = 0; k < 3; k++) {
									System.out.print("��");
								}
								for (int k = 0; k < 2; k++) {
									System.out.print("��");
								}	
								System.out.println();
							}
							
							else {
								System.out.println("�ùٸ� ������ �ʿ��մϴ�!!");
								continue;
							}							
							break;							
						}						
						System.out.println("�� ����� �Ϸ�Ǿ����ϴ�!!");
						
						while (true) {
							System.out.println("[1]���� ���� [2]���� ��ȸ [3]���� �޴�");							
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
								System.out.println("�߸������ϼ̽��ϴ�");

							}
						}
					}					
				}
			}
			
			if (num == 2) {				
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
			
			if (num == 3) {				
				System.out.println("������ �����մϴ�.");	
				System.out.println("�����մϴ�.");
			}
		}
	}
}