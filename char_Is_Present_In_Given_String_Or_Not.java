public class char_Is_Present_In_Given_String_Or_Not 
{
    static boolean charInString(String s,char c) 
    {
        for (char ch : s.toCharArray()) 
        {
            if (ch == c) return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        boolean result = charInString("Hello",'H');
        System.out.println(result);
    }
}
