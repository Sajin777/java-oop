# Exception Handling

Use `try`, `catch`, `finally`, `throw` and `throws` to handle exceptional situations.

```java
try {
    int result = 10 / 0;
    System.out.println(result);
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
} finally {
    System.out.println("Finished");
}
```
