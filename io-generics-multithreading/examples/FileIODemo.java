import java.nio.file.Files;
import java.nio.file.Path;

public class FileIODemo {
    public static void main(String[] args) throws Exception {
        Path file = Path.of("java-note.txt");

        Files.writeString(file, "Learning Java I/O");
        String content = Files.readString(file);

        System.out.println(content);
        Files.deleteIfExists(file);
    }
}
