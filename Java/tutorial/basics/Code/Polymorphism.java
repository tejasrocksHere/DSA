class Guy{
    String name;
    int age;
}
class Student extends Guy{
    String [] subjects;
    int roll_no;

}
class Son extends Guy{
    String sister;
    int netWorth;
}
public class Polymorphism {
    public static void main(String[] args) {
 Guy g= new Student();
    }
}
