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
			System.out.println("선수명단!!");
			System.out.println("-------------------------------");
			System.out.println("1: 센터");
			System.out.println("2: 공격형 FD");
			System.out.println("3: 수비형 FD");
			System.out.println("4: 공격형 GD");
			System.out.println("5: 수비형 GD");
			System.out.println("6: 종료");
			System.out.println("-------------------------------");
			System.out.println("이용할 메뉴를 선택하세요");

			sel = Integer.parseInt(JOptionPane.showInputDialog("메뉴선택"));
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
				JOptionPane.showMessageDialog(null, "종료..Good Luck!!!!!!!");
				int aa = JOptionPane.showConfirmDialog(null, "종료?????");
				if (aa == JOptionPane.YES_OPTION)
					System.exit(1);
				else
					JOptionPane.showMessageDialog(null,
							"종료안해..Good Luck!!!!!!!");

				// System.out.println("종료합니다");
				pdao.pstmtClose();
				pdao.getAllInfoClose();
				break;
			}

		} while (sel != 4);

	}
}
