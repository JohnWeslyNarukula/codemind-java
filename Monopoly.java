import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int a,b,c,m,i;
        m = sc.nextInt();
        for(i=0;i<m;i++)
        {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            if(a+b<c || b+c<a || c+a<b)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}