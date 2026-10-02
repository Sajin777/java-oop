public class Arrays {
    public static void main(String[] args) {
        int[] marks = {90, 85, 78, 92};
        int total = 0;

        for (int mark : marks) {
            total += mark;
        }

        System.out.println("Total: " + total);
        System.out.println("Average: " + (double) total / marks.length);
    }
}
