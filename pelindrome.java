import java.util.Scanner;
public class pelindrome
{
    public static void main(String[] args)
    {
        Scanner j = new Scanner(System.in);
        int a,b,c,d=0;
        a = j.nextInt();
        b=a;
        while(a!=0)
        {
            c = b%10;
            d = d*10+c;
            b = b/10;
        }
        if(b==d)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not palindrome");
        }
    }
}

