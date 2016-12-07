package basketball.stats;

public class pmatchDTO {
/*
G: 게임수	Min.: 경기시간(분:초)	2P/2PA: 필드골 성공/시도	3P/3PA: 3점슛 성공/시도
FG%: 야투성공률	FT/FTA : 자유투 성공/시도	%: 성공률	Off: 공격 리바운드
Def: 수비 리바운드	RPG: 경기당 리바운드	Ast: 어시스트	APG: 경기당 어시스트
w/FT: 파울(자유투 유)	w/oFT: 파울(자유투 무)	Stl: 스틸	BS: 블록슛
GD: 굿디펜스	TO: 턴오버	DK/DkA: 덩크슛 성공/시도	PTS: 득점
PPG: 경기당 평균득점
*/
	
	
	private int id;
	private String matchdate;
	private String vsteam;
	private String MIN;
	private String PTS;
	private String TP;
	private String FT;
	private String OFF;
	private String DEF;
	private String REF;
	private String AST;
	private String STL;
	private String BLK;
	private String TOV;
	private String PF;
	
	public pmatchDTO() {
	}
	
	

	public pmatchDTO(int id, String matchdate, String vsteam, String mIN, String pTS, String tP, String fT,
			String oFF, String dEF, String rEF, String aST, String sTL, String bLK, String tOV, String pF) {
		super();
		this.id = id;
		this.matchdate = matchdate;
		this.vsteam = vsteam;
		MIN = mIN;
		PTS = pTS;
		TP = tP;
		FT = fT;
		OFF = oFF;
		DEF = dEF;
		REF = rEF;
		AST = aST;
		STL = sTL;
		BLK = bLK;
		TOV = tOV;
		PF = pF;
	}



	public int getId() {
		return id;
	}

	public void setIdx(int id) {
		this.id = id;
	}

	public String getMatchdate() {
		return matchdate;
	}

	public void setMatchdate(String matchdate) {
		this.matchdate = matchdate;
	}

	public String getVsteam() {
		return vsteam;
	}

	public void setVsteam(String vsteam) {
		this.vsteam = vsteam;
	}

	public String getMIN() {
		return MIN;
	}

	public void setMIN(String mIN) {
		MIN = mIN;
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

	public String getREF() {
		return REF;
	}

	public void setREF(String rEF) {
		REF = rEF;
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
	
	
	public void print_pmatchDTO(){
		for(int i=0;i<15;i++){
			System.out.print(id + "\t" +
			matchdate + "\t" +
			vsteam + "\t" +
			MIN + "\t" +
			PTS + "\t" +
			TP + "\t" +
			FT + "\t" +
			OFF + "\t" +
			DEF + "\t" +
			REF + "\t" +
			AST + "\t" +
			STL + "\t" +
			BLK + "\t" +
			TOV + "\t" +
			PF);
		}
		System.out.println("");
	}
	
	
}
