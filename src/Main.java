import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();
        Student s1 = service.create();
        Student s2 = service.create();
        Student s3 = service.create();
        Student[] students = {s1, s2, s3};
        service.oldStudent(students);
        System.out.println("---------------");
        service.oldestStudent(s1, s2);
        System.out.println("---------------");
        service.smallFemale(students);
        System.out.println("---------------");
        service.sortOfAge(students);
        System.out.println("---------------");
        service.secondMin(students).printInfo();
        System.out.println("---------------");
        s1.printInfo();
        System.out.println("---------------");
        s2.printInfo();
        System.out.println("---------------");
        s3.printInfo();
        System.out.println("---------------");
        service.femaleStudents(students);
        System.out.println("---------------");
        service.isPhdStudents(students);
        System.out.println("---------------");
        service.smallMark(students);
    }
}
