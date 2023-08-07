import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        double c,F;
        c=p.nextInt();
        F=32+(c*9/5);
        System.out.printf("%.2f",F);
    }
}