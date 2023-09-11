import java.util.Scanner;
public class ReversingString {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String sp="";
        String n = sc.nextLine();
        for (int i=0; i<n.length(); i++)
        {
           char ch= n.charAt(i); 
           sp= ch+sp; 
        }
        System.out.println(sp);
    }
}