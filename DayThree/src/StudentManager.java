public class StudentManager extends UserManager {
    public void addCourse(Student student, Course course) {
        student.attendedCourses.add(course);
        System.out.println(course.getName() + " adlı kurs " + student.getFirstName() + " tarafından satın alındı.");
    }
    public void getCourses(Student student) {
        for (Course course : student.attendedCourses) {
            System.out.println(student.getFirstName() + " adlı öğrencini sahip olduğu kurslar : " + course.getName());
        }
    }
}
