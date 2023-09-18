import java.util.Scanner;
public class wi {
    public static void main(String[] args)
    {
        Scanner j = new Scanner(System.in);
        int a,b;
        a = j.nextInt();
        b = j.nextInt();
        System.out.println("1.Arith\n2.Rela\n3.Bitwise");
        char ch1 = j.next().charAt(0);
        switch (ch1)
        {
            case "1":
            System.out.println("+\n-\n*\n/\n%\n");
            char ch11 = j.next().charAt(0);
            switch (ch11)
            {
                case "+":
                {
                    System.out.println(a+b);
                    break;
                }
                case "-":
                {
                    System.out.println(a-b);
                    break;
                }
                 case "/":
                {
                    System.out.println(a/b);
                    break;
                }
                 case "%":
                {
                    System.out.println(a%b);
                    break;
                }
                 case "*":
                {
                    System.out.println(a*b);
                    break;
                }

            }
            case "2":
            System.out.println("<\n>\n>=\n<=\n==\n");
            char ch12 = j.next().charAt(0);
            switch (ch12)
            {
                case "<":
                {
                System.out.println(a<b);
                break;
                }
                case ">":
                {
                System.out.println(a>b);
                break;
                }
                case ">=":
                {
                System.out.println(a>=b);
                break;
                }
                case "<=":
                {
                System.out.println(a<=b);
                break;
                }
                case "==":
                {
                System.out.println(a==b);
                break;
                }
            }
            case "3":
            System.out.println("^\n~\n|\n&\n");
            char ch13 = j.next().charAt(0);
            switch (ch13)
            {
                case "^":
                {
                System.out.println(a^b);
                break;
                }
                case "~":
                {
                System.out.println(~b);
                break;
                }
                case "|":
                {
                System.out.println(a|b);
                break;
                }
                case "&":
                {
                System.out.println(a&b);
                break;
                }
            }
            
        }

    }
}
