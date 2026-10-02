# Inheritance

Inheritance allows a child class to reuse members of a parent class.

## Syntax

```java
class Parent {
    void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
}
```

`Child` inherits accessible members of `Parent`.

## Types in Java

Java supports class-based single, multilevel and hierarchical inheritance. Multiple inheritance of classes is not supported; interfaces can be used to achieve multiple-type behavior.
