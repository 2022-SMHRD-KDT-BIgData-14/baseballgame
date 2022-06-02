package BaseBall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main extends Thread {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Random r1 = new Random();
		ArrayList<Integer> att = new ArrayList<Integer>();
		ArrayList<Integer> def = new ArrayList<Integer>();		

		DTO dto;
		DAO dao;

		String inID;
		String inPW;
		String inName;
		int teamNum = 0;

		while (true) {
			System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
			System.out.println("弛               Main Menu               弛");
			System.out.println("戍式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式扣");
			System.out.println("弛       [1]煎斜檣  [2]�蛾� 陛殮  [3]謙猿      弛");
			System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");

			System.out.print("詭景蒂 摹鷗ж撮蹂 >> ");
			int num = input.nextInt();

			if (num == 1) {
				System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
				System.out.println("弛           L   O   G   I   N           弛");
				System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");

				while (true) {
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
						System.out.println("≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧");
						System.out.printf("         %s椒 橫憮螃撮蹂. �紊腎桭炴�!!      ", inID);
						System.out.println("\n≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠≧≠");
					}
					
					else if (!rsLogin.equals(inPW)) {
						System.out.println("煎斜檣 褒ぬ...");
						System.out.println("PW蒂 棻衛 �挫恉� 輿撮蹂!!");
						System.out.println("棻衛 殮溘п 輿撮蹂.");
						sleep(700);
						continue;
					}
					break;
				}

				if (num == 1) {					
					System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
					System.out.println("弛              Search Menu              弛");
					System.out.println("戍式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式扣");
					System.out.println("弛     [1]ぜ 摹鷗  [2]摹熱 褻��  [3]楨韁 褻�� ﹛ 弛");
					System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");

					System.out.print("詭景蒂 摹鷗ж撮蹂 >> ");
					num = input.nextInt();

					if (num == 1) {
						while (true) {
							System.out.print("棣啻歜擊 殮溘ж撮蹂 >> ");
							inName = input.next();

							dao = new DAO();
							dto = new DTO(inID, inPW, inName);
							int rs = dao.T_Check(dto);
							String rsNick = dao.N_Check(dto);

							// 棣啻歜檜 ぎ葬棻賊 棻衛 殮溘
							if (!inName.equals(rsNick)) {
								System.out.println("棣啻歜檜 螢夥腦雖 彊蝗棲棻!!");
								System.out.println("棻衛 殮溘п 輿撮蹂.");
								sleep(700);
								continue;
							}

							// 檜嘐 ぜ檜 襄營и棻賊 ぜ 摹鷗 X
							if (rs != 0) {
								System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
								System.out.println("戍式式式式式式式  檜嘐 ぜ檜 蛔煙腎橫 氈蝗棲棻!!  式式式式式式式扣");
								System.out.println("戍式式式式式式式式式   棻擠 詭景煎 檜翕м棲棻﹛﹛式式式式式式式式式扣");
								System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");
								sleep(800);
								break;
							}

							while (true) {
								System.out.println("================= ぜ 跡煙 =================");
								System.out.print("      [1]SSG 楠渦蝶\t[2]酈遺 �鷑貔恔�" + "\n" 
											   + "      [3]KIA 顫檜剪鍔\t[4]LG お孺蝶"  + "\n"
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

						while (true) {
							System.out.println("忙式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式忖");
							System.out.println("弛               Game Menu               弛");
							System.out.println("戍式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式扣");
							System.out.println("弛    [1]啪歜 霞ч [2]蝶む暫 鉻晦 [3]檜瞪 詭景﹛ ﹛弛");
							System.out.println("戌式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式式戎");

							System.out.print("詭景蒂 摹鷗ж撮蹂 >> ");
							num = input.nextInt();

							if (num == 1) {
								// 頂ぜ 顫濠 貲欽 褻��
								dao.athlete(dto);
								
								//顫濠 ��轎
								System.out.print("頂 顫濠 摹鷗蒂 摹鷗ж撮蹂 : ");
								num = input.nextInt();
								
								dao.athlete_sub2(dto);								
								
								// 頂ぜ縑 樓и 癱熱蒂 薯諼и 釭該雖 ぜ曖 癱熱蒂 ��轎
								dao.athlete_sub(dto);

//								try {
//									// c : 頂陛 摹鷗 й 摹熱 廓��
//									int c = input.nextInt() - 1;
//
//									// sub : 頂 顫濠諦 鼻鷓 癱熱曖 棟溘纂 離檜
//									int sub = Math.abs(game_atk.get(c) - def);
//
//									if (sub % 7 == 0) {
//										System.out.println("3瑞顫!");
//										score = score + 3;
//										cp = cp + 3;
//										rp = rp + 3;
//										bun = 0;
//										stk = 0;
//										System.out.println("�僱� 薄熱 : " + score + "\t" + "OUT : " + out);
//									} else if (sub % 6 == 0 && sub != 24) {
//										System.out.println("2瑞顫!");
//										score = score + 2;
//										cp = cp + 2;
//										rp = rp + 2;
//										bun = 0;
//										stk = 0;
//										System.out.println("�僱� 薄熱 : " + score + "\t" + "OUT : " + out);
//									} else if (sub % 5 == 0 && sub != 25) {
//										System.out.println("1瑞顫!");
//										score = score + 1;
//										cp = cp + 1;
//										rp = rp + 1;
//										bun = 0;
//										stk = 0;
//										System.out.println("�僱� 薄熱 : " + score + "\t" + "OUT : " + out);
//									} else if (sub == 1 || sub == 2 || sub == 23) {
//										bun++;
//										if (bun == 1) {
//											System.out.println("廓お 褒ぬ! 嬴醒!!");
//											out = out + 1;
//											game_atk.set(c, null);
//											System.out.println("�僱� 薄熱 : " + score + "\t" + "OUT : " + out);
//										} else {
//											System.out.println("翱樓 廓お 褒ぬ!");
//											System.out.println("�僱� 薄熱 : " + score + "\t" + "BUNT OUT");
//											break;
//										}
//									} else if (sub == 0 || sub == 24 || sub == 25) {
//										System.out.println("�邢�!!!!!!");
//										score = score + 5;
//										cp = cp + 5;
//										rp = rp + 5;
//										stk = 0;
//										bun = 0;
//										System.out.println("�僱� 薄熱 : " + score + "\t" + "OUT : " + out);
//									} else {
//										System.out.println("②蝶嶽!!");
//										stk++;
//										bun = 0;
//										System.out.println(stk + "蝶お塭檜觼");
//										if (stk == 3) {
//											System.out.println("3蝶お塭檜觼...嬴醒!!");
//											stk = 0;
//											out = out + 1;
//											game_atk.set(c, null);
//											System.out.println("�僱� 薄熱 : " + score + "\t" + "OUT : " + out);
//										}
//									}
//
//								} catch (NullPointerException e) {
//									System.out.println("嬴醒脹 摹熱朝 摹鷗й熱橈蝗棲棻");
//								}
//							}
//							if (out == 3) {
//								System.out.println("3嬴醒戲煎 啪歜檜 部陬蝗棲棻" + "\t" + "詭景�飛橉虞� 給嬴骨棲棻.");
//							} else {
//								System.out.println("翱樓脹 廓お褒ぬ曖 ぬ割じ煎 啪歜檜 部陬蝗棲棻.");
//							}
//						}

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
				
				while (true) {
					System.out.print("ID 殮溘 >> ");
					inID = input.next();
					if (inID.equals("-1")){
						break;
					}
					System.out.print("PW 殮溘 >> ");
					inPW = input.next();
					if (inPW.equals("-1")){
						break;
					}
					System.out.print("NAME 殮溘 >> ");
					inName = input.next();
					if (inName.equals("-1")){
						break;
					}					
					
					dao = new DAO();
					dto = new DTO(inID, inPW, inName);					

					String rsId = dao.I_Check(dto);
					if (inID.equals(rsId)) {
						System.out.println("檜嘐 餌辨 醞檣 ID 殮棲棻!!");
						System.out.println("棻艇 ID蒂 殮溘п 輿撮蹂.");
						sleep(700);
						continue;
					}
					
					String rsName = dao.Name_Check(dto);
					if (inName.equals(rsName)) {
						System.out.println("檜嘐 餌辨 醞檣 棣啻歜殮棲棻!!");
						System.out.println("棻艇 棣啻歜擊 殮溘п 輿撮蹂.");
						sleep(700);
						continue;										
					}
					
					if (!inID.equals(rsId)) {
						if (!inName.equals(rsName)) {
							dao.Join(dto);
							System.out.println("�蛾� 陛殮檜 諫猿腎歷蝗棲棻.");
						}						
					}
					break;					
				}
				break;
			} 
			
			if (num == 3) {
				System.out.println("啪歜擊 謙猿м棲棻.");
				System.out.println("馬餌м棲棻.");
				sleep(800);
			}
			
			else if(num < 1 || num > 3){
				System.out.println("螢夥艇 摹鷗檜 в蹂м棲棻!!");
				System.out.println("棻衛 殮溘п 輿撮蹂.");
				sleep(800);
			}
		}
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out.println("濡衛虜 晦棻溥輿撮蹂!!");
		}
	}
}