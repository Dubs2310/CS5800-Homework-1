public class Main {
    public static void main(String[] args) {
        Instructor i1 = new Instructor();
        i1.setFirstName("Nima");
        i1.setLastName("Davarpanah");
        i1.setOfficeNumber("8-321");

        Instructor i2 = new Instructor();
        i2.setFirstName("John");
        i2.setLastName("Doe");
        i2.setOfficeNumber("3-324");

        Textbook t1 = new Textbook();
        t1.setTitle("Clean Code");
        t1.setAuthor("Robert C. Martin");
        t1.setPublisher("Prentice Hall");

        Textbook t2 = new Textbook();
        t2.setTitle("Cracking the Coding Interview");
        t2.setAuthor("Gayle L. McDowell");
        t2.setPublisher("CareerCup");

        Course c = new Course();
        c.setName("CS5800 - Advanced Software Engineering");
        c.setInstructor1(i1);
        c.setInstructor2(i2);
        c.setTextbook1(t1);
        c.setTextbook2(t2);

        c.printCourseInfo();
    }
}