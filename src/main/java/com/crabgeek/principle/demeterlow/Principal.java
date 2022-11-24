package com.crabgeek.principle.demeterlow;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    private Teacher teacher = new Teacher("丽华", "3年级1班");

    public Map<String, Object> queryClazzInfo(String clazzId) {
        int studentCount = teacher.clazzStudentCount();
        double totalScore = teacher.clazzTotalScore();
        double averageScore = teacher.clazzAverageScore();

        Map<String, Object> mapObj = new HashMap<>();

        mapObj.put("班级", teacher.getClazz());
        mapObj.put("老师姓名", teacher.getName());
        mapObj.put("学生人数", studentCount);
        mapObj.put("总分", totalScore);
        mapObj.put("平均分", averageScore);

        return mapObj;
    }
}
