package basketball.stats;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import basketball.stats.pmatchDTO;

public class mainClass {
	static Connection con;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static int TABLE_COL_SIZE = 15;
	static String TABLE_NAME = "pmatch";
	
	public static void main(String[] args) throws SQLException {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "multicampus","0000");
		} catch (SQLException e) {
			e.printStackTrace();
		}
			
		// select all
		/*
		ArrayList<pmatchDTO> arr = list();
		for(int i=0;i<arr.size();i++){
			arr.get(i).print_pmatchDTO();
		}
		*/
		// select by id
		/*
		pmatchDTO pmatch = select(1);
		System.out.println(pmatch.getBLK());
		*/
		// select by attributes
		/*
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		arr2.add(3);
		arr2.add(5);
		ArrayList<String> args2 = new ArrayList<String>();
		args2.add("test_vsteam");
		args2.add("test_pts");
		pmatchDTO pmatch_by_attrs = select_mul(arr2, args2);
		pmatch_by_attrs.print_pmatchDTO();
		*/
		/*
		ArrayList<Integer> arr3 = new ArrayList<Integer>();
		arr3.add(1);
		arr3.add(3);
		arr3.add(5);
		ArrayList<String> args3 = new ArrayList<String>();
		args3.add("101");
		args3.add("3");
		args3.add("10");
		insert(arr3,args3);
		*/
		
		// delete by and
		/*
		ArrayList<Integer> arr4 = new ArrayList<Integer>();
		arr4.add(1);
		ArrayList<String> args4 = new ArrayList<String>();
		args4.add("4");
		delete(arr4,args4);
		*/
		// update
		/*
		ArrayList<Integer> arr5 = new ArrayList<Integer>(); // where
		ArrayList<Integer> arr6 = new ArrayList<Integer>(); // set
		arr5.add(1);
		arr6.add(3);
		ArrayList<String> args5 = new ArrayList<String>();
		ArrayList<String> args6 = new ArrayList<String>();
		args5.add("100");
		args6.add("우리팀");
		update(arr5,args5,arr6,args6);	
		*/
	}

	// select all
	public static ArrayList<pmatchDTO> list() {
		ArrayList<pmatchDTO> tiarray = new ArrayList<pmatchDTO>();
		String sql = "SELECT * FROM pmatch ORDER BY id";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				int id = rs.getInt("id");
				String matchdate = rs.getString("matchdate");
				String vsteam = rs.getString("vsteam");
				String mIN = rs.getString("min");
				String pTS = rs.getString("pts");
				String tP = rs.getString("tp");
				String fT = rs.getString("ft");
				String oFF = rs.getString("off");
				String dEF = rs.getString("def");
				String rEF = rs.getString("ref");
				String aST = rs.getString("ast");
				String sTL = rs.getString("stl");
				String bLK = rs.getString("blk");
				String tOV = rs.getString("tov");
				String pF = rs.getString("pf");
				
				pmatchDTO tv = new pmatchDTO(id, matchdate, vsteam,
						mIN, pTS, tP, fT, oFF, dEF, rEF, aST, sTL,
						bLK, tOV, pF);
				tiarray.add(tv); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return tiarray;
	}
	
	// select by id
	public static pmatchDTO select(int idx) throws SQLException{
		String sql = "select * from pmatch where id = '"+idx+"'";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		pmatchDTO vo = null;
		while(rs.next()){
			int id = rs.getInt("id");
			String matchdate = rs.getString("matchdate");
			String vsteam = rs.getString("vsteam");
			String mIN = rs.getString("min");
			String pTS = rs.getString("pts");
			String tP = rs.getString("tp");
			String fT = rs.getString("ft");
			String oFF = rs.getString("off");
			String dEF = rs.getString("def");
			String rEF = rs.getString("ref");
			String aST = rs.getString("ast");
			String sTL = rs.getString("stl");
			String bLK = rs.getString("blk");
			String tOV = rs.getString("tov");
			String pF = rs.getString("pf");
			
			vo = new pmatchDTO(id, matchdate, vsteam,
					mIN, pTS, tP, fT, oFF, dEF, rEF, aST, sTL,
					bLK, tOV, pF);
		}
		if(vo.equals(null)){
			return new pmatchDTO();
		}else{
			return vo;
		}
	}
	
	// select with multiple attributes
	public static pmatchDTO select_mul(ArrayList<Integer> colnum, ArrayList<String> args) throws SQLException{
		System.out.println("select_mul() : ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map = colmapper();
		
		String sql = "select * from pmatch where ";
		
		for(int i=0;i<colnum.size();i++){
			sql+=map.get(colnum.get(i))+" = '"+args.get(i)+"'";
			if(i != colnum.size()-1){
				sql+=" or ";
			}
		}
		/*
		for(int i=0;i<colnum.size();i++){
			System.out.println(colnum.get(i));
			System.out.println(args.get(i));
		}
		*/
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		pmatchDTO vo = null;
		
		System.out.println(sql);
		
		rs.next();
		if(rs.next()){

			int id = rs.getInt("id");
			String matchdate = rs.getString("matchdate");
			String vsteam = rs.getString("vsteam");
			String mIN = rs.getString("min");
			String pTS = rs.getString("pts");
			String tP = rs.getString("tp");
			String fT = rs.getString("ft");
			String oFF = rs.getString("off");
			String dEF = rs.getString("def");
			String rEF = rs.getString("ref");
			String aST = rs.getString("ast");
			String sTL = rs.getString("stl");
			String bLK = rs.getString("blk");
			String tOV = rs.getString("tov");
			String pF = rs.getString("pf");
			
			vo = new pmatchDTO(id, matchdate, vsteam,
					mIN, pTS, tP, fT, oFF, dEF, rEF, aST, sTL,
					bLK, tOV, pF);
		}
		if(vo == null ){
			return new pmatchDTO();
		}else{
			return vo;
		}
	}
	
	// Insert
	public static void insert(ArrayList<Integer> colnum, ArrayList<String> args) throws SQLException{
		System.out.println("Insert() : ");
		String sql = "insert into pmatch "
				+ "(id, matchdate, vsteam, min, pts, tp, ft, off, def, ref, ast, stl, blk, tov, pf) "
				+ "values (";
		int j=0;
		for(int i=0 ;i<TABLE_COL_SIZE;i++){
			if(colnum.contains(i+1)){
				sql += args.get(j);
				j+=1;
			}else{
				sql +="0";
			}
			if(i != TABLE_COL_SIZE-1){
				sql +=" , ";
			}
			
		}
		sql += "" +")";
		
		System.out.println(sql);
		/*
		for(int i=0;i<colnum.size();i++){
			System.out.println(colnum.get(i));
			System.out.println(args.get(i));
		}
		*/
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
	}
	
	// Delete
	public static void delete(ArrayList<Integer> colnum, ArrayList<String> args) throws SQLException{
		System.out.println("delete() : ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map = colmapper();
		
		String sql = "delete from pmatch where ";
		
		for(int i=0;i<colnum.size();i++){
			sql+=map.get(colnum.get(i))+" = '"+args.get(i)+"'";
			if(i != colnum.size()-1){
				sql+=" and ";
			}
		}
		System.out.println(sql);
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		pmatchDTO vo = null;
	}
	
	// Update
	public static void update(ArrayList<Integer> colnum_w, 
			ArrayList<String> args_w,
			ArrayList<Integer> colnum_s, 
			ArrayList<String> args_s) throws SQLException{
		System.out.println("update() : ");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map = colmapper();
		
		String sql = "update pmatch ";
		
		// set 
		sql += "set ";
		for(int i=0;i<colnum_s.size();i++){
			sql+=map.get(colnum_s.get(i))+" = '"+args_s.get(i)+"'";
			if(i != colnum_s.size()-1){
				sql+=" , ";
			}
		}
		
		sql += " where ";
		// where
		for(int i=0;i<colnum_w.size();i++){
			sql+=map.get(colnum_w.get(i))+" = '"+args_w.get(i)+"'";
			if(i != colnum_w.size()-1){
				sql+=" and ";
			}
		}
		
		for(int i=0;i<colnum_s.size();i++){
			System.out.println(colnum_s.get(i));
			System.out.println(args_s.get(i));
		}
		
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		pmatchDTO vo = null;
		
		System.out.println(sql);
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
	}
	
	// column number return
		public static int colreverse(String colname){
			HashMap<String, Integer> invmap = new HashMap<String, Integer>();
			invmap.put("id", 1);
			invmap.put("matchdate", 2);
			invmap.put("vsteam", 3);
			invmap.put("mIN", 4);
			invmap.put("pTS", 5);
			invmap.put("tP", 6);
			invmap.put("fF", 7);
			invmap.put("oFF", 8);
			invmap.put("dEF", 9);
			invmap.put("rEF", 10);
			invmap.put("aST", 11);
			invmap.put("sTL", 12);
			invmap.put("bLK", 13);
			invmap.put("tOV", 14);
			invmap.put("pF", 15);
			return invmap.get(colname);
		}
	
	// Hash Mapper
		public static HashMap<Integer, String> colmapper(){
			HashMap<Integer, String> map = new HashMap<Integer, String>();
			map.put(1, "id");
			map.put(2, "matchdate");
			map.put(3, "vsteam");
			map.put(4, "mIN");
			map.put(5, "pTS");
			map.put(6, "tP");
			map.put(7, "fF");
			map.put(8, "oFF");
			map.put(9, "dEF");
			map.put(10, "rEF");
			map.put(11, "aST");
			map.put(12, "sTL");
			map.put(13, "bLK");
			map.put(14, "tOV");
			map.put(15, "pF");
			return map;
		}
}
