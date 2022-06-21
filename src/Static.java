import java.util.Locale;

public class Static {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student();
        Student s8 = new Student();


        String s = "Vigen,Arevik,Gor,Sokrat,Karen,Edgar,Sergey,Georgi";
        String[] name = s.split(",");
        for (String elem : name) {
            System.out.println(elem);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ',') {
                System.out.println();
                continue;
            }
            System.out.print(c);
        }

        String password = "AAA78l56";
        f(password);
        //8 char, 3 uppercase, 2 digit

    }

    public static void f(String password) {
        int countOfUppercase = 0;
        int countOfDigit = 0;
        if (password.length() < 8) {
            System.out.println("Not strong");
        } else {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    countOfDigit++;
                } else if (Character.isUpperCase(c)) {
                    countOfUppercase++;
                }
            }
        }
        if (countOfDigit >= 2 && countOfUppercase >= 3) {
            System.out.println("Strong");
        } else {
            System.out.println("Not strong");
        }
    }


//        String name = "Vigen,Arevik,Gor,Sokrat,Karen,Edgar,Sergey,Georgi";
//        String[] names = name.split(",");
//
//        for (int i = 0; i < names.length; i++) {
//            Student student = new Student();
//            student.name = names[i];
//            System.out.println(student.name);
//        }
//    }
}

