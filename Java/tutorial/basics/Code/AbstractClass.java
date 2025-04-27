abstract class Vehical{
    String name;
    void run(){
System.out.println("vehical is runiningg...");
    }
    abstract void stop();
}

class Car extends Vehical{
 
    @Override
    void stop() {
        // TODO Auto-generated method stub
        System.out.println("car is stopping...");
    }
}
public class AbstractClass{
    public static void main(String[] args) {
        Vehical v= new Car();
        v.run();
        v.stop();
    
    }
}