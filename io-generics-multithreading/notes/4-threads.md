# Multithreading

A thread is an independent path of execution.

```java
class Task extends Thread {
    @Override
    public void run() {
        System.out.println("Task is running");
    }
}

new Task().start();
```
