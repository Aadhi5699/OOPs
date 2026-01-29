import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderItem item1 = new OrderItem("Book", 200);
        OrderItem item2 = new OrderItem("Pen", 20);

        Order order1 = new Order("ORD001", List.of(item1));
        // New immutable object
        Order order2 = order1.addItem(item2);

        System.out.println(order1.total());
        System.out.println(order2.total());
    }
}
