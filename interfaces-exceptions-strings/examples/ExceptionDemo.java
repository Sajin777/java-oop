public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int[] values = {10, 20, 30};
            System.out.println(values[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } finally {
            System.out.println("Program completed");
        }
    }
}
