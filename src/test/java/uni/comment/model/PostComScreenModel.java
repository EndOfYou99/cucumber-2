package uni.comment.model;
import uni.role.service.*;

public class PostComScreenModel {
	private String message;
	private String role;

	public String getMessage() {

		return message;
	}

	public void setRole(String role) {
		this.role = role;

	}

	public void clickDeleteThemeBtn() {
		message = RoleService.userRole(role);

	}

}
