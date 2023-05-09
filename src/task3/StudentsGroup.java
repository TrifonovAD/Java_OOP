package task3;

import java.util.Iterator;
import java.util.List;

public class StudentsGroup implements Iterable<Student> {
    private String nameGroup;
    private int groupId;
    private Teacher teacher;
    private List<Student> students;

    public StudentsGroup(String nameGroup, int groupId, Teacher teacher) {
        this.nameGroup = nameGroup;
        this.groupId = groupId;
        this.teacher = teacher;
        teacher.addGroupToTeacher(this);
    }

    @Override
    public String toString() {
        return String.format("%s. ID: %d", nameGroup, groupId);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentsGroupIterator(students);
    }
}
