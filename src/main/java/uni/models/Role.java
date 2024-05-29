package uni.models;
import java.util.*;


public class Role {

    private String role;
    private Set<User> users;


    public Role() {
    }


    public String getRole() {        
        return role;
    }


    public void setRole(String role) {
        this.role = role;
       
    }

    public Set<User > getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
       this.users = users;
        
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Role other = (Role) obj;
		if (role == null) {
			if (other.role != null) {
				return false;
			}
		} else if (!role.equals(other.role)) {
			return false;
		}
		return true;
	}

}