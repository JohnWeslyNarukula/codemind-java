import java.util.Scanner;
public class jo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        if(s==4 || s==5 || s==6)
        {
            System.out.println("Summer");
        }
        else if(s==7 || s==8 || s==10 || s==9)
        {
            System.out.println("Rainy");
        }
         else if(s==11 || s==12 || s==1)
        {
            System.out.println("Winter");
        }
        else if(s==3 || s==2)
        {
            System.out.println("Spring");
        }
        else
        {
            System.out.println("-1");
        }
    }
}