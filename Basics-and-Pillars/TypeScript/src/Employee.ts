import { Person } from './Person';

export class Employee extends Person {
    private salary: number;

    constructor(name: string, age: number, salary: number) {
        super(name, age);
        this.salary = salary;
    }

    public work(): void {
        console.log(`${this.getName()} is working...`);
    }

    public override introduce(): void {
        console.log(`Employee: ${this.getName()}`);
    }
}
