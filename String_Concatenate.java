import java.util.*;
public class john
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        String s1 = sc.nextLine();
        s=s.concat(s1);
        char []arr = s.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
}
