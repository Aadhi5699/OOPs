public final class OrderItem {
    private final String name;
    private final double price;

    public OrderItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String name() {
        return name;
    }

    public double price() {
        return price;
    }
}
