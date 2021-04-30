import java.util.ArrayList;

public class Instructor extends User {
    private double salary;
    private int courseCount;
    ArrayList<Course> courses = new ArrayList<>();

    Instructor() {
        this.setUserType("öğretmen");
    };

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
