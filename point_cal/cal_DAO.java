package point_cal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dbInfoDBConn.DbInfoDBConn;

public class cal_DAO {

	private Connection con;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	

	public cal_DAO() throws ClassNotFoundException, SQLException {
		con = new DbInfoDBConn().getConnection();
		// ���Ӱ�ü get ->con
	}

	public void pstmtClose() throws SQLException {
		if (pstmt != null) {
			pstmt.close();
		}
	}

	public void getAllInfoClose() throws SQLException {
		if (rs != null) {
			rs.close();
		}
		if (pstmt != null) {
			pstmt.close();
		}
		if (con != null) {
			con.close();
		}
	}

	// ���� ���
	public ResultSet listCenterPlayer() throws SQLException {
		// ���� ���
		String name1 =
					"	SELECT PLAYER_ID, (PLAYER_PTS - PLAYER_TO + PLAYER_OFF + PLAYER_AST) + 0.5 * (PLAYER_BLK + PLAYER_DEF + PLAYER_P3 + PLAYER_FT + PLAYER_REB + PLAYER_STL + PLAYER_PF) / TO_NUMBER(replace(PLAYER_MINU, ':', ''))"
					+ "	FROM POINT_EXAM6"
					+ "	WHERE PLAYER_ID = ("
					+ "		SELECT PLAYER_ID"
					+ "		FROM ("
					+ "			SELECT player_id, (PLAYER_PTS - PLAYER_TO + PLAYER_OFF + PLAYER_AST) + 0.5 * (PLAYER_BLK + PLAYER_DEF + PLAYER_P3 + PLAYER_FT + PLAYER_REB + PLAYER_STL + PLAYER_PF) / TO_NUMBER(replace(PLAYER_MINU, ':', ''))"
					+ "			FROM POINT_EXAM6"
					+ "			WHERE PLAYER_POSI = 'c'"
					+ "			ORDER BY 2 DESC"
					+ "		)"
					+ "		WHERE ROWNUM = 1"
					+ "	)";
		
		pstmt = con.prepareStatement(name1);
		rs = pstmt.executeQuery();
		return rs;
	}
	
	// ������ ���
	public ResultSet listOffencePlayer() throws SQLException {
		// ������ ������ &����2��
		String name2 = " SELECT player_ID, (player_PTS-player_TO+player_OFF+player_AST)+0.5*(player_P3+player_FT+player_DEF+player_REB+player_STL+player_BLK+player_PF))/TO_NUMBER(replace(player_Minu, ':', '')) AS ����) "
				+ " FROM point_exam6"
				+ " where player_posi like 'FD any GD'"
				+ " AND where ROWNUM =< 2; ";

		pstmt = con.prepareStatement(name2);
		rs = pstmt.executeQuery();
		return rs;
	}
	
	// ������ ���
	public ResultSet listDefencePlayer() throws SQLException {
		// ������ ������ &����2��
		String name3 = " SELECT player_ID, ((player_PTS+player_DEF+player_STL)+0.5*(player_PF+player_TO+player_BLK+player_AST+player_REB+player_OFF+player_FT+player_PP+))/TO_NUMBER(replace(player_Minu, ':', '')) AS ����)*100 ���� "
				+ " FROM point_exam6"
				+ " where player_id = ( SELECT player_ID from ( SELECT player_id, (player_PTS-player_TO+player_OFF+player_AST)+0.3*(player_BLK+player_DEF+player_P3+player_FT+player_REB+player_STL+player_PF)/TO_NUMBER(replace(player_Minu, ':', '')) ���� FROM _______order by ���� desc) where ROWNUM =< 2)"
				+ " AND where ROWNUM =< 2; ";
		pstmt = con.prepareStatement(name3);
		rs = pstmt.executeQuery();
		return rs;
	}
}
