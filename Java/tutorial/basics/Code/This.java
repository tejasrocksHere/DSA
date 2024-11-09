class Animal{
    String name;
    String color;
    Animal(String name,String col){
this.name=name;
this.color=col;
printDetails(this);
    }
    public  void printDetails(Animal animal){
        System.out.println(animal.name);
        System.out.println(animal.color);
    }
}
public class This {
    public static void main(String[] args) {
        Animal a=new Animal("dog", "black");
    }
}
