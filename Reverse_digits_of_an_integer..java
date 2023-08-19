import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,n,temp=0;
        n = sc.nextInt();
        for(i=n;n!=0;n=n/10)
        {
            int k = n%10;
            temp=temp*10+k;
        }
        System.out.printf("%d",temp);
    }
}