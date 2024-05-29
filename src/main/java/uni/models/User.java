package uni.models;
import java.util.*;


public class User {

    private String username;
    private String password;
    private String email;
    private String roles;
    private Set<Theme> themes;
    private Set<User> userFriends;
    private Set<User> users;
    private Set<User> userMessages;
    private Set<Message> friendsMessages;
    


    public User(final String username, final String pass, final String role) {
		this.username = username;
		this.password = pass;
		this.roles = role;
	}
   
    public User(final String username, final String password) {
		this(username, password, null);
	}
    
    public User() {
		this(null,null, null);
	}
    
	public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;     
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passowrd) {
        this.password = passowrd;
        
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
       
    }

    public String getRoles() {
        return roles;
    }


    public void setRole(String roles) {
       this.roles = roles;

    }

    public Set<Theme> getThemes() {
        return themes;
    }

    public void setThemes(Set<Theme> themes) {
        this.themes = themes;
      
    }

    public Set<User> getUserMesseges() {
                return userMessages;
    }

    public void setUserMesseges(Set<User> userMessages) {
        this.userMessages = userMessages;
    }

    public Set<User> getUserFriends() {
        return userFriends;
    }

    public void setUserFriends(Set<User> userFriends) {
    this.userFriends = userFriends;
       
    }

    public Set<Message> getFriendsMessages() {
        return friendsMessages;
    }

    public void setFriendsMessages(Set<Message> friendsMessages) {
       this.friendsMessages = friendsMessages;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
     this.users = users;
    }

}