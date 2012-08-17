package beans;

public class InsertCommentBean implements java.io.Serializable {

    private String comment = null;
    private String username = null;

    public InsertCommentBean() {}


    public String getComment()
    {
        return comment;
    }
    public String getUserName()
    {
        return username;
    }



    public void setComment(String s)
    {
        comment = s;
    }
    public void setUserName(String userName)
    {
        this.username = userName;
    }
}