class UpiPayment extends Payment {
    process(amount: number): void {
        console.log(`Processing UPI payment of ₹${amount}`);
    }
}

class CardPayment extends Payment {
    process(amount: number): void {
        console.log(`Processing Card payment of ₹${amount}`);
    }
}
