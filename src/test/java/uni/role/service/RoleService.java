package uni.role.service;

public class RoleService {
	
	public static String userRole(final String role) {

		if (role.equals("admin")) {
			return "Successful delete!";
		} else {
			return "Unsuccessful delete! You have no rights for this action!";
		}

	}

}
