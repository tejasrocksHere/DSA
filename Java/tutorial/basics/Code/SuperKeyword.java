class Vehicle {
    String color;
void noice(){
    System.err.println("noice......");
}
    Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    int speed;

    Car(String color, int speed) {
        super(color); // Calls the superclass constructor
        super.noice();
        this.speed = speed;
    }
}

public class SuperKeyword{
public static void main(String[] args) {
    Car car= new Car("null", 10);


}
}