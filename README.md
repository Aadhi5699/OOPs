# OOP Basics & 4 Pillars (Java + TypeScript)

This module covers:

- OOP concepts
- Encapsulation, Abstraction, Inheritance, Polymorphism
- Composition
- Immutability
- Interfaces vs Abstract Classes
- God Class.
- Java & TypeScript implementations

Run Code:
- Java: javac *.java && java Main
- TS: ts-node index.ts

                ┌───────────────────────────┐
                │     Object-Oriented       │
                │        Programming        │
                └─────────────┬─────────────┘
                              │
     ┌────────────────────────┼──────────────────────────┐
     │                        │                          │
     ▼                        ▼                          ▼
┌────────────┐       ┌────────────────┐         ┌────────────────┐
│Encapsulation│       │  Abstraction  │         │   Inheritance  │
└──────┬──────┘       └──────┬────────┘         └────────┬───────┘
       │                     │                             │
       │                     │                             │
       ▼                     ▼                             ▼
┌──────────────┐     ┌──────────────────┐         ┌─────────────────────┐
│Hide internal  │     │ Show essential   │         │ IS-A relationship   │
│state & data   │     │details only      │         │ Child extends Parent│
└──────────────┘     └──────────────────┘         └─────────────────────┘
       │                     │                             │
       ▼                     ▼                             ▼
┌──────────────┐     ┌──────────────────┐         ┌──────────────────────┐
│+ private      │     │+ interface       │         │Avoid misuse of IS-A  │
│+ protected    │     │+ abstract class  │         │Prefer composition    │
│+ public       │     │                  │         │                      │
└──────────────┘     └──────────────────┘         └──────────────────────┘

                              ▼
                     ┌──────────────────┐
                     │  Polymorphism    │
                     └─────────┬────────┘
                               │
     ┌─────────────────────────┼─────────────────────────┐
     │                         │                         │
     ▼                         ▼                         ▼
┌──────────────┐     ┌──────────────────┐       ┌──────────────────────┐
│Compile-time   │     │Runtime           │       │Program to interfaces │
│Overloading    │     │Overriding        │       │not implementations   │
└──────────────┘     └──────────────────┘       └──────────────────────┘


## Basics-and-Pillars
[Notes](Basics-and-Pillars/NOTES.md)

## Inheritance-Polymorphism-Abstraction
[Notes](Inheritance-Polymorphism-Abstraction/NOTES.md)

## God Class
[Notes](God-Class/Notes.md)

## Interfaces-vs-Abstract
[Notes](Interfaces-vs-Abstract/NOTES.md)

## Immutability
[Notes](Immutability/NOTES.md)
