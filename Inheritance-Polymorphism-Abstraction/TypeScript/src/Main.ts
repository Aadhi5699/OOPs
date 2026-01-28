const payments: Payment[] = [
    new UpiPayment(),
    new CardPayment(),
];

payments.forEach(p => p.process(1000)); 
