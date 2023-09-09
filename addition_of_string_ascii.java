public class addition_of_string_ascii {
    static int getCodePointSum(String aString) {
        int sum =0;
         for(int i =0 ;i<aString.length();i++)
         {
            sum+= (int)aString.charAt(i);
         }
         return sum;
        }
        public static void main(String[] args)
        {
            int result = getCodePointSum("john");
            System.out.println(result);

        }
    }
