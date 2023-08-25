import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n,k=0;
        n = sc.nextInt();
        while(n!=0)
        {
            int m = n%10;
            k = (k*10)+m;
            n = n/10;
        }
        System.out.println(k);
    }
}