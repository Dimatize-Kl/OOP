package com.kda.funkcionalProgramm.DZ1;

import java.util.*;

public class StudentRunner {
    public static void main(String[] args) {


        List<Double> ocenkiSt1 = List.of(4.0, 3.0);
        Student st1 = new Student("Dima", "Klochkov", 1, ocenkiSt1);
        List<Double> ocenkiSt2 = List.of(2.0, 3.0, 4.0, 3.0);
        Student st2 = new Student("Aima", "Klochkov", 1, ocenkiSt2);
        List<Double> ocenkiSt3 = List.of(4.0, 4.0, 5.0, 5.0);
        Student st3 = new Student("Cima", "Klochkov", 1, ocenkiSt3);

        List<Student> list1 = Arrays.asList(st1, st2, st3);
        StudentList studentList1 = new StudentList(list1);

        // Задние 1
        List<Double> listDouble = new ArrayList<>();

        list1.stream()
                .filter(student -> student.getOcenki().size() >= 3)
                .forEach(student -> student.getOcenki().stream()
                        .forEach(volume -> listDouble.add(volume)));

        Map<Integer, Double> mapNew = new HashMap<>();

        mapNew.put(studentList1.getList().get(0).getCoors(), listDouble.stream().
                mapToDouble(value -> value.doubleValue()).
                average().
                orElseThrow());

        System.out.println(mapNew);
        //Задание 2
        Map<Integer, String> mapNewTwo = new HashMap<>();

        List<String> listString = new ArrayList<>();

        list1.stream().
                forEach(student -> listString.add(student.getFirstName() + " " + student.getLastName()));

        Collections.sort(listString);

        mapNewTwo.put(studentList1.getList().get(0).getCoors(), listString.toString());

        System.out.println(mapNewTwo);

        //Задание 3
        Map<Integer, Listobject> mapThree = new HashMap<>();
        Listobject listobject = new Listobject(listDouble,listString);
        mapThree.put(studentList1.getList().get(0).getCoors(), listobject);

        System.out.println(mapThree);


    }
}

