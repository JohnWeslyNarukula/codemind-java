import java.util.*;
public static void DetailsOfAPerson(String name,int age,String address){
    System.out.println("name: "+name);
    System.out.println("Age: "+age);
    System.out.println("address: "+address);
}
public static void DetailsOfAPerson(String qualification,int passingYear,String institution)
{
    System.out.println("qualification:"+qualification);
    System.out.println("passingYear:"+passingYear);
    System.out.println("institution:"+institution);
}
public class DetailsOfAPerson{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.nextLine();
        System.out.println("Enter Your Age:");
        int age=sc.nextInt();
        System.out.println("Enter Your Address:");
        String address=sc.next();
        System.out.println("Enter Your Qualification:");
        String qualification=sc.next();
        System.out.println("Enter Year Of Passing:");
        int passingYear=sc.nextInt();
        sc.nextLine();
        String.out.println("Enter your Institution:");
        String instituation=sc.nextLine();
        DetailsOfAPerson(name,age,address);
        DetailsOfAPerson(qualification,passingYear,instituation);


    }
}





class DetailsOfAPerson {
    String name;
    int age;
    String MaritalStatus;
    String  gender;
    float percent;
    int studId;
    int passYear;
    String college;
    public void PersonalDetails(String name,int age,String  gender,String MaritalStatus)
    {
        System.out.println("Person Personal Details:");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: " + gender);
        System.out.println("Marital Status: "+ MaritalStatus);
    }
    public void QualificationlDetails(float percent,int studId,String college,int passYear)
    {
        System.out.println("Qualification Details-->");
        System.out.println("Student Id: "+ studId);
        System.out.println("Percentage: "+ percent);
        System.out.println("Passing year :"+ passYear);
        System.out.println("College Name:" +college);
    }
    public static void main(String[] args) {
       lapProgram l1=new lapProgram();
        l1.PersonalDetails("Sai", 22,"MALE","NO");
        l1.QualificationlDetails(94,  4582,"Aditya College",2022 );
    }

}

