import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        if(m%2==0 || n%2==0)
        {
            System.out.println("Player 1");
        }
        else
        {
            System.out.println("Player 2");
        }
    }
}