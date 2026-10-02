# Abstract Classes

An abstract class cannot be instantiated directly.

```java
abstract class Shape {
    abstract double area();

    void message() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}
```

Use an abstract class when related classes share common state or behavior while some behavior must be implemented by subclasses.
