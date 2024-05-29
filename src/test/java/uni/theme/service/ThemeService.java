package uni.theme.service;

public class ThemeService {
	public static String addTheme(String role, String title, String description) {

		if (title.isBlank()) {
			return "Enter missing title!";
		}
		if (description.isBlank() ) {
			return "Enter missing description!";
		}
		if (role.equals("admin")) {
			return "Success!";
		}
		if (role.equals("user")) {
			return "Please wait for verification!";
		} else {
			return "Please login!";
		}

	}

}
