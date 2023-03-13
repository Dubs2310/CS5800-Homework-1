public class Course {
    private String name;
    private Instructor instructor1;
    private Instructor instructor2;
    private Textbook textbook1;
    private Textbook textbook2;

    public Course() {
        name = "";
        instructor1 = null;
        instructor2 = null;
        textbook1 = null;
        textbook2 = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instructor getInstructor1() {
        return instructor1;
    }

    public void setInstructor1(Instructor instructor1) {
        this.instructor1 = instructor1;
    }

    public Instructor getInstructor2() {
        return instructor2;
    }

    public void setInstructor2(Instructor instructor2) {
        this.instructor2 = instructor2;
    }

    public Textbook getTextbook1() {
        return textbook1;
    }

    public void setTextbook1(Textbook textbook1) {
        this.textbook1 = textbook1;
    }

    public Textbook getTextbook2() {
        return textbook2;
    }

    public void setTextbook2(Textbook textbook2) {
        this.textbook2 = textbook2;
    }

    public void printCourseInfo() {
        System.out.println(this.name);
        System.out.println(this.instructor1.getFirstName() + ", " + this.instructor1.getLastName());
        System.out.println(this.instructor2.getFirstName() + ", " + this.instructor2.getLastName());
        System.out.println(this.textbook1.getTitle() + ", " + this.textbook1.getAuthor());
        System.out.println(this.textbook2.getTitle() + ", " + this.textbook2.getAuthor());
    }
}
