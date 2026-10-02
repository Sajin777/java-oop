import java.time.LocalDate;

class TrainingSession {
    private final LocalDate date;
    private final int durationMinutes;
    private final int rpe;

    TrainingSession(LocalDate date, int durationMinutes, int rpe) {
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        if (rpe < 1 || rpe > 10) {
            throw new IllegalArgumentException("RPE must be between 1 and 10");
        }
        this.date = date;
        this.durationMinutes = durationMinutes;
        this.rpe = rpe;
    }

    public double getWorkload() {
        return durationMinutes * rpe;
    }

    public LocalDate getDate() {
        return date;
    }
}

public class Main {
    public static void main(String[] args) {
        TrainingSession session =
                new TrainingSession(LocalDate.now(), 60, 7);

        System.out.println("Date: " + session.getDate());
        System.out.println("Workload: " + session.getWorkload());
    }
}
