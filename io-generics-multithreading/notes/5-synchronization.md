# Synchronization

When multiple threads share mutable data, synchronization can protect critical sections.

```java
synchronized void increment() {
    count++;
}
```
