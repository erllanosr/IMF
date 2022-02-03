
public class User {
	private int id;
	private String email;
	private String password;
	private String lastLogin;

	public User(int id, String email, String password, String lastLogin) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.lastLogin = lastLogin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(String lastLogin) {
		this.lastLogin = lastLogin;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", lastLogin=" + lastLogin + "]";
	}

	public void getSession() {

	}

}
