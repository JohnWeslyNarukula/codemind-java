public class BlockScope
{
    public static void main(String[] args)
    {
        int a =10;
        {
            int b = 20;
            {
                int c = 30;
                System.out.println(c);
            }
            System.out.println(b);
        }
        System.out.println(a);
    }
}