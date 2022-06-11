package inheritance;

public class Student extends Human{

    private String faculty;
    private int studentId;


    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Faculty: " + faculty);
        System.out.println("Student ID: " + studentId);

    }
}
