package com.company;

/**
 * Created with IntelliJ IDEA.
 * User: rifatul.islam
 * Date: 4/8/14
 * Time: 10:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class Student<E extends Comparable, T extends Comparable> implements Comparable<Student<E, T>> {
    private E studentRoll;
    private T studentAge;

    public Student(E studentRoll, T studentAge) {
        this.studentRoll = studentRoll;
        this.studentAge = studentAge;
    }

    public E getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(E studentRoll) {
        this.studentRoll = studentRoll;
    }

    public T getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(T studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public int compareTo(Student<E, T> o) {
        int compareValue = o.getStudentRoll().compareTo(studentRoll);
        if (compareValue == 0) {
            return o.getStudentAge().compareTo(studentAge);
        } else {
            return compareValue;
        }

    }
}
