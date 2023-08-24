import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,r;
        r = sc.nextInt();
        n =sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                System.out.println(r+" x "+i+" = "+r*i);
            }
        }
    }
}