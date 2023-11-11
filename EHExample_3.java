class Cat{
String name;
int age;
public Cat(String n, int a){
    name =n;
    age=a;
}
public void printInfo(){
    System.out.println(name+" "+age);
    }
}
public class EHExample_3 {
    public static void main(String[] args) {
        Cat c = null;
        c.printInfo();//NullPointerException
    }
}
