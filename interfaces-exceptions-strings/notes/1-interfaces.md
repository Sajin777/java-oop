# Interfaces

An interface defines a contract that implementing classes agree to follow.

## Syntax
```java
interface Payment {
    void pay(double amount);
}

class UPI implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid: " + amount);
    }
}
```

A class can implement multiple interfaces.