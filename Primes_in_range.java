import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c,v=0;
        for(int i = n;i<=m;i++)
        {
            if(prime(i))
            {
                v++;
            }
        }
        System.out.println(v);
    }
    public static boolean prime(int n)
    {
        if(n==1)
          return false;
        for(int j=2;j<=Math.sqrt(n);j++)
            {
                if(n%j==0)
                {
                    return false;
                }
            }
        return true;
    }
}