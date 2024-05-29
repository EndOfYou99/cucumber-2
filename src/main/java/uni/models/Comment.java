package uni.models;
import java.util.*;


public class Comment {

	    private String content;
	    private Theme theme;
	    private Set<Comment> subComment;
	    private Comment mainCom;
	    
    public Comment() {
    }

 
    public Comment getComment() {
        return mainCom;
    }

    public void setComment(Comment mainCom) {
        this.mainCom = mainCom;
    
    }

    public Set<Comment> getSubComment() {
        return subComment;
    }

    public void setSubComment(Set<Comment> subComment) {
        this.subComment = subComment;
       
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
       
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
        
    }

}