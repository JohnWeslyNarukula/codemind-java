import java.util.Scanner;
public class EHExample_2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        Scanner sc = new Scanner(System.in);
        int ind =sc.nextInt();
        try{
            System.out.println(arr[ind]);
        }
        //ArrayIndexOutOfBoundException
        catch(IndexOutOfBoundsException e){
            System.out.println("You can only enter a number from 0 to "+(arr.length-1));
        }
        System.out.println("Hello");
    }
}
