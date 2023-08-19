import java.util.Scanner;
public class john
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String onum;
        onum = sc.nextLine();
        int num = Integer.parseInt(onum, 8);
        System.out.println(num);
    }
}