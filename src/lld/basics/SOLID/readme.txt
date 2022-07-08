S.O.L.1.D

S- Single Responsibility principle
O- Open-closed principle
L - Liskov substitution principle
I- Interface segregation principle
D- Dependency Inversion Principle



Benefits of SOLID Principles
* Loose - Coupling
* Code Maintainability
+ Dependency Management

Single Responsibility principle -> A class should have only one and only one reason to change, ie a class should
                                    have only one job.

Open-closed principle -> you should be able to extend the class behaviour without modifying it

Liskov substitution principle -> Derived classes must be substitutable for their base classes.
                                    if S is a subtype of T, then objects of type T may be replaced (or
                                    substituted) with objects of type S.


Interface segregation principle -> Make the interface which are more client specific. Make the interface such that
                                    no extra functions should be written in child class other than it is intended for.


Dependency Inversion Principle -> High-level modules should not depend on low-level modules. Both should depend on
                                  abstractions.
                                  Abstractions should not depend on details. Details should depend on abstractions.