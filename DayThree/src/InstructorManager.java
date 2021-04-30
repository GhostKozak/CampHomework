public class InstructorManager extends UserManager {
    public void addCourse(Course course, Instructor instructor) {
        course.setCreator(instructor);
        instructor.courses.add(course);
        System.out.println(course.getName() + " adlı kurs " + course.getCreator() + " tarafından eklendi.");
    }

    public void getCourses(Instructor instructor) {
        for (Course course : instructor.courses) {
            System.out.println(instructor.getFirstName() + " adlı kullanıcının kursları : " + course.getName());
        }
    }
}
