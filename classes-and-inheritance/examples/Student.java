class Student {
    private String name;
    private int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public char getGrade() {
        if (marks >= 90) return 'A';
        if (marks >= 75) return 'B';
        if (marks >= 60) return 'C';
        if (marks >= 50) return 'D';
        return 'F';
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student("Sajin", 86);
        System.out.println(s.getName() + " - " + s.getGrade());
    }
}
