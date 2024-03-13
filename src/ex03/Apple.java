package ex03;

public class Apple {
    private int quantity;
    private int cost;

    public Apple(int quantity, int cost) {
        this.quantity = quantity;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "quantity=" + quantity +
                ", cost=" + cost +
                '}';
    }
}
//не готово