package BaseBall;

public class DTO {

	private String id, pw, name, teamName;	
	
	public DTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	public DTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
	
	public DTO(String id, String pw, String name, String teamName) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.teamName = teamName;
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
	public String getTeamName() {
		return teamName;
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
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
}