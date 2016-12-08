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
				System.out.println("�������!!");
				System.out.println("-------------------------------");
				System.out.println("1: �����Ѹ��Է�");
				System.out.println("2: �˻�");
				System.out.println("3: ����");
				System.out.println("4: ����");
				System.out.println("5: ��ü���");
				System.out.println("6: ����");
				System.out.println("-------------------------------");
				System.out.println("�̿��� �޴��� �����ϼ���");
				
				sel = Integer.parseInt(JOptionPane.showInputDialog("�޴�����"));
				switch (sel) {
				case 1:
					String name = JOptionPane.showInputDialog("�̸� : ");
					String birth = JOptionPane.showInputDialog("������� : ");
					String height = JOptionPane.showInputDialog("Ű : ");
					String team = JOptionPane.showInputDialog("�Ҽ� : ");
					String position = JOptionPane.showInputDialog("������ : ");
					String number = JOptionPane.showInputDialog("��� : ");
					String school = JOptionPane.showInputDialog("��ű� : ");
					
					boolean b1 = pdao.insert_player
							(name, birth, height, team, position, number, school);
					if(b1)
						System.out.println("insert ok");
					else
						System.out.println("insert error");
					break;
				case 2:
					String name1 = JOptionPane.showInputDialog("�˻��� �̸� : ");
					boolean b2 = pdao.search_player(name1) != null;
					if(b2)
						System.out.println("search ok");
					else
						System.out.println("search error");
					break;
				case 3:
					String n1 = JOptionPane.showInputDialog("���� �̸���?");
					String n2 = JOptionPane.showInputDialog("�ٲ� �̸���?");
					
					boolean b3 = pdao.update_player(n1, n2);
					if(b3)
						//JOptionPane.showMessageDialog(null, "update�ߴٰ� ���ض�");
						System.out.println("update ok");
					else
						System.out.println("update error");
					break;
				case 4:
					String num = JOptionPane.showInputDialog("������ ��� : ");
					
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
					JOptionPane.showMessageDialog(null, "����..Good Luck!!!!!!!");
					int aa=JOptionPane.showConfirmDialog(null, "����?????");
					if(aa==JOptionPane.YES_OPTION)
				           System.exit(1);	   
					else
						JOptionPane.showMessageDialog(null, "�������..Good Luck!!!!!!!");
					 	
					
					//System.out.println("�����մϴ�");
					pdao.pstmtClose();
					pdao.getAllInfoClose();
					break;
				}
			}while(sel !=6);
			
		}

}




