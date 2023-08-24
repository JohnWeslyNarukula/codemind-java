import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                f=f+i;
            }
        }
        if(f>n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}