package point_cal;

public class cal_VO {
	private String ID;//
	private String MATCHDATE;
	private String VSTEAM;
	private String MATCHRESULT;
	private String MINS;
	private String PTS;
	private String TP; //
	private String FT;
	private String OFF;
	private String DEF;
	private String REB;
	private String AST;
	private String STL;
	private String BLK;
	private String TOV;
	private String PF;//
	private String PBNUM;//
	private String PRTEAM;//
	
	

	public cal_VO(String ID, String MATCHDATE, String VSTEAM, String MATCHRESULET,
			String MINS, String PTS, String TP, String FT, String OFF,String DEF,
			String REB,	String AST, String STL, String BLK, String TOV, String PF,
			String PBNUM, String PRTEAM) {
		super();
		this.ID = ID;
		this.MATCHDATE = MATCHDATE;
		this.VSTEAM = VSTEAM;
		this.MATCHRESULT = MATCHRESULT;
		this.MINS = MATCHRESULT;
		this.PTS = PTS;
		this.TP = TP; //
		this.FT = FT;
		this.OFF = OFF;
		this.DEF = DEF;
		this.REB = REB;
		this.AST = AST;
		this.STL = STL;
		this.BLK = BLK;
		this.TOV = TOV;
		this.PF = PF;//
		this.PBNUM = PBNUM;//
		this.PRTEAM = PRTEAM;//
		}



	public String getID() {
		return ID;
	}



	public void setID(String iD) {
		ID = iD;
	}



	public String getMATCHDATE() {
		return MATCHDATE;
	}



	public void setMATCHDATE(String mATCHDATE) {
		MATCHDATE = mATCHDATE;
	}



	public String getVSTEAM() {
		return VSTEAM;
	}



	public void setVSTEAM(String vSTEAM) {
		VSTEAM = vSTEAM;
	}



	public String getMATCHRESULT() {
		return MATCHRESULT;
	}



	public void setMATCHRESULT(String mATCHRESULT) {
		MATCHRESULT = mATCHRESULT;
	}



	public String getMINS() {
		return MINS;
	}



	public void setMINS(String mINS) {
		MINS = mINS;
	}



	public String getPTS() {
		return PTS;
	}



	public void setPTS(String pTS) {
		PTS = pTS;
	}



	public String getTP() {
		return TP;
	}



	public void setTP(String tP) {
		TP = tP;
	}



	public String getFT() {
		return FT;
	}



	public void setFT(String fT) {
		FT = fT;
	}



	public String getOFF() {
		return OFF;
	}



	public void setOFF(String oFF) {
		OFF = oFF;
	}



	public String getDEF() {
		return DEF;
	}



	public void setDEF(String dEF) {
		DEF = dEF;
	}



	public String getREB() {
		return REB;
	}



	public void setREB(String rEB) {
		REB = rEB;
	}



	public String getAST() {
		return AST;
	}



	public void setAST(String aST) {
		AST = aST;
	}



	public String getSTL() {
		return STL;
	}



	public void setSTL(String sTL) {
		STL = sTL;
	}



	public String getBLK() {
		return BLK;
	}



	public void setBLK(String bLK) {
		BLK = bLK;
	}



	public String getTOV() {
		return TOV;
	}



	public void setTOV(String tOV) {
		TOV = tOV;
	}



	public String getPF() {
		return PF;
	}



	public void setPF(String pF) {
		PF = pF;
	}



	public String getPBNUM() {
		return PBNUM;
	}



	public void setPBNUM(String pBNUM) {
		PBNUM = pBNUM;
	}



	public String getPRTEAM() {
		return PRTEAM;
	}



	public void setPRTEAM(String pRTEAM) {
		PRTEAM = pRTEAM;
	}

}
