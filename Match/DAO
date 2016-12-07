package dbInfoDAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbInfoDBConn.DbInfoDBConn;
import dbInfoVO.DbInfoVO;

public class DbInfoDAO {
	private Connection con;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	public DbInfoDAO() throws ClassNotFoundException, SQLException {
		con=new DbInfoDBConn().getConnection();
	}
	public void pstmtClose() throws SQLException {
		if(pstmt !=null) {pstmt.close();}
	}
	public void getAllInfoClose() throws SQLException {
		if(rs != null){ rs.close(); }
		if(pstmt != null){ pstmt.close(); }
		if(con != null){ con.close(); }
	}
	
	public ArrayList<DbInfoVO> getAllInfo() throws SQLException {
		ArrayList<DbInfoVO> tiarray=new ArrayList<DbInfoVO>();
		String sql="SELECT * FROM DbTable ORDER BY id";
		
		pstmt= con.prepareStatement(sql);
		rs=pstmt.executeQuery();
		while(rs.next()){
			Date d=rs.getDate("d");
			String team=rs.getString("team");
			String result=rs.getString("result");
			int min=rs.getInt("min");
			int pts=rs.getInt("pts");
			int tp=rs.getInt("tp");
			int ft=rs.getInt("ft");
			int off=rs.getInt("off");
			int def=rs.getInt("def");
			int reb=rs.getInt("reb");
			int ast=rs.getInt("ast");
			int stl=rs.getInt("st1");
			int blk=rs.getInt("blk");
			int to=rs.getInt("to");
			int pf=rs.getInt("pf");
			
			DbInfoVO dv=new DbInfoVO(d,team,result,min,pts,tp,ft,off,def,reb,ast,stl,blk,to,pf);
			tiarray.add(dv);
		}
		return tiarray;
	}
	
	public boolean insert_nametel(String sDate,String team,String result,int min,int pts,int tp,int ft,int off,int def,int reb,int ast,int stl,int blk,int to,int pf){
		String sql = "insert into TelTable5 values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			pstmt=con.prepareStatement(sql);
			
			int year= Integer.parseInt(sDate.substring(0,4))-1900;
			int month= Integer.parseInt(sDate.substring(4,6))-1;
			int day= Integer.parseInt(sDate.substring(6,8));			
			Date d = new Date(year,month,day);
			pstmt.setDate(1, d);
			
			pstmt.setString(2, team);
			pstmt.setString(3, result);
			pstmt.setInt(4, min);
			pstmt.setInt(5, pts);
			pstmt.setInt(6, tp);
			pstmt.setInt(7, ft);
			pstmt.setInt(8, off);
			pstmt.setInt(9, def);
			pstmt.setInt(10, reb);
			pstmt.setInt(11, ast);
			pstmt.setInt(12, stl);
			pstmt.setInt(13, blk);
			pstmt.setInt(14, to);
			pstmt.setInt(15, pf);
			
			pstmt.executeUpdate();
		}catch(SQLException e){
			System.out.println("insert Exception");
		return false;
		}
		return true;
	}

//¼öÁ¤¸Þ¼Òµå

	public boolean update_nametel(String name, String name2){
		 String sql
		 = "update DbTable set name=? where name=?";
				try{
					pstmt=con.prepareStatement(sql);
					pstmt.setString(1, name2);
					pstmt.setString(2, name);
					pstmt.executeUpdate();///////////////
				}catch(SQLException e){
				System.out.println("update Exception");
					return false;
				}
				return true;
			}
			
			//»èÁ¦¸Þ¼Òµå
			public boolean delete_nametel(int id){
				String sql 
				= "delete from DbTable where id=?";
				try{
					pstmt=con.prepareStatement(sql);
					pstmt.setInt(1, id);
					pstmt.executeUpdate();//////////
				}catch(SQLException e){
				System.out.println("delete Exception");
					return false;
				}
				return true;
			}
		}
