# Object-Oriented Programming (OOP)

## Why It Matters
OOP organizes code using objects that contain:
- **State** (data)
- **Behavior** (methods)

This makes code:
- Maintainable
- Testable
- Extensible

## The 4 Pillars of OOP 

### 1. Encapsulation
Binding data and methods together inside a class and restricting access to the internal state.

**Access Modifiers:**
- `private`: Restricted to the class.
- `protected`: Accessible in subclass and package.
- `public`: Accessible everywhere.

- **Protects invariants**: Ensures object state remains valid.
- **Prevents accidental misuse**: Hides internal complexity.
- **Enables safe refactoring**: Internal implementation can change without breaking external clients.

### 2. Abstraction
Exposing only essential features/behavior while hiding implementation details.

**Achieved using:**
- **Interfaces**: Define what a class must do.
- **Abstract Classes**: Define partial implementation.

- Use abstractions to reduce coupling.
- Enables multiple implementations (e.g., `PaymentProcessor`, `StorageService`, `Logger`).

### 3. Inheritance ("IS-A" Relationship)
A mechanism where a child class extends a parent class to acquire its properties and behaviors.

**When to use:**
- Behavior needs to be reused across a hierarchy.
- A logical type hierarchy exists (e.g., `Manager` is an `Employee`).

**When NOT to use:**
- If it’s *only* for code reuse -> **Prefer Composition over Inheritance**.

### 4. Polymorphism
The ability of a single interface or parent class to support multiple underlying forms (data types).

**Types:**
- **Compile-time**: Method Overloading (same method name, different parameters).
- **Runtime**: Method Overriding (subclass provides specific implementation).

**Benefit:**
- Allows writing flexible, extensible code by programming to interfaces rather than implementations.
