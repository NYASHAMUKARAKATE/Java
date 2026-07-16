# Java Learning Journey 🚀

> A structured Java project documenting my progression from language fundamentals through Object-Oriented Design — built with Gradle and organized by topic for clarity.

---

## 📁 Project Structure

```
app/src/main/java/org/nyashamukarakate/java/
│
├── Main.java                        ← Entry point — runs all module demos
│
├── oop/
│   ├── animals/                     ← Inheritance & Polymorphism
│   │   ├── Animal.java
│   │   ├── Dog.java
│   │   ├── Cat.java
│   │   └── ZooApp.java
│   │
│   ├── employees/                   ← Inheritance & Method Overriding
│   │   ├── Employee.java
│   │   ├── Developer.java
│   │   ├── Manager.java
│   │   └── CompanyApp.java
│   │
│   ├── banking/                     ← Encapsulation & Control Flow
│   │   ├── BankAccount.java
│   │   ├── BankManager.java
│   │   └── AtmSimulator.java
│   │
│   ├── payments/                    ← Interfaces & Runtime Polymorphism
│   │   ├── PaymentMethod.java
│   │   ├── VisaPayment.java
│   │   ├── EcocashPayment.java
│   │   ├── PayPalPayment.java
│   │   └── PaymentApp.java
│   │
│   └── logistics/                   ← Abstract Classes + Interfaces
│       ├── Trackable.java
│       ├── Parcel.java
│       ├── AirParcel.java
│       ├── GroundParcel.java
│       └── LogisticsManager.java
│
├── datastructures/                  ← Arrays, 2D Arrays & Objects
│   ├── Student.java
│   ├── StudentManager.java
│   ├── StudentMarkCalculator.java
│   ├── MarksAnalyzer.java
│   └── GradeBook.java
│
└── utils/                           ← Static Methods & Method Overloading
    ├── ScientificCalculator.java
    └── NumberUtility.java
```

---

## 🧠 What's Demonstrated

| Module | Concepts |
|---|---|
| **oop/animals** | Class hierarchies, `@Override`, runtime polymorphism |
| **oop/employees** | Multi-level inheritance, `super`, salary computation |
| **oop/banking** | Encapsulation, `private` fields, getters/setters, switch |
| **oop/payments** | Interface design, multiple implementations, loose coupling |
| **oop/logistics** | Abstract classes + interfaces combined, `Trackable` contract |
| **datastructures** | 1D and 2D arrays, object arrays, loops, aggregate calculations |
| **utils** | Static utility methods, method overloading |

---

## 🛠 Build & Run

This project uses the **Gradle** build system.

```bash
# Build
./gradlew build

# Run all module demos
./gradlew run
```

> On Windows, use `.\gradlew` instead of `./gradlew`

---

## 🔧 Tech Stack

- **Language**: Java 25
- **Build Tool**: Gradle 9.5
- **Test Framework**: JUnit Jupiter

---

## 🗺 Roadmap

- [ ] Collections Framework (`ArrayList`, `HashMap`)
- [ ] Java Streams & Lambdas
- [ ] Exception Handling patterns
- [ ] Generics
- [ ] Design Patterns (Singleton, Factory, Observer)
