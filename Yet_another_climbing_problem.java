import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int a =sc.nextInt();
            int b =sc.nextInt();
            if(a<b)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(((a/b)+(a%b)));
            }
        }
    }
}