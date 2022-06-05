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
        System.out.println("Enter mark: ");
        double mark = c.nextDouble();
        System.out.println("Enter gender: 'f' (female) or 'm' (male): ");
        char gender = c.next().charAt(0);
        System.out.println("Enter is PHF true/false?");
        boolean isPhd = c.nextBoolean();
        return new Student(name, year, mark, gender, isPhd);
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

    public void smallFemale(Student[] students) {
        Student min = null;
        for (Student student : students) {
            if (min == null) {
                if (student.getGender() == 'f') {
                    min = student;
                }
            } else if (student.getGender() == 'f' && student.getYear() > min.getYear()) {
                min = student;
            }
        }
        if (min != null) {
            for (Student student : students) {
                if (student.getGender() == 'f' && student.getYear() == min.getYear()) {
                    student.printInfo();
                }
            }
        } else {
            System.out.println("No female");
        }
    }

    /*
        Student օբյեկտների array-ի մեջ դասավորել օբյեկտների տարիքները ըստ աճման կարգի և տպել անունները։
     */
    public void sortOfAge(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getYear() < students[j].getYear()) {
                    Student temp;
                    temp = students[j];
                    students[j] = students[i];
                    students[i] = temp;
                }
            }
            System.out.println(students[i].getName() + ": " + students[i].getYear());
        }
    }

    public Student secondMin(Student[] students) {

        Student min = students[0];
        for (Student x : students) {
            if (x.getYear() >= min.getYear()) {
                min = x;
            }
        }
        return min;
    }

    public void oldStudent(Student[] students) {
        Student oldStudent = null;
        for (Student student : students) {
            if (oldStudent == null) {
                oldStudent = student;
            } else if (student.getYear() < oldStudent.getYear()) {
                oldStudent = student;
            }
        }
        oldStudent.printInfo();
    }

    public void smallMark(Student[] students) {

        Student smallMark = null;
        for (Student student : students) {
            if (smallMark == null) {
                smallMark = student;
            } else if (student.getMark() < smallMark.getMark()) {
                smallMark = student;
            }
        }
            smallMark.printInfo();
    }
}






