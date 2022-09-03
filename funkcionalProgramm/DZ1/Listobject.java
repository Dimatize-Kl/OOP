package com.kda.funkcionalProgramm.DZ1;

import java.util.List;

public class Listobject {

    private List<Double> listObjectDouble;
    private List<String> listObjectString;


    public Listobject(List<Double> listObjectDouble, List<String> listObjectString){
        this.listObjectDouble = listObjectDouble;
        this.listObjectString = listObjectString;
    }

    public List<Double> getListObjectDouble() {
        return listObjectDouble;
    }

    public List<String> getListObjectString() {
        return listObjectString;
    }

    @Override
    public String toString() {
        return "Listobject{" +
                "listObjectDouble=" + listObjectDouble +
                ", listObjectString=" + listObjectString +
                '}';
    }
}
