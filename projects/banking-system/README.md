# 🏦 Banking System

A beginner-friendly Java OOP project for demonstrating real-world object modeling.

## Main features

- Create customer accounts
- Deposit money
- Withdraw money
- Check balance
- Transfer money
- Handle invalid transactions

## Suggested class design

```text
Bank
 ├── Customer
 └── Account
       ├── SavingsAccount
       └── CurrentAccount
```

## OOP concepts

### Encapsulation

```java
class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }
}
```

### Inheritance

```java
class SavingsAccount extends Account {
}
```

### Polymorphism

```java
Account account = new SavingsAccount();
```

## Suggested future structure

```text
src/
└── banking/
    ├── Account.java
    ├── SavingsAccount.java
    ├── CurrentAccount.java
    ├── Customer.java
    ├── Bank.java
    └── Main.java
```
