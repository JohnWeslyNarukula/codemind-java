import java.util.Scanner;
public class EHExample {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        //Error prone operation
        try{
        System.out.println(a/b);
        }
        catch(ArithmeticException e){
        System.out.println("Buddy you cant divide with 0");
        }
        System.out.println("I Will Be On The Screen");
    }
}
