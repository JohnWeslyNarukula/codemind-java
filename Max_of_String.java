import java.util.Scanner;
public class john
{
public static void main(String args[])
{
    char max = 'A';
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for(int i = 0 ; i<s.length();i++)
    {
            if (s.charAt(i) > max)
                max = s.charAt(i);   
    }
    System.out.println(max);
}
}