package dbInfoVO;

import java.sql.Date;

public class DbInfoVO {
	
		private Date d;
		private String team;
		private String result;
		private int min;
		private int pts;
		private int tp;
		private int ft;
		private int off;
		private int def;
		private int reb;
		private int ast;
		private int stl;
		private int blk;
		private int to;
		private int pf;
		
		
		public DbInfoVO(Date d, String team, String result, int min, int pts, int tp, int ft, int off, int def, int reb,
				int ast, int stl, int blk, int to, int pf) {
			super();
			this.d = d;
			this.team = team;
			this.result = result;
			this.min = min;
			this.pts = pts;
			this.tp = tp;
			this.ft = ft;
			this.off = off;
			this.def = def;
			this.reb = reb;
			this.ast = ast;
			this.stl = stl;
			this.blk = blk;
			this.to = to;
			this.pf = pf;
		}


		public Date getD() {
			return d;
		}


		public void setD(Date d) {
			this.d = d;
		}


		public String getTeam() {
			return team;
		}


		public void setTeam(String team) {
			this.team = team;
		}


		public String getResult() {
			return result;
		}


		public void setResult(String result) {
			this.result = result;
		}


		public int getMin() {
			return min;
		}


		public void setMin(int min) {
			this.min = min;
		}


		public int getPts() {
			return pts;
		}


		public void setPts(int pts) {
			this.pts = pts;
		}


		public int getTp() {
			return tp;
		}


		public void setTp(int tp) {
			this.tp = tp;
		}


		public int getFt() {
			return ft;
		}


		public void setFt(int ft) {
			this.ft = ft;
		}


		public int getOff() {
			return off;
		}


		public void setOff(int off) {
			this.off = off;
		}


		public int getDef() {
			return def;
		}


		public void setDef(int def) {
			this.def = def;
		}


		public int getReb() {
			return reb;
		}


		public void setReb(int reb) {
			this.reb = reb;
		}


		public int getAst() {
			return ast;
		}


		public void setAst(int ast) {
			this.ast = ast;
		}


		public int getStl() {
			return stl;
		}


		public void setStl(int stl) {
			this.stl = stl;
		}


		public int getBlk() {
			return blk;
		}


		public void setBlk(int blk) {
			this.blk = blk;
		}


		public int getTo() {
			return to;
		}


		public void setTo(int to) {
			this.to = to;
		}


		public int getPf() {
			return pf;
		}


		public void setPf(int pf) {
			this.pf = pf;
		}

	}


