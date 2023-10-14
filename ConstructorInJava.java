class person{
    String name;
    int age;
    char gender;
    person(){
        System.out.println("This is constructor reporting to the Duty of ");
    }
    void printDetails(){
        System.out.println("Name is:" + name);
        System.out.println("Age is:"+  age);
        System.out.println("Gender: "+ gender);
    }
}
public class ConstructorInJava {
    public static void main(String[] args) {
        person p1 = new person();
        p1.name = "john";
        p1.age= 18;
        p1.gender = 'M';
        p1.printDetails();
        person p2 = new person();
        p2.name = "khaja";
        p2.age= 18;
        p2.gender = 'M';
        p2.printDetails();
        person p3 = new person();
        p3.name = "manu";
        p3.age= 18;
        p3.gender = 'M';
        p3.printDetails();

    }
}
