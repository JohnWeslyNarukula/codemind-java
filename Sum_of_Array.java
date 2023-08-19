import java.util.Scanner;
public class john
{
    public static void main(String[] args)
    {
        Scanner sa = new Scanner(System.in);
        int s = sa.nextInt();
        int[] intArray = new int[s];
        for (int i=0;i<s;i++)
        {
            intArray[i] = sa.nextInt();
        }
        int sum = 0;
        for(int e:intArray)
        {
            sum+=e;
        }
        System.out.println(sum);
    }
}