public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(0);
        student1.setFirstName("Ghost");
        student1.setLastName("Kozak");
        student1.setUserName("GhostKozak");
        student1.setEmail("codeodd3@gmail.com");
        student1.setPassword("secretpassword");
        student1.setTotalScore(25);

        Student student2 = new Student();
        student2.setId(1);
        student2.setFirstName("Gökhan");
        student2.setLastName("Tanrıverdi");
        student2.setUserName("Gkhntn");
        student2.setEmail("gkhntn123@gmail.com");
        student2.setPassword("secretpassword!2!");
        student2.setTotalScore(42);

        UserManager userManager = new UserManager();
        userManager.add(student2);
        userManager.add(student1);
        userManager.remove(student2);

        Instructor instructor1 = new Instructor();
        instructor1.setId(3);
        instructor1.setFirstName("Gökhan");
        instructor1.setLastName("Tanrıverdi");
        instructor1.setUserName("Gkhntn");
        instructor1.setEmail("gkhntn123@gmail.com");
        instructor1.setPassword("secretpassword!2!");
        instructor1.setSalary(3000);

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("HTML-CSS");
        course1.setPrice(200);
        course1.setDiscount(15);

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("JAVASCRIPT");
        course2.setPrice(300);
        course2.setDiscount(50);

        System.out.println("Cource Price After Discount : " + course2.getPriceAfterDiscount());

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addCourse(course1, instructor1);
        instructorManager.addCourse(course2, instructor1);

        instructorManager.getCourses(instructor1);

        StudentManager studentManager = new StudentManager();
        studentManager.addCourse(student1, course1);

        studentManager.getCourses(student1);

    }
}
