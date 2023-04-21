package task3;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StudentsGroup students = new StudentsGroup();
        students.setStudents(Arrays.asList(
                new Student("Alexey", "Smirnov", 1),
                new Student("Sergey", "Ivanov", 2),
                new Student("Ivan", "Petrov", 3),
                new Student("Anna", "Karenina", 1),
                new Student("Olga", "Simonova", 2),
                new Student("Svetlana", "Budanova", 3)
        ));
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
