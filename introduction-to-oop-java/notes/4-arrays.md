# Arrays

An array stores multiple values of the same type.

## Syntax

```java
dataType[] arrayName = new dataType[size];
```

Example:

```java
int[] marks = {90, 85, 78, 92};

for (int mark : marks) {
    System.out.println(mark);
}
```

## Two-dimensional array

```java
int[][] matrix = {
    {1, 2},
    {3, 4}
};

System.out.println(matrix[1][0]); // 3
```

## Remember

Array indexing starts at `0`.
