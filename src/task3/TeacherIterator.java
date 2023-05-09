package task3;

import java.util.Iterator;
import java.util.List;

public class TeacherIterator implements Iterator<Teacher> {

    private static int counter;
    private List<Teacher> teachersIterable;
    public TeacherIterator(List<Teacher> teachersIterable) {
        this.counter = 0;
        this.teachersIterable = teachersIterable;
    }

    @Override
    public boolean hasNext() {
        return counter < teachersIterable.size();
    }

    @Override
    public Teacher next() {
        return teachersIterable.get(counter++);
    }
}
