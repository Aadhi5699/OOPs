     ┌───────────────┐
     │   Vehicle     │  <---- abstract class
     ├───────────────┤
     │ + start()     │
     │ + stop()      │
     └───────▲───────┘
             │
             │ extends
     ┌───────────────┐
     │     Car       │
     ├───────────────┤
     │ + wheels      │
     │ + start()     │ (override)
     └───────────────┘

1) Using Abstract method.     

 - The method is declared with a signature but no code inside e.g., abstract void start();
 - Subclass Responsibility: Every non-abstract child class must provide its own implementation for this method.
 - Enforces a Contract: By marking start() as abstract, you force every specific vehicle (like Car, Boat, or Plane) to provide its own logic. This prevents developers from forgetting to implement essential features in new subclasses.
 - Enables Polymorphism: It allows you to treat different objects uniformly. You can have a List<Vehicle> and call .start() on every item in the list without needing to know if it's a car or a bike; the program will automatically trigger the correct version for each at runtime.

 2) Using Composition instead of inheritance in CarService

 Inheritance creates tight coupling
 - If Engine’s code changes → your CarService may break
 - If Engine adds new methods → CarService may get unwanted features
 - If Engine behavior changes → CarService is affected.
 - Inheritance Is for IS-A, Not Code Reuse
 - Composition avoids this because Engine is used like a dependency, not a parent.


3) [Wrong-Inheritance/Logger.java](Wrong-Inheritance/Logger.java)

Why this is wrong?

-A Printer is NOT a Logger.
-This violates IS-A rule and Liskov Substitution Principle.
-Printer inherited unnecessary behaviors from Logger.
-Tight coupling — if Logger changes, Printer breaks.