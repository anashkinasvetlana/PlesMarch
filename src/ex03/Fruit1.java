package ex03;

public class Fruit1 {
    private String price;
    public Fruit1(String price) {
        this.price = price;
    }
    public static void main (String[] args) {
        Fruit1[] fruits = new Fruit1[4];
        fruits[0] = new Fruit1("Orange");
        fruits[1] = new Fruit1("Apple");
        fruits[2] = new Fruit1("Avocado");
        fruits[3] = new Fruit1("Apricot");
        System.out.printf(fruits);

    }
}
