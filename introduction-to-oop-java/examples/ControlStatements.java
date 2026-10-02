public class ControlStatements {
    public static void main(String[] args) {
        int marks = 78;

        if (marks >= 90) {
            System.out.println("Grade A+");
        } else if (marks >= 75) {
            System.out.println("Grade A");
        } else if (marks >= 60) {
            System.out.println("Grade B");
        } else {
            System.out.println("Needs improvement");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
    }
}
