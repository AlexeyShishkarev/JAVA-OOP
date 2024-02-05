package Seminar.study_group;

import java.util.Iterator;
import java.util.List;

public  class StudentIterator implements Iterator<Student> {
    private List<Student> studentList;

    public StudentIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    private int index;

    @Override
    public boolean hasNext() {
        return studentList.size() > index;
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
