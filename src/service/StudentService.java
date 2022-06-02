package service;
import model.Student;
import java.util.Scanner;
public class StudentService {

    public Student create() {
        Scanner c = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = c.next();
        System.out.println("Enter year: ");
        int year = c.nextInt();
        System.out.println("Enter gender: 'f' (female) or 'm' (male): ");
        char gender = c.next().charAt(0);
        System.out.println("Enter is PHF true/false?");
        boolean isPhd = c.nextBoolean();
        return new Student(name, year, gender, isPhd);
    }
    public void oldestStudent(Student s1, Student s2) {
        if (s1.getYear() < s2.getYear()) {
            System.out.println(s1.getName());
        } else if (s1.getYear() > s2.getYear()) {
            System.out.println(s2.getName());
        } else {
            System.out.println(s1.getName() + ", " + s2.getName());
        }
    }

    public void femaleStudents(Student[] students) {
        for (Student student : students) {
            if (student.getGender() == 'f') {
                student.printInfo();
            }
        }
    }

    public void isPhdStudents(Student[] students) {
        for (Student s : students) {
            if (s.isPhd()) {
                s.printInfo();
            }
        }
    }
    /*
        Տպել տարքիով ամենափոքր աղջիկ ուսանողի անունը։
        Չի ստացվում տպել տվյալ աղջիկ ուսանողի printInfo() մեթոդը։
        Չի ստացվում տպել տվյալ աղջիկ ուսանողի printInfo() մեթոդը, եթե տրված array-ի մեջ 2-ը աղջիկ են, 1-ը տղա։
    */
    public void smallFemale(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getYear() > students[j].getYear()) {
                    Student temp;
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
        }
        for (Student student : students) {
            if (student.getGender() == 'f') {
                System.out.println(students[students.length - 1].getName());
                break;
            } else if (student.getGender() == 'm') {
                System.out.println("All students are men");
                break;
            }
        }
    }

    /*
        Student օբյեկտների array-ի մեջ դասավորել օբյեկտների տարիքները ըստ աճման կարգի և տպել անունները։
     */
    public void byAgeOrder(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getYear() > students[j].getYear()) {
                    Student temp;
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
            System.out.println(students[i].getName() + ": " + students[i].getYear());
        }
    }
}




