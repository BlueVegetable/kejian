package prj09;
//接口
interface Forum 
{
    //发表帖子
	public void writeArticle();
    //发表评论
	public void writeComment();
}
//代理类，负责检查权限
class ForumProxy implements Forum 
{
    //此处接口可传入实际工作对象
	private Forum forum;
	public ForumProxy(Forum forum) 
{
		this.forum = forum;
	}
	public void writeArticle() 
{
		// 检查用户权限
        if(该用户拥有发表帖子权限)
{
    		forum.writeArticle();
        }
	}
	public void writeComment() 
{// 发评论
		// 检查用户权限
        if(该用户拥有发表评论权限)
{
    		forum.writeComment();
        }
	}
}
//实际工作类
class ForumOpe implements Forum 
{
	public void writeArticle() 
{
		// 做发表帖子的工作
	}
	public void writeComment() 
{
	     // 做发表评论的工作
	}
}
public class P09_01 
{
	public static void main(String[] args) 
{
		Forum forum = new ForumProxy(new ForumOpe());
		//和调用代理类
		forum.writeArticle();
	}
}
