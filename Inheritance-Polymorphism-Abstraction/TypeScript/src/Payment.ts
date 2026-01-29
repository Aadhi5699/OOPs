export abstract class Payment {
    abstract process(amount: number): void;
}
