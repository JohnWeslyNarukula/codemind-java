public class Count_of_Nums_in_array_higher_then_Given_Num 
{
    static int newIntArr(int[] a,int j)
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>j)
            c++;
        }
        return c;
    }
        public static void main(String[] args)
         {
           int[] a = {1,2,3,4,5};
           int j = 2;
           System.out.println(newIntArr(a, j));
         }
}
