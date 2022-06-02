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
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢               Main Menu               ¦¢");
			System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
			System.out.println("¦¢       [1]·Î±×ÀÎ  [2]È¸¿ø °¡ÀÔ  [3]Á¾·á      ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");

			System.out.print("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä >> ");
			int num = input.nextInt();

			if (num == 1) {
				System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
				System.out.println("¦¢           L   O   G   I   N           ¦¢");
				System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");

				while (true) {
					System.out.print("ID¸¦ ÀÔ·ÂÇÏ¼¼¿ä >> ");
					inID = input.next();
					System.out.print("PW¸¦ ÀÔ·ÂÇÏ¼¼¿ä >> ");
					inPW = input.next();

					dao = new DAO();
					dto = new DTO(inID, inPW);
					String rsLogin = dao.Login(dto);
					String rsID = dao.Login(dto);

					if (rsID == null) {
						System.out.println("Á¸ÀçÇÏ´Â ID°¡ ¾Æ´Õ´Ï´Ù!!");
						sleep(700);
						continue;
					}
					if (rsLogin.equals(inPW)) {
						System.out.println("·Î±×ÀÎ ¼º°ø");
					} else if (!rsLogin.equals(inPW)) {
						System.out.println("·Î±×ÀÎ ½ÇÆÐ...");
						System.out.println("PW¸¦ ´Ù½Ã È®ÀÎÇØ ÁÖ¼¼¿ä!!");
						System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
						sleep(700);
						continue;
					}
					break;
				}

				if (num == 1) {
					System.out.println("¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù");
					System.out.printf("         %s´Ô ¾î¼­¿À¼¼¿ä. È¯¿µÇÕ´Ï´Ù!!      ", inID);
					System.out.println("\n¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú");

					System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
					System.out.println("¦¢              Search Menu              ¦¢");
					System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
					System.out.println("¦¢     [1]ÆÀ ¼±ÅÃ  [2]¼±¼ö Á¶È¸  [3]·©Å· Á¶È¸ ¡¡ ¦¢");
					System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");

					System.out.print("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä >> ");
					num = input.nextInt();

					if (num == 1) {
						while (true) {
							System.out.print("´Ð³×ÀÓÀ» ÀÔ·ÂÇÏ¼¼¿ä >> ");
							inName = input.next();

							dao = new DAO();
							dto = new DTO(inID, inPW, inName);
							int rs = dao.T_Check(dto);
							String rsNick = dao.N_Check(dto);

							// ´Ð³×ÀÓÀÌ Æ²¸®´Ù¸é ´Ù½Ã ÀÔ·Â
							if (!inName.equals(rsNick)) {
								System.out.println("´Ð³×ÀÓÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù!!");
								System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
								sleep(700);
								continue;
							}

							// ÀÌ¹Ì ÆÀÀÌ Á¸ÀçÇÑ´Ù¸é ÆÀ ¼±ÅÃ X
							if (rs != 0) {
								System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
								System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡  ÀÌ¹Ì ÆÀÀÌ µî·ÏµÇ¾î ÀÖ½À´Ï´Ù!!  ¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
								System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡   ´ÙÀ½ ¸Þ´º·Î ÀÌµ¿ÇÕ´Ï´Ù¡¡¡¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
								System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
								sleep(800);
								break;
							}

							while (true) {
								System.out.println("================= ÆÀ ¸ñ·Ï =================");
								System.out.print("      [1]SSG ·£´õ½º\t[2]Å°¿ò È÷¾î·ÎÁî" + "\n" + "      [3]KIA Å¸ÀÌ°ÅÁî\t[4]LG Æ®À©½º"
										+ "\n" + "      [5]µÎ»ê º£¾î½º\t[6]»ï¼º ¶óÀÌ¿ÂÁî" + "\n" + "      [7]·Ôµ¥ ÀÚÀÌ¾ðÃ÷\t[8]KT À§Áî"
										+ "\n" + "      [9]LG Æ®À©½º\t[10]NC ´ÙÀÌ³ë½º" + "\n");
								System.out.println("=========================================");

								System.out.print("ÆÀ[¹øÈ£]À» ¼±ÅÃÇÏ¼¼¿ä >> ");
								teamNum = input.nextInt();

								dao = new DAO();
								dto = new DTO(inName, teamNum);
								dao.Choose(dto);

								dao = new DAO();
								dao.Team_Info(teamNum);

								if (teamNum < 1 || teamNum > 10) {
									continue;
								}

								System.out.println("ÆÀ µî·ÏÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù!!");
								break;
							}
							break;
						}

						while (true) {
							System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
							System.out.println("¦¢               Game Menu               ¦¢");
							System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
							System.out.println("¦¢    [1]°ÔÀÓ ÁøÇà [2]½ºÆä¼È »Ì±â [3]ÀÌÀü ¸Þ´º¡¡ ¡¡¦¢");
							System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");

							System.out.print("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä >> ");
							num = input.nextInt();

							if (num == 1) {
								// ³»ÆÀ Å¸ÀÚ ¸í´Ü Á¶È¸
								dao.athlete(dto);
								
								//Å¸ÀÚ È£Ãâ
								System.out.print("³» Å¸ÀÚ ¼±ÅÃ¸¦ ¼±ÅÃÇÏ¼¼¿ä : ");
								num = input.nextInt();
								
								dao.athlete_sub2(dto);
								
								
								// ³»ÆÀ¿¡ ¼ÓÇÑ Åõ¼ö¸¦ Á¦¿ÜÇÑ ³ª¸ÓÁö ÆÀÀÇ Åõ¼ö¸¦ È£Ãâ
								dao.athlete_sub(dto);

//								try {
//									// c : ³»°¡ ¼±ÅÃ ÇÒ ¼±¼ö ¹øÈ£
//									int c = input.nextInt() - 1;
//
//									// sub : ³» Å¸ÀÚ¿Í »óÅÂ Åõ¼öÀÇ ´É·ÂÄ¡ Â÷ÀÌ
//									int sub = Math.abs(game_atk.get(c) - def);
//
//									if (sub % 7 == 0) {
//										System.out.println("3·çÅ¸!");
//										score = score + 3;
//										cp = cp + 3;
//										rp = rp + 3;
//										bun = 0;
//										stk = 0;
//										System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "OUT : " + out);
//									} else if (sub % 6 == 0 && sub != 24) {
//										System.out.println("2·çÅ¸!");
//										score = score + 2;
//										cp = cp + 2;
//										rp = rp + 2;
//										bun = 0;
//										stk = 0;
//										System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "OUT : " + out);
//									} else if (sub % 5 == 0 && sub != 25) {
//										System.out.println("1·çÅ¸!");
//										score = score + 1;
//										cp = cp + 1;
//										rp = rp + 1;
//										bun = 0;
//										stk = 0;
//										System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "OUT : " + out);
//									} else if (sub == 1 || sub == 2 || sub == 23) {
//										bun++;
//										if (bun == 1) {
//											System.out.println("¹øÆ® ½ÇÆÐ! ¾Æ¿ô!!");
//											out = out + 1;
//											game_atk.set(c, null);
//											System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "OUT : " + out);
//										} else {
//											System.out.println("¿¬¼Ó ¹øÆ® ½ÇÆÐ!");
//											System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "BUNT OUT");
//											break;
//										}
//									} else if (sub == 0 || sub == 24 || sub == 25) {
//										System.out.println("È¨·±!!!!!!");
//										score = score + 5;
//										cp = cp + 5;
//										rp = rp + 5;
//										stk = 0;
//										bun = 0;
//										System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "OUT : " + out);
//									} else {
//										System.out.println("Çê½ºÀ®!!");
//										stk++;
//										bun = 0;
//										System.out.println(stk + "½ºÆ®¶óÀÌÅ©");
//										if (stk == 3) {
//											System.out.println("3½ºÆ®¶óÀÌÅ©...¾Æ¿ô!!");
//											stk = 0;
//											out = out + 1;
//											game_atk.set(c, null);
//											System.out.println("È¹µæ Á¡¼ö : " + score + "\t" + "OUT : " + out);
//										}
//									}
//
//								} catch (NullPointerException e) {
//									System.out.println("¾Æ¿ôµÈ ¼±¼ö´Â ¼±ÅÃÇÒ¼ö¾ø½À´Ï´Ù");
//								}
//							}
//							if (out == 3) {
//								System.out.println("3¾Æ¿ôÀ¸·Î °ÔÀÓÀÌ ³¡³µ½À´Ï´Ù" + "\t" + "¸Þ´ºÈ­¸éÀ¸·Î µ¹¾Æ°©´Ï´Ù.");
//							} else {
//								System.out.println("¿¬¼ÓµÈ ¹øÆ®½ÇÆÐÀÇ ÆÐ³ÎÆ¼·Î °ÔÀÓÀÌ ³¡³µ½À´Ï´Ù.");
//							}
//						}

							}

							else if (num == 2) {

							}

							else if (num == 3) {
								break;
							}

							else {
								System.out.println("¿Ã¹Ù¸¥ ¼±ÅÃÀÌ ÇÊ¿äÇÕ´Ï´Ù!!");
								System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
								sleep(800);
							}
						}
					}
				}
			}

			if (num == 2) {
				System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
				System.out.println("¦¢             J   O   I   N             ¦¢");
				System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");

				while (true) {
					System.out.print("ID ÀÔ·Â >> ");
					inID = input.next();
					System.out.print("PW ÀÔ·Â >> ");
					inPW = input.next();
					System.out.print("NAME ÀÔ·Â >> ");
					inName = input.next();

					dao = new DAO();
					dto = new DTO(inID, inPW, inName);
					dao.Join(dto);
					String rsId = dao.I_Check(dto);
					String rsName = dao.Name_Check(dto);

					if (inID.equals(rsId)) {
						System.out.println("ÀÌ¹Ì »ç¿ë ÁßÀÎ ID ÀÔ´Ï´Ù!!");
						System.out.println("´Ù¸¥ ID¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
						sleep(700);
						continue;
					}

					if (!inID.equals(rsId)) {
						if (!inName.equals(rsName)) {
							System.out.println("È¸¿ø °¡ÀÔÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù!!");
							break;
						} else if (inName.equals(rsName)) {
							System.out.println("ÀÌ¹Ì »ç¿ë ÁßÀÎ ´Ð³×ÀÓÀÔ´Ï´Ù!!");
							System.out.println("´Ù¸¥ ´Ð³×ÀÓÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
							sleep(700);
							continue;
						}
					}
				}
			}

			if (num == 3) {
				System.out.println("°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
				System.out.println("°¨»çÇÕ´Ï´Ù.");
				sleep(800);
			}

			else {
				System.out.println("¿Ã¹Ù¸¥ ¼±ÅÃÀÌ ÇÊ¿äÇÕ´Ï´Ù!!");
				System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
				sleep(800);
			}
		}
	}

	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			System.out.println("Àá½Ã¸¸ ±â´Ù·ÁÁÖ¼¼¿ä!!");
		}
	}
}