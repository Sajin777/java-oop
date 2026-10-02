# Generics

Generics provide compile-time type safety.

```java
class Box<T> {
    private T value;

    void set(T value) { this.value = value; }
    T get() { return value; }
}

Box<Integer> box = new Box<>();
box.set(100);
```
