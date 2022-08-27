package com.kda.collection.DZ2;

public class User {

    private static int id;
    private String name;
    private int age;

    public User(String name, int age){
        this.name = name;
        this.age = age;
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
