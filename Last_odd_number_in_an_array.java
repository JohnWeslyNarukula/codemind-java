import java.util.*;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int jo[] = new int[n];
        for(int i=0;i<n;i++)
        {
            jo[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if((jo[n-1])%2!=0)
            {
                System.out.print(jo[n-1]);
            }
            else
            {
                System.out.print(jo[n-2]);
            }
            break;
        }
    }
}
