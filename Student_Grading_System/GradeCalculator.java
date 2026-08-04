import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
    private final List<Double> marks;

    public GradeCalculator() {
        this.marks = new ArrayList<>();
    }

    public void addMark(double mark) {
        marks.add(mark);
    }

    public int getSubjectCount() {
        return marks.size();
    }

    public double calculateTotal() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total;
    }

    public double calculateAveragePercentage() {
        if (marks.isEmpty()) return 0.0;
        return calculateTotal() / marks.size();
    }

    public String assignGrade(double percentage) {
        if (percentage >= 90) return "A+";
        if (percentage >= 80) return "A";
        if (percentage >= 70) return "B";
        if (percentage >= 60) return "C";
        if (percentage >= 50) return "D";
        return "F";
    }

    public String getPassFailStatus(double percentage) {
        return percentage >= 50 ? "PASSED" : "FAILED";
    }
}
