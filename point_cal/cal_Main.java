package point_cal;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class cal_Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ResultSet rs = null;
		
		int sel = 0;
		String playerID		= "";
		String playerAvgCnt	= "";
		
		cal_DAO pdao = new cal_DAO();
		do {
			System.out.println("�������!!");
			System.out.println("-------------------------------");
			System.out.println("1: ����");
			System.out.println("2: ������ FD");
			System.out.println("3: ������ FD");
			System.out.println("4: ������ GD");
			System.out.println("5: ������ GD");
			System.out.println("6: ����");
			System.out.println("-------------------------------");
			System.out.println("�̿��� �޴��� �����ϼ���");

			sel = Integer.parseInt(JOptionPane.showInputDialog("�޴�����"));
			switch (sel) {
			case 1:
				rs = pdao.listCenterPlayer();
				while(rs.next()) {
					System.out.println("?");
					playerID		= rs.getString(1);
					playerAvgCnt	= rs.getString(2);
					
					System.out.println(playerID + ", " + playerAvgCnt);
				}
				break;
				
			case 2:
				rs = pdao.listOffFD();
				while(rs.next()) {
					System.out.println("?");
					playerID		= rs.getString(1);
					playerAvgCnt	= rs.getString(2);
					
					System.out.println(playerID + ", " + playerAvgCnt);
				}
				break;	
			case 3:
				rs = pdao.listDefFD();
				while(rs.next()) {
					System.out.println("?");
					playerID		= rs.getString(1);
					playerAvgCnt	= rs.getString(2);
					
					System.out.println(playerID + ", " + playerAvgCnt);
				}
				break;
			case 4:
				rs = pdao.listOffGD();
				while(rs.next()) {
					System.out.println("?");
					playerID		= rs.getString(1);
					playerAvgCnt	= rs.getString(2);
					
					System.out.println(playerID + ", " + playerAvgCnt);
				}
				break;
			case 5:
				rs = pdao.listDefGD();
				while(rs.next()) {
					System.out.println("?");
					playerID		= rs.getString(1);
					playerAvgCnt	= rs.getString(2);
					
					System.out.println(playerID + ", " + playerAvgCnt);
				}
				break;
				
/*
			case 2:
				rs = pdao.listOffencePlayer();
				while(rs.next()) {
					System.out.println("?");
					playerID		= rs.getString(1);
					playerAvgCnt	= rs.getString(2);
					
					System.out.println(playerID + ", " + playerAvgCnt);
				}
				
				break;

			case 3:
				rs = pdao.listDefencePlayer();
				break;
*/
			case 6:
				JOptionPane.showMessageDialog(null, "����..Good Luck!!!!!!!");
				int aa = JOptionPane.showConfirmDialog(null, "����?????");
				if (aa == JOptionPane.YES_OPTION)
					System.exit(1);
				else
					JOptionPane.showMessageDialog(null,
							"�������..Good Luck!!!!!!!");

				// System.out.println("�����մϴ�");
				pdao.pstmtClose();
				pdao.getAllInfoClose();
				break;
			}

		} while (sel != 4);

	}
}
