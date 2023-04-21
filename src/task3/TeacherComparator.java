package task3;

import java.util.Comparator;

public class TeacherComparator implements Comparator<Teacher> {

    @Override
    public int compare(Teacher o1, Teacher o2) {
        return o1.getStudentsGroups().size() > o2.getStudentsGroups().size() ? -1
                : (o1.getStudentsGroups().size() < o2.getStudentsGroups().size() ? 1 : 0);
    }
}
