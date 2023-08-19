import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,i;
        n = sc.nextInt();
        int ai[] = new int[n];
        for(i=0;i<n;i++)
        {
            ai[i] =sc.nextInt();
        }
        int max;
        max=ai[0];
        for(i=0;i<n;i++)
        {
            if ( max<ai[i] )
            {
                max=ai[i];
            }
        }
        System.out.printf("%d",max);
        
    }
}