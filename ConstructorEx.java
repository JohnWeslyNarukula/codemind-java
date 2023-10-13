class Student{
    String id ;
    String name;
    String college;
    String branch;
    Student(String i , String n , String c , String b)
    {
        id = i;
        name = n;
        college = c;
        branch = b;
    }
    void getDetails()
    {
        System.out.println("Name    : " + name);
        System.out.println("ID is   : " + id);
        System.out.println("College : " + college);
        System.out.println("Branch  : " + branch);
        System.out.println();
    }
}
public class ConstructorEx {
    public static void main(String[] args) {
        Student s1 = new Student("61h2" , "john" , "AEC" , "AIML");
        Student s2 = new Student("4415" , "Moin", "Acet" , "Ds");
        Student s3 = new Student("6162" , "Manu" , "AEC" , "Ds");
        s1.getDetails();
        s2.getDetails();
        s3.getDetails();
    }

}

