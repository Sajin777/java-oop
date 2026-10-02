# static

`static` members belong to the class rather than a particular object.

```java
class Counter {
    static int count = 0;

    Counter() {
        count++;
    }
}
```

Use:

```java
Counter a = new Counter();
Counter b = new Counter();

System.out.println(Counter.count); // 2
```
