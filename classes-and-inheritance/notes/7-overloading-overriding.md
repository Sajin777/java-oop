# Overloading and Overriding

## Method overloading

Same method name, different parameter list.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

## Method overriding

A child class provides a new implementation of an inherited method.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

Overloading is resolved at compile time; overriding participates in runtime polymorphism.
