package com.kda.collection;

import java.util.*;

public class Student {

    private String name;
    private String seName;
    private int age;
    private double gpa;

    public Student(String name, String seName, int age, double gpa) {
        this.name = name;
        this.seName = seName;
        this.age = age;
        this.gpa = gpa;
    }

    public static void main(String[] args) {
        Student studentOne = new Student("Vasy", "Vaskin", 20, 4.5);
        Student studentTwo = new Student("Dima", "Dimkin", 21, 4.7);
        Student studentThree = new Student("Sergey", "Sergeev", 22, 4.4);
        Student studentBest = new Student("", "", 0, 0);

        List<Student> listTwo = Arrays.asList(studentOne, studentTwo, studentThree);

        for (Iterator<Student> iterator = listTwo.iterator(); iterator.hasNext(); ) {
            Student studentIterator = iterator.next();
            if (studentBest.gpa < studentIterator.gpa) {
                studentBest = studentIterator;
            }
        }

        System.out.println(studentBest.toString());
        listTwo.sort(Comparator.comparing(Student::getName).thenComparing(Student::getSeName));
        System.out.println(listTwo);
        listTwo.sort(Comparator.comparing(Student::getAge));
        System.out.println(listTwo);
        listTwo.sort(Comparator.comparing(Student::getGpa));
        System.out.println(listTwo);

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", seName='" + seName + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSeName() {
        return seName;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }
}
