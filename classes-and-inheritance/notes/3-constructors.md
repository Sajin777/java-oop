# Constructors

A constructor initializes an object and has the same name as the class.

```java
class Student {
    String name;

    Student(String name) {
        this.name = name;
    }
}

Student s = new Student("Sajin");
```

## Default constructor

If no constructor is declared, Java can provide a default constructor.

## Parameterized constructor

```java
Student(String name, int marks) {
    this.name = name;
    this.marks = marks;
}
```
