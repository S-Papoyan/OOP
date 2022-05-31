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
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGender() == 'f') {
                students[i].printInfo();
            }
        }
//        for (Student s : students) {
//            if (s.getGender() == 'f') {
//                s.printInfo();
//            }
    }
    public void isPhdStudents(Student[] students){
        for (Student s: students) {
            if (s.isPhd() == true){
                s.printInfo();
            }
        }
    }
}

