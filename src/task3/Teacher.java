package task3;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teacher extends Person implements Iterable<Teacher> {
    private List studentsGroups = new ArrayList();
    private List<Teacher> teachers;

    public Teacher(String firsName, String lastName) {
        super(firsName, lastName);
    }

    public void addGroupToTeacher(StudentsGroup studentsGroup) {
        if(!studentsGroups.contains(studentsGroup)) {
            studentsGroups.add(studentsGroup);
        }
    }
    public void removeGroup(StudentsGroup studentsGroup) {
        studentsGroups.remove(studentsGroup);
    }

    public List getStudentsGroups() {
        return studentsGroups;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", firstName, lastName, studentsGroups);

    }

    @Override
    public Iterator<Teacher> iterator() {
        return new TeacherIterator(teachers);
    }


}

