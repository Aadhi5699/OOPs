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