package uni.models;
import java.util.*;


public class Theme {
	
    private String title;
    private String content;
    private User themeOwner;
    private Set<Theme> subTheme;
    private Theme mainTheme;
    private Set<Comment> comments;
    
    public Theme() {
    }


    public User getThemeOwner() {
        return themeOwner;
    }

    public void setThemeOwner(User themeOwner) {
        this.themeOwner = themeOwner;
        
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
       
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content; 
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void setComments(Set<Comment> comments) {
      this.comments = comments;

    }

    public Set<Theme> getSubTheme() {
        return subTheme;
    }

    public void setSubTheme(Set<Theme> subTheme) {
        this.subTheme = subTheme;
      
    }

}