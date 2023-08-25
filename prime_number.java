import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n;
        n = sc.nextInt();
        if(n%2==0 || n%3==0)
        {
            System.out.println("not a prime");
        }
        else
        {
            System.out.println("prime");
        }
    }
}