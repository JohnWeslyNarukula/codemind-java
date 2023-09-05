public class vowelCount {
    public static void main(String[] args)
    {
        String s ="Hello All This is Java Programming";
        String vowels ="AEIOUaeiou";
        int vowelCount = 0;
        for(int i = 0 ; i < s.length() ; i++ )
        {
            if(vowels.contains(""+s.charAt(i)))
            {
                vowelCount++;
            }
        }
        System.out.println(vowelCount);
    }
}
