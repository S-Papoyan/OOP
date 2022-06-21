import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class StudentTest {
    public static void main(String[] args) throws IOException {

        String[] name = {"Vigen,32", "Gor,28", "Arevik,21", "Sokrat,26", "Karen,25", "Edgar,36", "Sergey,34", "Georgi,20" };

        Student[] students = create(name);
        for (Student student : students) {
            System.out.println(student.getName());
            System.out.println(student.getAge());
        }

        Path path = Paths.get("C:\\Users\\Student\\Desktop\\Student.txt");
        String[] strings = Files.readAllLines(path).toArray(new String[0]);
        System.out.println(Arrays.toString(strings));
        int[] numbers = {15, 0, 24, 7, 6, 38, 44, 2};
        sortOfNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
        create(strings);
    }

    private static void sortOfNumbers(int[] numbers) {
        Arrays.sort(numbers);
    }

    public static Student[] create(String[] names) {
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] split = names[i].split(",");
            Student student = new Student();
            student.setName(split[0]);
            student.setAge(Integer.parseInt(split[1]));
            students[i] = student;
        }
        return students;
    }
}
