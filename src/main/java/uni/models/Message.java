package uni.models;
import java.util.*;

public class Message {
	
    private String content;
    private User user;   
    private User friend;

    public Message() {
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
       this.content = content;
        
    }


    public User getUser() {        
        return user;
    }

    public void setUser(User user) {
        this.user = user;
        
    }

    public User getUserFriends() {
        return friend;
    }


    public void setUserFriends(User friend) {
        this.friend = friend;
    }

}