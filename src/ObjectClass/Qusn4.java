package ObjectClass;

import java.util.Scanner;

public class Qusn4 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        String userName=sc.nextLine();
        String country=sc.nextLine();
        String postId=sc.nextLine();
        String contentType=sc.nextLine();
        int likes=sc.nextInt();
        if(likes<0)
        {
            System.out.println("Error: Engagement values must be non-negative");
            System.exit(0);
        }
        int comments=sc.nextInt();
        int shares=sc.nextInt();
        EngagementPost post=new EngagementPost(userName,country,postId,contentType,likes,comments,shares);
        System.out.println(post);
	}

}
class UserProfile
{
    public String userName;
    public String country;
    public UserProfile(String userName,String country)
    {
        this.userName=userName;
        this.country=country;
    }
    public String toString()
    {
          return "User[username=" + userName + ", country=" + country + "]";
    }
}
class Post extends UserProfile
{
   public String postId;
   public String contentType;
   public Post (String userName,String country,String postId,String contentType)
   {
    super(userName,country);
    this.postId=postId;
    this.contentType=contentType;
   }
   public String toString()
   {
     return super.toString()
                + ", Post[id=" + postId + ", type=" + contentType + "]";
   } 
}
class EngagementPost extends Post
{
    public int likes;
    public int comments;
    public int shares;
    public EngagementPost(String userName,String country,String postId,String contentType ,int likes,int comments,int shares)
    {
        super(userName,country,postId,contentType);
        this.likes=likes;
        this.comments=comments;
        this.shares=shares;
    }
    public String toString()
    {
        return super.toString()
                + ", Engagement[likes=" + likes
                + ", comments=" + comments
                + ", shares=" + shares + "]";
    }
}
