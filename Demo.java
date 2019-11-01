package com.studentFinal;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo {

    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student();

        s1.setName();
        s1.setMainExamMarks();
        s1.setReExamMarks();

        s2.setName();
        s2.setMainExamMarks();
        s2.setReExamMarks();

        Exam e=new Exam();
        e.setMainExamMarks(s1,s2);
        e.setReExamMarks(s1,s2);

        System.out.println("main exam marks:");
        printmarks(e.getMainExamMarks());
        System.out.println("re exam marks:");
        printmarks(e.getReExamMarks());
        System.out.println("better exam marks:");
        printmarks(e.getBetterExamMarks());

    }

    static void printmarks(Map<String, List<Integer>> hm)
    {

        for(Map.Entry<String,List<Integer>> entry: hm.entrySet())
        {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
}
