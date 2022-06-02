package BaseBall;

public class DTO {

	private String id, pw, name;
	private int teamId;
	
	public DTO(int teamId) {
		this.teamId = teamId;		
	}
	public DTO(String name) {
		this.name = name;		
	}
	
	public DTO(String name, int teamId) {
		this.name = name;
		this.teamId = teamId;
	}
	
	public DTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public DTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public DTO(String id, String pw, String name, int teamId) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.teamId = teamId;
	}

	public String getId() {
		return id;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public int getTeamId() {
		return teamId;
	}	

	public void setId(String id) {
		this.id = id;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTeamName(int teamId) {
		this.teamId = teamId;
	}	
}