package uni.comment.servise;

public class CommentService {
	public static String postComment(final String user, final String comment) {

		if (comment.isBlank()) {
			return "Empty comment!";
		}
		if (user.isBlank()) {
			return "Pleas login!";
		}

		if (!user.isBlank() && !comment.isBlank()) {
			return "Success!";
		}

		return null;

	}

}
