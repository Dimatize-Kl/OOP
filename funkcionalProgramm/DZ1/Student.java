package com.kda.funkcionalProgramm.DZ1;

import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private int coors;
    private List<Double> ocenki;

    public Student(String firstName, String lastName, int coors, List<Double> ocenki) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.coors = coors;
        this.ocenki = ocenki;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getCoors() {
        return coors;
    }

    public List<Double> getOcenki() {
        return ocenki;
    }
}
