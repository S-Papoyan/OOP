import model.Student;
import service.StudentService;

public class Main {
    public static void main(String[] args) {

        StudentService service = new StudentService();

        Student s1 = service.create();
        Student s2 = service.create();
        Student s3 = service.create();
        Student[] students = {s1, s2, s3};
        service.smallFemale(students);
        service.byAgeOrder(students);

//        s1.printInfo();
//        System.out.println("---------------");
//        s2.printInfo();
//        System.out.println("---------------");
//        s3.printInfo();
//        System.out.println("---------------");
//        service.femaleStudents(students);
//        service.isPhdStudents(students);
    }
}
