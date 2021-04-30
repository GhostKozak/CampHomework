import java.util.ArrayList;

public class Student extends User {
    private double totalScore;
    ArrayList<Course> attendedCourses = new ArrayList<>();

    Student() {
        this.setUserType("öğrenci");
    }

    public double getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(double totalScore) {
        this.totalScore = totalScore;
    }
}
