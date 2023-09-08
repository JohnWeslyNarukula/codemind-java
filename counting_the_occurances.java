import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count=0;
        String s = sc.nextLine();
        char c = sc.next().charAt(0);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
            {
                count++;
            }
        }
        if(count==0)
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(count);
        }
    }
}

