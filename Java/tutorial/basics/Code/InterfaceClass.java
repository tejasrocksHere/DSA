interface AnimalActions {
    void eat();
    void sleep();
    void makeSound();
}

class Dog implements AnimalActions {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat implements AnimalActions {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        AnimalActions myDog = new Dog();
        AnimalActions myCat = new Cat();

        myDog.makeSound(); // Outputs: Dog barks
        myCat.makeSound(); // Outputs: Cat meows
    }
}
