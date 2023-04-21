package task3;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class StudentsGroup implements Iterable<Student> {
    private String nameGroup;
    private int groupId;
    private Teacher teacher;

    public StudentsGroup(String nameGroup, int groupId) {
        this.nameGroup = nameGroup;
        this.groupId = groupId;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentsGroupIterator(students);
    }
}
