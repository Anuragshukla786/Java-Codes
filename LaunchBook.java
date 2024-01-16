class Book
{
    private  int pageNo;

    public void setPageNo( int x)
    {
        if(x>0)
        {
        pageNo=x;
        }
        else
        {
            System.out.println("Why you give Negative value ");
        }
    }
    public int getPageNo()
    {

        return pageNo;

    }
}
public class LaunchBook {
    public static void main(String[] args) {
        Book b=new Book();

        b.setPageNo(-100);
        System.out.println(b.getPageNo());

    }
}
