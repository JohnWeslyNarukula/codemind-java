import java.util.Scanner;
public class half_Dimand
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=3 && n<=100)
        {
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= i ; j++)
            {
            System.out.print("*");
            }
            System.out.print("
");
        }
        for(int i = 1 ; i <= n-1 ; i++)
        {
            for(int j = i ; j <= n-1 ; j++)
            {
                System.out.print("*");
            }
            System.out.print("
");
        }
        }
        else
        {
            System.out.println("The pattern is not possible");
        }
    }
}