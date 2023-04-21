//- Создать класс Студент
//- Создать класс УчебнаяГруппаИтератор
//- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//- Реализовать его контракты (включая удаление)

//- Создать класс СтудентКомпаратор реализующий интерфейс Comparator
//- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)

package task3;

import java.util.Arrays;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        StudentsGroup students = new StudentsGroup();
        students.setStudents(Arrays.asList(
                new Student("Alexey", "Smirnov", 1, 4.1),
                new Student("Sergey", "Ivanov", 2, 4.3),
                new Student("Ivan", "Petrov", 3, 3.8),
                new Student("Anna", "Karenina", 1, 4.1),
                new Student("Olga", "Simonova", 2, 3.4),
                new Student("Svetlana", "Budanova", 3, 5.0)
        ));
        Iterator<Student> iter = students.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("\n=======Отсортированный список=======");
        students.getStudents().sort(new StudentComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
