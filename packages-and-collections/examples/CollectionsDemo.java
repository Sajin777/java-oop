import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sajin");
        names.add("Morisha");
        names.add("Sajin");

        Set<String> uniqueNames = new HashSet<>(names);

        Map<Integer, String> students = new HashMap<>();
        students.put(101, "Sajin");
        students.put(102, "Morisha");

        System.out.println("List: " + names);
        System.out.println("Set: " + uniqueNames);
        System.out.println("Map: " + students);
    }
}
