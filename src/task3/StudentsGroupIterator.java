package task3;

import java.util.Iterator;
import java.util.List;

public class StudentsGroupIterator implements Iterator<Student> {
    private List<Student> studentsIterable;
    private static int counter;

    public StudentsGroupIterator(List<Student> studentsIterable) {
        this.counter = 0;
        this.studentsIterable = studentsIterable;
    }

    @Override
    public boolean hasNext() {
        return counter < studentsIterable.size();
    }

    @Override
    public Student next() {
        return studentsIterable.get(counter++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
