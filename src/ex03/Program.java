package ex03;

public class Program {
    public static void main(String[] args) {
        Object[] objects = {new Apple(5,7)};
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }
    }
}