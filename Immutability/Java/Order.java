import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public final class Order {

    private final String orderId;
    private final List<OrderItem> items;
    private final double total;

    public Order(String orderId, List<OrderItem> items) {
        this.orderId = orderId;
        
        // Defensive copy
        this.items = Collections.unmodifiableList(new ArrayList<>(items));
        this.total = this.items.stream()
                .mapToDouble(OrderItem::price)
                .sum();
    }

    public String orderId() {
        return orderId;
    }

    public List<OrderItem> items() {
        return items;
    }

    public double total() {
        return total;
    }

    // Returns New object instead of modifying existing one
    public Order addItem(OrderItem item) {
        List<OrderItem> newItems = new ArrayList<>(this.items);
        newItems.add(item);
        return new Order(this.orderId, newItems);
    }
}
