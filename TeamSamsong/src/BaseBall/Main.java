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
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛               Main Menu               弛");
			System.out.println("戍式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式扣");
			System.out.println("弛       [1]煎斜檣  [2]�蛾� 陛殮  [3]謙猿      弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
			
			System.out.print("詭景蒂 摹鷗ж撮蹂 >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
				System.out.println("弛           L   O   G   I   N           弛");
				System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
				
				while(true) {
					System.out.print("ID蒂 殮溘ж撮蹂 >> ");
					inID = input.next();
					System.out.print("PW蒂 殮溘ж撮蹂 >> ");
					inPW = input.next();
				
					dao = new DAO();
					dto = new DTO(inID, inPW);				
					String rsLogin = dao.Login(dto);
					String rsID = dao.Login(dto);
					
					if (rsID == null) {
						System.out.println("襄營ж朝 ID陛 嬴椎棲棻!!");
						sleep(700);
						continue;
					}					
					if (rsLogin.equals(inPW)) {
						System.out.println("煎斜檣 撩奢");
					}
					else if (!rsLogin.equals(inPW)){
						System.out.println("煎斜檣 褒ぬ...");
						System.out.println("PW蒂 棻衛 �挫恉� 輿撮蹂!!");
						System.out.println("棻衛 殮溘п 輿撮蹂.");
						sleep(700);
						continue;
					}
					break;
				}
				
				if (num == 1) {					
					System.out.println("≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧");
					System.out.printf("         %s椒 橫憮螃撮蹂. �紊腎桭炴�!!      ", inID);
					System.out.println("\n≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠");
					
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.println("弛              Search Menu              弛");
					System.out.println("戍式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式扣");
					System.out.println("弛     [1]ぜ 摹鷗  [2]摹熱 褻��  [3]楨韁 褻�� ﹛ 弛");
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
					
					System.out.print("詭景蒂 摹鷗ж撮蹂 >> ");
					num = input.nextInt();
					
					if (num == 1) {						
						while(true) {
							System.out.print("棣啻歜擊 殮溘ж撮蹂 >> ");
							inName = input.next();							
							
							dao = new DAO();
							dto = new DTO(inID, inPW, inName);
							int rs = dao.T_Check(dto);
							String rsNick = dao.N_Check(dto);							
							
							//棣啻歜檜 ぎ葬棻賊 棻衛 殮溘
							if(!inName.equals(rsNick)) {
								System.out.println("棣啻歜檜 螢夥腦雖 彊蝗棲棻!!");
								System.out.println("棻衛 殮溘п 輿撮蹂.");
								sleep(700);
								continue;
							}
							
							//檜嘐 ぜ檜 襄營и棻賊 ぜ 摹鷗 X
							if(rs != 0) {
								System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
								System.out.println("戍式式式式式式式  檜嘐 ぜ檜 蛔煙腎橫 氈蝗棲棻!!  式式式式式式式扣");       
								System.out.println("戍式式式式式式式式式   棻擠 詭景煎 檜翕м棲棻﹛﹛式式式式式式式式式扣"); 
								System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
								sleep(800);
								break;
							}
							
							while(true) {
								System.out.println("================= ぜ 跡煙 =================");
								System.out.print("      [1]SSG 楠渦蝶\t[2]酈遺 �鷑貔恔�" + "\n" 
											+ "      [3]KIA 顫檜剪鍔\t[4]LG お孺蝶" + "\n"
											+ "      [5]舒骯 漆橫蝶\t[6]鳴撩 塭檜螞鍔" + "\n"
											+ "      [7]煜等 濠檜樹隴\t[8]KT 嬪鍔" + "\n"
											+ "      [9]LG お孺蝶\t[10]NC 棻檜喻蝶" + "\n");
								System.out.println("=========================================");
							
								System.out.print("ぜ[廓�β擊 摹鷗ж撮蹂 >> ");
								teamNum = input.nextInt();							
							
								dao = new DAO();
								dto = new DTO(inName, teamNum);
								dao.Choose(dto);
							
								dao = new DAO();							
								dao.Team_Info(teamNum);							
							
								if (teamNum < 1 || teamNum > 10) {
									continue;
								}
								
								System.out.println("ぜ 蛔煙檜 諫猿腎歷蝗棲棻!!");
								break;
							}
							break;
						}
						
						while(true) {
							System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
							System.out.println("弛               Game Menu               弛");
							System.out.println("戍式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式扣");
							System.out.println("弛    [1]啪歜 霞ч [2]蝶む暫 鉻晦 [3]檜瞪 詭景﹛ ﹛弛");
							System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
							
							System.out.print("詭景蒂 摹鷗ж撮蹂 >> ");
							num = input.nextInt();
							
							if (num == 1) {

							}
							
							else if (num == 2) {

							}
							
							else if (num == 3) {
								break;
							}
							
							else {
								System.out.println("螢夥艇 摹鷗檜 в蹂м棲棻!!");
								System.out.println("棻衛 殮溘п 輿撮蹂.");
								sleep(800);
							}
						}
					}					
				}
			}
			
			if (num == 2) {
				System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
				System.out.println("弛             J   O   I   N             弛");
				System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
				
				while (true){
					System.out.print("ID 殮溘 >> ");
					inID = input.next();
					System.out.print("PW 殮溘 >> ");
					inPW = input.next();
					System.out.print("NAME 殮溘 >> ");
					inName = input.next();

					dao = new DAO();
					dto = new DTO(inID, inPW, inName);
					dao.Join(dto);
					String rsId = dao.I_Check(dto);
					String rsName = dao.Name_Check(dto);				

					if (inID.equals(rsId)) {
						System.out.println("檜嘐 餌辨 醞檣 ID 殮棲棻!!");
						System.out.println("棻艇 ID蒂 殮溘п 輿撮蹂.");
						sleep(700);
						continue;
					}
					
					if (!inID.equals(rsId)) {
						if (!inName.equals(rsName)) {
							System.out.println("�蛾� 陛殮檜 諫猿腎歷蝗棲棻!!");
							break;
						}
						else if (inName.equals(rsName)) {
							System.out.println("檜嘐 餌辨 醞檣 棣啻歜殮棲棻!!");
							System.out.println("棻艇 棣啻歜擊 殮溘п 輿撮蹂.");
							sleep(700);
							continue;
						}						
					}					
				}
			}			
			
			if (num == 3) {				
				System.out.println("啪歜擊 謙猿м棲棻.");	
				System.out.println("馬餌м棲棻.");
				sleep(800);
			}
			
			else {
				System.out.println("螢夥艇 摹鷗檜 в蹂м棲棻!!");
				System.out.println("棻衛 殮溘п 輿撮蹂.");
				sleep(800);
			}
		}
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} 
		catch (Exception e) {
			System.out.println("濡衛虜 晦棻溥輿撮蹂!!");
		}
	}
}