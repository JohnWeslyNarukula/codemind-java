public class SumOfManyNumbersUsingFunctions {
    static int getSum(int ... numbers)
    {
          int sum = 0;
          for(int each :numbers)
          {
            sum+=each;
          }
          return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(getSum(10));
        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
        System.out.println(getSum(10,20,30,40));
        System.out.println(getSum(10,20,30,40,50));
    }
}
