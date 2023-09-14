public class FirstLettersIn_N_NumberOfStrings {
    public static void firstLetter(String ... names)
    {
        for(String i : names)
        {
            System.out.println(i.charAt(0) +" ");
        }
    }
    public static void main(String[] args) {

         firstLetter("john");
         firstLetter("khaja","gouse");
         firstLetter("Ayyappa","jashu","vamsi");   
    }
}
