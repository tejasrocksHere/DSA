package Java.tutorial.basics;

public class MethodClass {

    public static void print(int i) {
        if (i > 10)
            return;
        System.out.println(i);
        print(i + 1);

    }

    public static void main(String[] args) {

        print(0);

    }
}
