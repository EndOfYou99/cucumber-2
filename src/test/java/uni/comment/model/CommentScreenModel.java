package uni.comment.model;
import uni.comment.servise.CommentService;

public class CommentScreenModel {

	private String comment;
	private String message;
	private String user;

	public void setComment(final String user, String comment) {
		this.user = user;
		this.comment = comment;

	}

	public void clickAddCommentBtn() {
		message = CommentService.postComment(user, comment);
	}

	public String getMessage() {

		return message;
	}
}
