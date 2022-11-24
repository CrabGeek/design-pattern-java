package com.crabgeek.principle.demeterlow;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
public class Teacher {
    @NonNull
    private String name;
    @NonNull
    private String clazz;
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student("花花", 10 , 589));
        studentList.add(new Student("豆豆", 54 , 356));
        studentList.add(new Student("秋雅", 23 , 439));
        studentList.add(new Student("皮皮", 2 , 665));
        studentList.add(new Student("蛋蛋", 19 , 502));
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public double clazzTotalScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore;
    }

    public double clazzAverageScore() {
        double totalScore = 0;
        for (Student student : studentList) {
            totalScore += student.getGrade();
        }
        return totalScore / studentList.size();
    }

    public int clazzStudentCount() {
        return studentList.size();
    }
}
