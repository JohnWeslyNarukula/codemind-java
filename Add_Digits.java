import java.util.Scanner;
public class digit
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int n;
        int j=0;
        n = sc.nextInt();
        // while(n!=0)
        // {
        //     int m = n%10;
        //     j = j*10+m;
            
        // }
        System.out.print(n%9);
    }
}