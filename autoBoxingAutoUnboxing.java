public class autoBoxingAutoUnboxing {
    public static void main(String[] args)
    {
        int a = 10; 
        //AUTO-BOXING
        Integer number = a;
        //AUTO-UNBOXING
        int b = number;
        System.out.println(number instanceof Integer);
       
    }
}
