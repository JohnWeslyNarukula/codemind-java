import java.util.Scanner;
    class TooYoungException extends Exception{
        public TooYoungException(String msg){
            super(msg);
        }
    }
    class TooOldException extends Exception{
        public TooOldException(String msg){
            super(msg);
        }
    }
public class MyOwnException {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int age = sc.nextInt();
        try{
            if(age<21){
                throw new TooYoungException("Child Marriages are illegal");
            }
            else if(age>50){
                throw new TooYoungException("You shoud set your son's marriage");
            }
            else{
                System.out.println("Get married now");
            }
        }
        catch (TooYoungException e){
            System.out.println(e.getMessage());
        }
        catch (TooOldException e){
            System.out.println(e.getMessage());
        }
    }
}
