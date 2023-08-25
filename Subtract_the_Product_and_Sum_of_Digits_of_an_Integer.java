import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int p=1,s=0;
        while(n!=0)
        {
            int a=n%10;
            p=p*a;
            s=s+a;
            n=n/10;
        }
        System.out.println(p-s);
    }
}