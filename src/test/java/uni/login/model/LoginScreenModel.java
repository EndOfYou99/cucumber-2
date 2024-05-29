package uni.login.model;


import uni.login.service.LoginService;

public class LoginScreenModel {

	private String username;
	private String password;
	private String message;
	//private String role;
	public void setUsername(final String username) {
		this.username = username;
		
	}
	public void setPassword(final String password) {
		this.password = password;
		
	}
	
	public void clickLoginButton() {
		message = LoginService.login(username, password);
		
	}
	public void checkMessage() {
		
	}
	public String getMessage() {
		return message;
	}
	
}
