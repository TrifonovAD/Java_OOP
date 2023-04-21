//- Создать класс Студент
//- Создать класс УчебнаяГруппаИтератор
//- Создать класс УчебнаяГруппаИтератор, заставив его реализовать интерфейс Iterator
//- Реализовать его контракты (включая удаление)

//- Создать класс СтудентКомпаратор реализующий интерфейс Comparator
//- Реализовать контракт compare () со сравнением по какому-либо параметру (пример: сочетание Имя+Фамилия)

// К коду с семинара добаить класс Teacher и возможность итерации и компорации для него.
// Так же для учебной группы добавить преподавателя(У группы может быть только один преподаватель,
// у проподавателя сколько угодно групп)

package task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alexey", "Smirnov", 1, 4.1));
        students.add(new Student("Sergey", "Ivanov", 2, 4.3));
        students.add(new Student("Ivan", "Petrov", 3, 3.8));
        students.add(new Student("Anna", "Karenina", 1, 4.1));
        students.add(new Student("Olga", "Simonova", 2, 3.4));
        students.add(new Student("Svetlana", "Budanova", 3, 5.0));

        System.out.println("=======Список всех студентов=======");
        Iterator<Student> iteratorStudent = students.iterator();
        while (iteratorStudent.hasNext()) {
            System.out.println(iteratorStudent.next());
        }

        System.out.println("\n=======Отсортированный список=======");
        students.sort(new StudentComparator());
        for (Student student : students) {
            if(student.getAverageScore() > 4.0) {
                System.out.println(student);
            }
        }


        Teacher teacher1 = new Teacher("Мария", "Иванова");
        Teacher teacher2 = new Teacher("Олег", "Карпов");
        Teacher teacher3 = new Teacher("Татьяна", "Тихонова");
        Teacher teacher4 = new Teacher("Сергей", "Николаев");

        StudentsGroup studentsGroup1 = new StudentsGroup("Группа 01", 1, teacher1);
        StudentsGroup studentsGroup2 = new StudentsGroup("Группа 02", 2, teacher2);
        StudentsGroup studentsGroup3 = new StudentsGroup("Группа 03", 3, teacher2);
        StudentsGroup studentsGroup4 = new StudentsGroup("Группа 04", 4, teacher3);
        StudentsGroup studentsGroup5 = new StudentsGroup("Группа 05", 5, teacher3);
        StudentsGroup studentsGroup6 = new StudentsGroup("Группа 06", 6, teacher3);
        StudentsGroup studentsGroup7 = new StudentsGroup("Группа 07", 7, teacher4);
        StudentsGroup studentsGroup8 = new StudentsGroup("Группа 08", 8, teacher4);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        /**
         * Вывод сортированного списка учителей по количеству групп
         */

        System.out.println("\n=======Отсортированный список учителей по количеству групп=======");
        Iterator<Teacher> iteratorTeacher = teachers.iterator();
        Collections.sort(teachers, new TeacherComparator());
        for (Teacher teacher : teachers) {
            System.out.println(teacher);

        }

    }
}
