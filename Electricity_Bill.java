import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String C = sc.nextLine();
        String N = sc.nextLine();
        int n=sc.nextInt();
        double b;
        if(n<199)
        {
            b = n*1.20;
        }
        else if(n>=200 && n<400)
        {
            b = n*1.50;
        }
        else if(n>=400 && n<600)
        {
            b = n*1.80;
        }
        else
        {
            b = n*2.00;
        }
        if(b>400)
        {
            System.out.printf("%.2f",b+b*0.15);
        }
        else
        {
            System.out.printf("%.2f",b+100);
        }
    }
}