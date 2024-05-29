package uni;

import uni.comment.servise.CommentService;
import uni.role.service.RoleService;
import uni.theme.service.ThemeService;

public class HomeScreenModel {

	private String message;
	private String role;
	private String comment;
	private String user;
	private String title;
	private String description;

	public void setRole(String role) {
		this.role = role;

	}

	public void setTitle(String title) {
		this.title = title;

	}

	public void setDescription(String description) {
		this.description = description;

	}

	public void setComment(final String user, String comment) {
		this.user = user;
		this.comment = comment;

	}

	public void clickDeleteThemeBtn() {
		message = RoleService.userRole(role);

	}

	public void addNewThemeButton() {
		message = ThemeService.addTheme(role, title, description);
	}

	public void clickAddCommentBtn() {
		message = CommentService.postComment(user, comment);
	}

	public String getMessage() {

		return message;
	}

}
