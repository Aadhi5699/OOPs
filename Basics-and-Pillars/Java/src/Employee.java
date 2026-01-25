public class Employee extends Person {

    private double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void work() {
        System.out.println(getName() + " is working...");
    }

    @Override
    public void introduce() {
        System.out.println("Employee: " + getName());
    }
}
