package uni.register.servise;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uni.models.User;

public class RegisterService {
	
	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);

	private static List<User> usersDb = new ArrayList<>();
	
	public static String register(final String username, final String password, final String pass,final String email) {
		
		    if (null == password || null == username) {
			    return "Enter username and password!";
		    }
		   
			if (null == password || password.isBlank()) {
				return "Enter password!";
			}
			
			if (null == pass || pass.isBlank()) {
				return "Enter second password!";
			}

			if (!password.equals(pass)) {
				return "Enter one password!";
			}

			if (username == null || username.isBlank()) {
				return "Enter username!";
			}
			
			if (!validate(email)) {
				return "Enter valid email!";
			}

			if (username.length() < 3) {
				return "Username must be at least 3 simbols!";
			}
			
		
		
			final User newUser = new User(username, password, email);
			usersDb.add(newUser);
			return "Successful registration!";


	}
	

	private static boolean validate(String emailStr) {
		final Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}
}
