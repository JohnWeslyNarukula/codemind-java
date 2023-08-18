import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int n;
        n = a.nextInt();
        if((n%2)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}