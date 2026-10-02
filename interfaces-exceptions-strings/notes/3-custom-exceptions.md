# Custom Exceptions

```java
class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}
```

Use a custom exception when an application-specific rule is violated.