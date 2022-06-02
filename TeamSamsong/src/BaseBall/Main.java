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
			System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
			System.out.println("¦¢               Main Menu               ¦¢");
			System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
			System.out.println("¦¢       [1]·Î±×ÀÎ  [2]È¸¿ø °¡ÀÔ  [3]Á¾·á      ¦¢");
			System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
			
			System.out.print("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä >> ");
			int num = input.nextInt();		
		
			if(num == 1) {
				System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
				System.out.println("¦¢           L   O   G   I   N           ¦¢");
				System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
				
				while(true) {
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
						System.out.println("¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù");
						System.out.printf("         %s´Ô ¾î¼­¿À¼¼¿ä. È¯¿µÇÕ´Ï´Ù!!      ", inID);
						System.out.println("\n¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú¡Ù¡Ú");
					}
					else if (!rsLogin.equals(inPW)){
						System.out.println("·Î±×ÀÎ ½ÇÆÐ...");
						System.out.println("PW¸¦ ´Ù½Ã È®ÀÎÇØ ÁÖ¼¼¿ä!!");
						System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
						sleep(700);
						continue;
					}
					break;
				}
				
				if (num == 1) {						
					System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
					System.out.println("¦¢              Search Menu              ¦¢");
					System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
					System.out.println("¦¢     [1]ÆÀ ¼±ÅÃ  [2]¼±¼ö Á¶È¸  [3]·©Å· Á¶È¸ ¡¡ ¦¢");
					System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
					
					System.out.print("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä >> ");
					num = input.nextInt();
					
					if (num == 1) {						
						while(true) {
							System.out.print("´Ð³×ÀÓÀ» ÀÔ·ÂÇÏ¼¼¿ä >> ");
							inName = input.next();							
							
							dao = new DAO();
							dto = new DTO(inID, inPW, inName);
							int rs = dao.T_Check(dto);
							String rsNick = dao.N_Check(dto);							
							
							//´Ð³×ÀÓÀÌ Æ²¸®´Ù¸é ´Ù½Ã ÀÔ·Â
							if(!inName.equals(rsNick)) {
								System.out.println("´Ð³×ÀÓÀÌ ¿Ã¹Ù¸£Áö ¾Ê½À´Ï´Ù!!");
								System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
								sleep(700);
								continue;
							}
							
							//ÀÌ¹Ì ÆÀÀÌ Á¸ÀçÇÑ´Ù¸é ÆÀ ¼±ÅÃ X
							if(rs != 0) {
								System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
								System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡  ÀÌ¹Ì ÆÀÀÌ µî·ÏµÇ¾î ÀÖ½À´Ï´Ù!!  ¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");       
								System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡   ´ÙÀ½ ¸Þ´º·Î ÀÌµ¿ÇÕ´Ï´Ù¡¡¡¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©"); 
								System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
								sleep(800);
								break;
							}
							
							while(true) {
								System.out.println("================= ÆÀ ¸ñ·Ï =================");
								System.out.print("      [1]SSG ·£´õ½º\t[2]Å°¿ò È÷¾î·ÎÁî" + "\n" 
											+ "      [3]KIA Å¸ÀÌ°ÅÁî\t[4]LG Æ®À©½º" + "\n"
											+ "      [5]µÎ»ê º£¾î½º\t[6]»ï¼º ¶óÀÌ¿ÂÁî" + "\n"
											+ "      [7]·Ôµ¥ ÀÚÀÌ¾ðÃ÷\t[8]KT À§Áî" + "\n"
											+ "      [9]LG Æ®À©½º\t[10]NC ´ÙÀÌ³ë½º" + "\n");
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
						
						while(true) {
							System.out.println("¦£¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¤");
							System.out.println("¦¢               Game Menu               ¦¢");
							System.out.println("¦§¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦©");
							System.out.println("¦¢    [1]°ÔÀÓ ÁøÇà [2]½ºÆä¼È »Ì±â [3]ÀÌÀü ¸Þ´º¡¡ ¡¡¦¢");
							System.out.println("¦¦¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¡¦¥");
							
							System.out.print("¸Þ´º¸¦ ¼±ÅÃÇÏ¼¼¿ä >> ");
							num = input.nextInt();
							
							if (num == 1) {

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
				
				while (true){					
					System.out.print("ID ÀÔ·Â >> ");
					inID = input.next();
					if (inID.equals("-1")){
						break;
					}
					System.out.print("PW ÀÔ·Â >> ");
					inPW = input.next();
					if (inPW.equals("-1")){
						break;
					}
					System.out.print("NAME ÀÔ·Â >> ");
					inName = input.next();
					if (inName.equals("-1")){
						break;
					}					
					
					dao = new DAO();
					dto = new DTO(inID, inPW, inName);
					
					String rsId = dao.I_Check(dto);					
					if (inID.equals(rsId)) {
						System.out.println("ÀÌ¹Ì »ç¿ë ÁßÀÎ ID ÀÔ´Ï´Ù!!");
						System.out.println("´Ù¸¥ ID¸¦ ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
						sleep(700);
						continue;
					}
					
					String rsName = dao.Name_Check(dto);
					if (inName.equals(rsName)) {
						System.out.println("ÀÌ¹Ì »ç¿ë ÁßÀÎ ´Ð³×ÀÓÀÔ´Ï´Ù!!");
						System.out.println("´Ù¸¥ ´Ð³×ÀÓÀ» ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
						sleep(700);
						continue;										
					}
					
					if (!inID.equals(rsId)) {
						if (!inName.equals(rsName)) {
							dao.Join(dto);
							System.out.println("È¸¿ø °¡ÀÔÀÌ ¿Ï·áµÇ¾ú½À´Ï´Ù.");
						}	
					}					
					break;
				}
			}			
			
			if (num == 3) {				
				System.out.println("°ÔÀÓÀ» Á¾·áÇÕ´Ï´Ù.");	
				System.out.println("°¨»çÇÕ´Ï´Ù.");
				sleep(800);
			}
			
			else if(num < 1 || num > 3){
				System.out.println("¿Ã¹Ù¸¥ ¼±ÅÃÀÌ ÇÊ¿äÇÕ´Ï´Ù!!");
				System.out.println("´Ù½Ã ÀÔ·ÂÇØ ÁÖ¼¼¿ä.");
				sleep(800);
			}
		}
	}
	
	public static void sleep(int time) {
		try {
			Thread.sleep(time);
		} 
		catch (Exception e) {
			System.out.println("Àá½Ã¸¸ ±â´Ù·ÁÁÖ¼¼¿ä!!");
		}
	}
}