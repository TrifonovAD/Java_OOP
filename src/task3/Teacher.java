package task3;

import java.util.List;
import java.util.Set;

public class Teacher {
    private String firsName;
    private String lastName;
    private String objectTeacher;
    private Set <StudentsGroup> studentsGroups;

    public Teacher(String firsName, String lastName, String objectTeacher) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.objectTeacher = objectTeacher;
    }

    public void addGroup(StudentsGroup studentsGroup) {
        studentsGroups.add(studentsGroup);
    }
    public void removeGroup(StudentsGroup studentsGroup) {
        studentsGroups.remove(studentsGroup);
    }

}

