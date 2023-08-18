import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        if(a>20)
        {
        System.out.println("HOT");
        }
        else
        {
            System.out.println("COLD");
        }
    }
}