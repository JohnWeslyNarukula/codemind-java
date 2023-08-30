import java.util.Scanner;
 public class AreaOfTriangle 
{
   public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
         int  b= s.nextInt();
          int h= s.nextInt();
      int area=(b*h)/2;
      System.out.println( area);      
   }
}