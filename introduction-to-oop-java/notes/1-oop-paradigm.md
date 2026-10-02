# OOP Paradigm

## What is OOP?

Object-Oriented Programming organizes software around **objects** that contain data and behavior.

### Basic terms

| Term | Meaning |
|---|---|
| Class | Blueprint |
| Object | Instance of a class |
| Attribute | Data/state |
| Method | Behavior |
| Encapsulation | Bundling and controlling data |
| Inheritance | Reusing an existing class |
| Polymorphism | Same interface, different behavior |
| Abstraction | Hiding unnecessary implementation |

## Example

```java
class Student {
    String name;

    void study() {
        System.out.println(name + " is studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Sajin";
        s.study();
    }
}
```

## Key idea

A **class** describes what an object should contain and do. An **object** is the actual instance created from that class.
