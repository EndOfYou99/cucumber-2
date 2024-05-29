package uni.login.service;

import java.util.Collections;
import java.util.List;
import uni.models.User;

public class LoginService {

	private static List<User> usersDb = Collections.singletonList(new User("Emmy","1234567810emmy","emi@abv.bg"));
	public static String login(final String username, final String password) {

		if (null == password || null == username) {
			return "Enter username and password!";
		}

		final boolean isUserExists = usersDb.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));


		return isUserExists ? "Successful entrence" : "Wrong data!";

}
}
