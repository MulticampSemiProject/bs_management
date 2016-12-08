package point_cal;

public class cal_VO {

	private String player_team;
	private String player_pts;
	private String player_reb;
	private String player_ast;
	private String player_stl;
	private String player_blk;
	private String player_p3;
	private String player_to;
	private String player_p2;
	private String player_p3r;
	private String player_ft;

	public cal_VO(String player_team, String player_pts, String player_reb,
			String player_ast, String player_stl, String player_blk,
			String player_p3, String player_to, String player_p2,
			String player_p3r, String player_ft) {
		super();
		this.player_team = player_team;
		this.player_pts = player_pts;
		this.player_reb = player_reb;
		this.player_ast = player_ast;
		this.player_stl = player_stl;
		this.player_blk = player_blk;
		this.player_p3 = player_p3;
		this.player_to = player_to;
		this.player_p2 = player_p2;
		this.player_p3r = player_p3r;
		this.player_ft = player_ft;
	}

	public String getplayer_team() {
		return player_team;
	}

	public void setplayer_team(String player_team) {
		this.player_team = player_team;
	}

	public String getplayer_pts() {
		return player_pts;
	}

	public void setplayer_pts(String player_pts) {
		this.player_pts = player_pts;
	}

	public String getplayer_reb() {
		return player_reb;
	}

	public void setplayer_reb(String player_reb) {
		this.player_reb = player_reb;
	}

	public String getplayer_ast() {
		return player_ast;
	}

	public void setplayer_ast(String player_ast) {
		this.player_ast = player_ast;
	}

	public String getplayer_stl() {
		return player_stl;
	}

	public void setplayer_stl(String player_stl) {
		this.player_stl = player_stl;
	}

	public String getplayer_blk() {
		return player_blk;
	}

	public void setplayer_blk(String player_blk) {
		this.player_blk = player_blk;
	}

	public String getplayer_p3() {
		return player_p3;
	}

	public void setplayer_p3(String player_P3) {
		this.player_p3 = player_p3;
	}

	public String getplayer_to() {
		return player_to;
	}

	public void setplayer_to(String player_to) {
		this.player_to = player_to;
	}

	public String getplayer_p2() {
		return player_p2;
	}

	public void setplayer_p2(String player_p2) {
		this.player_p2 = player_p2;
	}

	public String getplayer_p3r() {
		return player_p3r;
	}

	public void setplayer_p3r(String player_p3r) {
		this.player_p3r = player_p3r;
	}

	public String getplayer_ft() {
		return player_ft;
	}

	public void setplayer_ft(String player_ft) {
		this.player_ft = player_ft;
	}

}
