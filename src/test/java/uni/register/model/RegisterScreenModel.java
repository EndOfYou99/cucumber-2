package uni.register.model;

import uni.register.servise.RegisterService;

public class RegisterScreenModel {

	private String username;
	private String password;
	private String pass;
	private String email;
	//private String role;
	private String message;
	public void setUsername(final String username) {
		this.username = username;
		
	}
	public void setPassword(final String password) {
		this.password = password;
		
	}
	
	public void setPasswordSec(final String pass) {
		this.pass = pass;
		
	}
	public void setEmail(final String email) {
		this.email = email;
		
	}
	/*public void setRole(final String role) {
		this.role = role;
		
	}*/
	public void clickRegisterButton() {
		message = RegisterService.register(username, password, pass, email);
		
	}
	
	public String getMessage() {
		return message;
	}
	


}
