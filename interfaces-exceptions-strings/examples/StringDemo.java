public class StringDemo {
    public static void main(String[] args) {
        String text = "Java OOP";

        System.out.println("Length: " + text.length());
        System.out.println("Upper: " + text.toUpperCase());
        System.out.println("Contains Java: " + text.contains("Java"));

        StringBuilder sb = new StringBuilder(text);
        sb.append(" Learning");
        System.out.println(sb);
    }
}
