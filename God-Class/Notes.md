A God Class is a class that does too many responsibilities:

- talks to DB
- validates
- calculates prices
- sends notifications
- handles business logic

This kills maintainability, testability, and scalability.

The best way to design would be:

We break responsibilities into focused classes:

- OrderValidator → validation
- PriceCalculator → business logic
- OrderRepository → storage
- Notifier → email / sms
- OrderService → coordinates (high-level logic only)
