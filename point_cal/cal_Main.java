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
			System.out.println("2: ������ FD & GD");
			System.out.println("3: ������ FD & GD");
			System.out.println("4: ����");
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
//				String name1 = System.out.println("��õ������ " + name1);
				break;

			case 2:
				rs = pdao.listOffencePlayer();
//				String name2 = System.out.println("��õ������ " + name2);
				break;

			case 3:
				rs = pdao.listDefencePlayer();
//				String name3 = System.out.println("��õ������ " + name3);
				break;

			case 4:
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
