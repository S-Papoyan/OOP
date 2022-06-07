package inheritance;

public class Main {
    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("Sergey");
        student.setLastName("Papoyan");
        student.setYear(1987);
        student.setFaculty("Finance");
        student.setStudentId(1);

        Teacher teacher = new Teacher();
        teacher.setFirstName("Vahan");
        teacher.setLastName("Aramyan");
        teacher.setYear(1980);
        teacher.setExperience((byte) 30);
        teacher.setSalary(1000);

        student.printInfo();
        System.out.println("------------------");
        teacher.printInfo();


    }
}
