import { Payment } from "./Payment";
import { CardPayment, UpiPayment } from "./UpiPayment";

const payments: Payment[] = [
    new UpiPayment(),
    new CardPayment(),
];

payments.forEach(p => p.process(100));
