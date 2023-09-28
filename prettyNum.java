import java.util.Scanner;
public class prettyNum
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i < t ;i++ )
        {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int m=0;
            for(int j=l;j<=r;j++)
            {
                if(j%10==2)
                {
                    m+=j;
                }
                else if (j%10==3) 
                {
                    m+=j;
                }
                else if(j%10==9)
                {
                    m+=j;
                }
            }
        }
        System.out.println(m);
    }
}