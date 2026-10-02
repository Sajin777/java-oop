# Java Overview

Java is a class-based, object-oriented programming language designed to be portable through the JVM.

## JDK, JRE and JVM

```text
JDK
 ├── Compiler (javac)
 └── JRE
      └── JVM
```

- **JDK**: tools for developing Java programs.
- **JRE**: runtime environment.
- **JVM**: executes Java bytecode.

## First program

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

Compile:

```bash
javac HelloJava.java
```

Run:

```bash
java HelloJava
```

## Important syntax

```java
class ClassName {
    // members
}

public static void main(String[] args) {
    // program starts here
}
```
