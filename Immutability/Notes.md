Imagine I’m building a food delivery system. Once an order is placed — containing the customer’s name, order items, and total amount — it must not change. Immutable objects ensure the data remains consistent, even when accessed by multiple threads.

- Declare the Class as final
- Use final for Fields
- Do Not Provide Setters

Defensive Copy: Creating a new copy of a mutable object before storing or returning it, to protect internal state from external modification.
- Encapsulates mutable data.
