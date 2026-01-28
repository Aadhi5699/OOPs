// ❌ God Class — does EVERYTHING
export class OrderManager {
    private orders: any[] = [];

    createOrder(userId: string, items: any[]) {
        // validate
        if (!userId || items.length === 0) {
            throw new Error("Invalid order data");
        }

        // calculate price
        let total = 0;
        for (const item of items) total += item.price * item.qty;

        // "save to db"
        const order = { id: Date.now(), userId, items, total };
        this.orders.push(order);

        // send notification
        console.log(`Email sent to ${userId} for order ${order.id}`);

        return order;
    }

    getOrders() {
        return this.orders;
    }
}
