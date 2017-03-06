package member.DTO;

public class MemDto {
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	private String memberId;
	private String password;
	private String name;
	private String email;

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "MemDto [memberId=" + memberId + ", password=" + password + ", name=" + name + ", email=" + email + "]";
	}
	
}
