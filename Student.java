package com.studentFinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    Scanner scanner=new Scanner(System.in);

    String name;
    int mainphymarks;
    int mainchemarks;
    int mainmathsmarks;
    int rephymarks;
    int rechemarks;
    int remathsmarks;

    public void setName() {
        System.out.println("please enter your name:");
        this.name = scanner.nextLine();
    }

    public String getName()
    {
        return this.name;
    }

    public void setMainExamMarks()
    {
        System.out.println("please enter your main exam marks:");
        System.out.println("please enter your phy marks:");
        this.mainphymarks=scanner.nextInt();
        System.out.println("please enter your che marks:");
        this.mainchemarks=scanner.nextInt();
        System.out.println("please enter your maths marks:");
        this.mainmathsmarks=scanner.nextInt();

    }

    public List<Integer> getMainExamMarksList()
    {
        List<Integer> li=new ArrayList<Integer>();
        li.add(this.mainchemarks);
        li.add(this.mainmathsmarks);
        li.add(this.mainphymarks);

        return li;
    }

    public void setReExamMarks()
    {
        System.out.println("please enter your Re exam marks:");
        System.out.println("please enter your phy marks:");
        this.rephymarks=scanner.nextInt();
        System.out.println("please enter your che marks:");
        this.rechemarks=scanner.nextInt();
        System.out.println("please enter your maths marks:");
        this.remathsmarks=scanner.nextInt();

    }

    public List<Integer> getReExamMarksList()
    {
        List<Integer> li=new ArrayList<Integer>();
        li.add(this.rechemarks);
        li.add(this.remathsmarks);
        li.add(this.rephymarks);

        return li;
    }
}
