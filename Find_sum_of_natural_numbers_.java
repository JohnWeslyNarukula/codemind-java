import java.util.Scanner;
public class jo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,c=0,i;
        n = sc.nextInt();
        for(i=1;i<=n;++i)
        {
            c+=i;
        }
        System.out.println(c);
    }
}