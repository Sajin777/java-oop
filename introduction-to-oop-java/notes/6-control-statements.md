# Control Statements

Control statements decide the order in which statements execute.

## if-else

```java
if (marks >= 50) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

## switch

```java
int day = 2;

switch (day) {
    case 1 -> System.out.println("Monday");
    case 2 -> System.out.println("Tuesday");
    default -> System.out.println("Invalid");
}
```

## for loop

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

## while loop

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

## break and continue

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println(i);
}
```
