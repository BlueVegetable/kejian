package prj09;
//�ӿ�
interface Forum 
{
    //��������
	public void writeArticle();
    //��������
	public void writeComment();
}
//�����࣬������Ȩ��
class ForumProxy implements Forum 
{
    //�˴��ӿڿɴ���ʵ�ʹ�������
	private Forum forum;
	public ForumProxy(Forum forum) 
{
		this.forum = forum;
	}
	public void writeArticle() 
{
		// ����û�Ȩ��
        if(���û�ӵ�з�������Ȩ��)
{
    		forum.writeArticle();
        }
	}
	public void writeComment() 
{// ������
		// ����û�Ȩ��
        if(���û�ӵ�з�������Ȩ��)
{
    		forum.writeComment();
        }
	}
}
//ʵ�ʹ�����
class ForumOpe implements Forum 
{
	public void writeArticle() 
{
		// ���������ӵĹ���
	}
	public void writeComment() 
{
	     // ���������۵Ĺ���
	}
}
public class P09_01 
{
	public static void main(String[] args) 
{
		Forum forum = new ForumProxy(new ForumOpe());
		//�͵��ô�����
		forum.writeArticle();
	}
}
