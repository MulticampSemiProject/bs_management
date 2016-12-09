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
		// 접속객체 get ->con
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

	// 센터 출력
	public ResultSet listCenterPlayer() throws SQLException {
		// 센터 계산
		String name1 =
					"	SELECT ID, ((PTS - TOV + OFF + AST) + 0.5 * (BLK + DEF + FT + REB + STL)) / TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1))) 평점"
					+ "	FROM EXAM9"
					+ "	WHERE ID = ("
					+ "		SELECT ID"
					+ "		FROM ("
					+ "			SELECT ID, ((PTS - TOV + OFF + AST) + 0.5 * (BLK + DEF + FT + REB + STL) )/ TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1)))"
					+ "			FROM EXAM9"
					+ "			WHERE PBNUM = 'c'"
					+ "			ORDER BY 2 DESC"
					+ "		)"
					+ "		WHERE ROWNUM = 1"
					+ "	)";
		
		pstmt = con.prepareStatement(name1);
		rs = pstmt.executeQuery();
		return rs;
	}
	//공격 FD
	
	public ResultSet listOffFD() throws SQLException {
		
		String name2 =
					"	SELECT ID, ((PTS - TOV + OFF + AST) + 0.5 * (BLK + DEF + FT + REB + STL)) / TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1))) 평점"
					+ "	FROM EXAM9"
					+ "	WHERE ID = ("
					+ "		SELECT ID"
					+ "		FROM ("
					+ "			SELECT ID, ((PTS - TOV + OFF + AST) + 0.5 * (BLK + DEF + FT + REB + STL) )/ TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1)))"
					+ "			FROM EXAM9"
					+ "			WHERE PBNUM = 'fd'"
					+ "			ORDER BY 2 DESC"
					+ "		)"
					+ "		WHERE ROWNUM = 1"
					+ "	)";
		
		pstmt = con.prepareStatement(name2);
		rs = pstmt.executeQuery();
		return rs;
	}
	
	//DEF FD
	public ResultSet listDefFD() throws SQLException {
		// 센터 계산
		String name3 =
					"	SELECT ID, ((PTS - TOV + AST+ DEF) + 0.5 * (BLK+ OFF + FT + REB + STL)) / TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1))) 평점"
					+ "	FROM EXAM9"
					+ "	WHERE ID = ("
					+ "		SELECT ID"
					+ "		FROM ("
					+ "			SELECT ID, ((PTS - TOV + AST+ DEF) + 0.5 * (BLK+ OFF + FT + REB + STL) )/ TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1)))"
					+ "			FROM EXAM9"
					+ "			WHERE PBNUM = 'fd'"
					+ "			ORDER BY 2 DESC"
					+ "		)"
					+ "		WHERE ROWNUM = 1"
					+ "	)";
		pstmt = con.prepareStatement(name3);
		rs = pstmt.executeQuery();
		return rs;
	}
	
	//OFF GD
	public ResultSet listOffGD() throws SQLException {
		// 센터 계산
		String name4 =
					"	SELECT ID, ((PTS - TOV + OFF + AST) + 0.5 * (BLK + DEF + FT + REB + STL)) / TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1))) 평점"
					+ "	FROM EXAM9"
					+ "	WHERE ID = ("
					+ "		SELECT ID"
					+ "		FROM ("
					+ "			SELECT ID, ((PTS - TOV + OFF + AST) + 0.5 * (BLK + DEF + FT + REB + STL) )/ TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1)))"
					+ "			FROM EXAM9"
					+ "			WHERE PBNUM = 'gd'"
					+ "			ORDER BY 2 DESC"
					+ "		)"
					+ "		WHERE ROWNUM = 1"
					+ "	)";
		
		pstmt = con.prepareStatement(name4);
		rs = pstmt.executeQuery();
		return rs;
	}
	
	//DEF GD
	public ResultSet listDefGD() throws SQLException {
		// 센터 계산
		String name5 =
					"	SELECT ID, ((PTS - TOV + AST+ DEF) + 0.5 * (BLK + DEF + FT + REB + STL)) / TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1))) 평점"
					+ "	FROM EXAM9"
					+ "	WHERE ID = ("
					+ "		SELECT ID"
					+ "		FROM ("
					+ "			SELECT ID, ((PTS - TOV + AST+ DEF) + 0.5 * (BLK+ OFF + FT + REB + STL) )/ TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1)))"
					+ "			FROM EXAM9"
					+ "			WHERE PBNUM = 'gd'"
					+ "			ORDER BY 2 DESC"
					+ "		)"
					+ "		WHERE ROWNUM = 1"
					+ "	)";
		
		pstmt = con.prepareStatement(name5);
		rs = pstmt.executeQuery();
		return rs;
	
	
	
	
	// 공격형 출력
	/*public ResultSet listOffencePlayer() throws SQLException {
		// 공격형 포워드 &가드2명
		String name2 =
				" SELECT ID, ((PTS-TOV+OFF+AST)+0.5*(FT+DEF+REB+STL+BLK))/TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1))) 평점 "
				+ " FROM EXAM9"

				+ " WHERE ID = ("
				+ " 	SELECT ID"
				+ "		FROM ("
				+ "			SELECT ID, ((PTS-TOV+OFF+AST)+0.5*(FT+DEF+REB+STL+BLK))/ TO_NUMBER(substr(MINS,1,(instr(MINS,'''')-1)))"
				+ "			FROM EXAM9"
				+ "			where lower(PBNUM) = 'fd'"
				+ "			ORDER BY 2 DESC"
				+ "		)"
				+ "		WHERE ROWNUM = 1 "
				+ " )"; 
				
		pstmt = con.prepareStatement(name2);
		rs = pstmt.executeQuery();
		return rs;
	*/	
	}
	
	/*// 수비형 출력
	public ResultSet listDefencePlayer() throws SQLException {
		// 수비형 포워드 &가드2명
		String name3 = " SELECT ID, ((PTS+DEF+STL)+0.5*(TOV+BLK+AST+REB+OFF+FT))/TO_NUMBER(replace(MINS, ':', '')) AS 평점) 평점 "
				+ " FROM EXAM6"
				+ " where ID = ( SELECT ID from ( SELECT ID, (PTS-TOV+OFF+AST)+0.5*(BLK+DEF+FT+REB+STL)/TO_NUMBER(replace(MINS, ':', '')) 평점 FROM _______order by 평점 desc) where ROWNUM =< 2)"
				+ " AND where ROWNUM =< 2; ";
		pstmt = con.prepareStatement(name3);
		rs = pstmt.executeQuery();
		return rs;*/
	}

