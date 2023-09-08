import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int count=0;
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length() ; i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                count++;
            }
        }
        if(count!=0)
        {
        System.out.println("Contains "+count+" digit");
        }
        else
        {
            System.out.println("Doesn't contain digit");
        }
    }
}
