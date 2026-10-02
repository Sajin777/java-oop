# File I/O

Use `java.io` or `java.nio.file` for file operations.

```java
import java.nio.file.Files;
import java.nio.file.Path;

Files.writeString(Path.of("data.txt"), "Hello Java");
String text = Files.readString(Path.of("data.txt"));
System.out.println(text);
```
