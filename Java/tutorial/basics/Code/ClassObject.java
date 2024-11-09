 class Car{
    public int add(int x,int b){
        return x+b;
    }
}

public class ClassObject{
    public static void main(String[] args) {
        System.out.println("hello world");
 
        Car c= new Car();
        int ans=c.add(3, 5);
        System.out.println(ans);
    }
    }
