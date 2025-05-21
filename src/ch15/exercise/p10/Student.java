package ch15.exercise.p10;

import java.util.TreeSet;

public class Student implements TreeSet<Student> {
    public String id;
    public int score;

    public Student(String id, int score) {
        this.id = id;
        this.score = score;
    }

}
