<div align="center">

# ☕ Java OOP Learning Hub

<p>
  <strong>A structured, beginner-friendly Java repository for learning OOP from zero to projects.</strong>
</p>

<p>
  <img src="https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk" alt="Java 17+">
  <img src="https://img.shields.io/badge/Level-Beginner%20→%20Intermediate-blue?style=for-the-badge" alt="Level">
  <img src="https://img.shields.io/badge/Focus-OOP-success?style=for-the-badge" alt="OOP">
</p>

</div>

---

## 🌱 What is this repository?

This repository is a **learning path + code library + practice workspace** for Java and Object-Oriented Programming.

> **Learn → Read → Run → Modify → Practice → Build**

You do not need to study every file at once. Follow the modules in order and run the examples yourself.

---

## 🗺️ Learning Roadmap

| Stage | Module | What you learn |
|---|---|---|
| 01 | [Introduction to OOP & Java](./introduction-to-oop-java/) | Java basics, variables, arrays, operators, control flow |
| 02 | [Classes & Inheritance](./classes-and-inheritance/) | Classes, objects, constructors, inheritance, polymorphism |
| 03 | [Interfaces, Exceptions & Strings](./interfaces-exceptions-strings/) | Interfaces, exception handling, String API |
| 04 | [I/O, Generics & Multithreading](./io-generics-multithreading/) | Files, generics, threads and synchronization |
| 05 | [Packages & Collections](./packages-and-collections/) | Packages, List, Set, Map and iteration |
| 06 | [Projects](./projects/) | Apply OOP concepts in real applications |

---

## 🧠 How to use each topic

Each topic follows the same learning pattern:

```text
📖 Read the note
     ↓
🧩 Understand the syntax
     ↓
▶️ Run the example
     ↓
✏️ Change the code
     ↓
🧪 Solve the exercises
     ↓
🚀 Apply it in a project
```

---

## ⚡ Run a Java example

Make sure Java is installed:

```bash
java -version
javac -version
```

Compile:

```bash
javac HelloJava.java
```

Run:

```bash
java HelloJava
```

For a source file inside the repository, first move into its folder or compile using its path.

### Example

```bash
cd introduction-to-oop-java/examples
javac HelloJava.java
java HelloJava
```

---

## 📚 Core OOP Map

```text
                         JAVA
                          │
          ┌───────────────┴───────────────┐
          │                               │
      Fundamentals                    OOP Concepts
          │                               │
   Variables / Arrays              Classes / Objects
   Operators / Loops               Encapsulation
   Methods / Control               Inheritance
                                   Polymorphism
                                   Abstraction
                                   Interfaces
```

### The four pillars

| Pillar | Simple meaning | Typical Java feature |
|---|---|---|
| 🔒 Encapsulation | Keep data and behavior together and control access | `private`, getters/setters |
| 🌳 Inheritance | Build a new class from an existing class | `extends` |
| 🎭 Polymorphism | One reference, different behavior | overriding |
| 🧩 Abstraction | Show essential behavior and hide implementation | `abstract`, interfaces |

---

## 🧪 Example: Encapsulation

```java
class Student {
    private String name;
    private int marks;

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println(name + " - " + marks);
    }
}
```

The fields are protected from direct access, while methods provide controlled access.

---

## 🌳 Example: Inheritance

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

---

## 🎭 Example: Dynamic Method Dispatch

```java
Animal a = new Dog();
a.sound();
```

The reference type is `Animal`, but the overridden method of `Dog` executes at runtime.

---

## 🛠️ Recommended tools

- Java JDK 17 or newer
- VS Code with Extension Pack for Java
- Git
- GitHub

---

## 📁 Repository Structure

```text
java-oop/
├── README.md
├── .gitignore
│
├── introduction-to-oop-java/
├── classes-and-inheritance/
├── interfaces-exceptions-strings/
├── io-generics-multithreading/
├── packages-and-collections/
└── projects/
    ├── Athlete-Performance-Analytics/
    └── banking-system/
```

---

## 🎯 Study Checklist

- [ ] Java syntax
- [ ] Data types and variables
- [ ] Arrays
- [ ] Operators
- [ ] Control statements
- [ ] Classes and objects
- [ ] Constructors
- [ ] Methods
- [ ] `static`
- [ ] Access modifiers
- [ ] Inheritance
- [ ] `super`
- [ ] `final`
- [ ] Method overloading
- [ ] Method overriding
- [ ] Dynamic method dispatch
- [ ] Abstract classes
- [ ] Interfaces
- [ ] Exception handling
- [ ] Strings
- [ ] File I/O
- [ ] Generics
- [ ] Multithreading
- [ ] Packages
- [ ] Collections
- [ ] OOP projects

---

## 🏆 Mini-projects

### 🏃 Athlete Performance Analytics

A coach/trainer-oriented application for recording athlete sessions and analyzing workload, trends, personal bests and squad comparisons.

Main OOP concepts:

`Encapsulation` · `Inheritance` · `Abstraction` · `Polymorphism` · `Interfaces` · `Collections` · `Exception Handling`

### 🏦 Banking System

A beginner-to-intermediate OOP project demonstrating:

`Classes` · `Encapsulation` · `Inheritance` · `Polymorphism` · `Exceptions` · `Collections`

---

## 🤝 Contribution workflow

```bash
git clone <your-repository-url>
cd java-oop

git checkout -b feature/my-topic
# edit files

git add .
git commit -m "Add example for constructors"
git push -u origin feature/my-topic
```

Then create a Pull Request on GitHub.

---

## 📌 Learning rule

> **Don't just copy the code. Change one thing and run it again.**

For example, after running:

```java
System.out.println("Hello Java");
```

change it to:

```java
System.out.println("Hello OOP");
```

Then add a variable, a method, a class, and finally an object.

---

<div align="center">

### ☕ Code a little every day. Understand the idea, not just the syntax.

</div>
