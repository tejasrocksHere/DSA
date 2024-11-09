class Car{
    String name;
int model_no;
int price;


void Run(){
    System.out.println("Car is running...");
}


}
class Bmw extends Car{
    void Run(){
        System.out.println("Bmw is running...");
    }
}ui6g

public class Overriding {
public static void main(String[] args) {
    Car b= new Bmw();
    b.Run();
}       
}
