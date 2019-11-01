package com.studentFinal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam {

    Map<String, List<Integer>> mainExamMarks;
    Map<String, List<Integer>> reExamMarks;

    void setMainExamMarks(Student s1,Student s2)
    {

        Map<String,List<Integer>> m=new HashMap();

        m.put(s1.getName(),s1.getMainExamMarksList());
        m.put(s2.getName(),s2.getMainExamMarksList());

        this.mainExamMarks=m;

    }
    public Map<String, List<Integer>> getMainExamMarks()
    {
        return this.mainExamMarks;
    }

    public void setReExamMarks(Student s1,Student s2)
    {

        Map<String,List<Integer>> m=new HashMap();

        m.put(s1.getName(),s1.getReExamMarksList());
        m.put(s2.getName(),s2.getReExamMarksList());

        this.reExamMarks=m;
    }

    public Map<String, List<Integer>> getReExamMarks()
    {
        return this.reExamMarks;
    }

    public Map<String,List<Integer>> getBetterExamMarks(){

        for(Map.Entry<String,List<Integer>> entry:this.mainExamMarks.entrySet())
        {
            if(calculateAverage(entry.getValue())>calculateAverage(this.reExamMarks.get(entry.getKey())))
            {
                this.reExamMarks.put(entry.getKey(),entry.getValue());
            }
        }

        return this.reExamMarks;
    }

    static double calculateAverage(List<Integer> li)
    {
        int sum=0;
        for(Integer mark:li)
        {
            sum=sum+mark;
        }
        return sum/li.size();
    }
}
