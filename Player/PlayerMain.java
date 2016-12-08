package basketMain;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import baseball.stats.playerDTO;
import basket.PlayerDAO;


public class PlayerMain {

	public static void main(String[] args) 
		throws ClassNotFoundException, SQLException{
			
			int sel = 0;
			PlayerDAO pdao = new PlayerDAO();
			do{
				System.out.println("선수명단!!");
				System.out.println("-------------------------------");
				System.out.println("1: 선수한명입력");
				System.out.println("2: 검색");
				System.out.println("3: 수정");
				System.out.println("4: 삭제");
				System.out.println("5: 전체출력");
				System.out.println("6: 종료");
				System.out.println("-------------------------------");
				System.out.println("이용할 메뉴를 선택하세요");
				
				sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));
				switch (sel) {
				case 1:
					String name = JOptionPane.showInputDialog("이름 : ");
					String birth = JOptionPane.showInputDialog("생년월일 : ");
					String height = JOptionPane.showInputDialog("키 : ");
					String team = JOptionPane.showInputDialog("소속 : ");
					String position = JOptionPane.showInputDialog("포지션 : ");
					String number = JOptionPane.showInputDialog("배번 : ");
					String school = JOptionPane.showInputDialog("출신교 : ");
					
					boolean b1 = pdao.insert_player
							(name, birth, height, team, position, number, school);
					if(b1)
						System.out.println("insert ok");
					else
						System.out.println("insert error");
					break;
				case 2:
					String name1 = JOptionPane.showInputDialog("검색할 이름 : ");
					boolean b2 = pdao.search_player(name1) != null;
					if(b2)
						System.out.println("search ok");
					else
						System.out.println("search error");
					break;
				case 3:
					String n1 = JOptionPane.showInputDialog("기존 이름은?");
					String n2 = JOptionPane.showInputDialog("바뀔 이름은?");
					
					boolean b3 = pdao.update_player(n1, n2);
					if(b3)
						//JOptionPane.showMessageDialog(null, "update했다고 전해라");
						System.out.println("update ok");
					else
						System.out.println("update error");
					break;
				case 4:
					String num = JOptionPane.showInputDialog("삭제할 배번 : ");
					
					boolean del = pdao.delete_player(num);
					if(del)
						System.out.println("delete ok");
					else
						System.out.println("delete error");
					break;
				case 5:
					ArrayList<playerDTO> pArray = pdao.listAll();
					for(playerDTO imsi : pArray){						
						System.out.print(imsi.getPlayer_name()+"\t");
						System.out.print(imsi.getPlayer_birth_date()+"\t");
						System.out.print(imsi.getPlayer_height()+"\t");
						System.out.print(imsi.getPlayer_team()+"\t");
						System.out.print(imsi.getPlayer_position()+"\t");
						System.out.print(imsi.getPlayer_number()+"\t");
						System.out.println(imsi.getPlayer_school());
					}
					break;
				case 6:
					JOptionPane.showMessageDialog(null, "종료..Good Luck!!!!!!!");
					int aa=JOptionPane.showConfirmDialog(null, "종료?????");
					if(aa==JOptionPane.YES_OPTION)
				           System.exit(1);	   
					else
						JOptionPane.showMessageDialog(null, "종료안해..Good Luck!!!!!!!");
					 	
					
					//System.out.println("종료합니다");
					pdao.pstmtClose();
					pdao.getAllInfoClose();
					break;
				}
			}while(sel !=6);
			
		}

}




