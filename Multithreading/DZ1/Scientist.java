package com.kda.Multithreading.DZ1;

public class Scientist {

    private int countPart;
    private int countRobot;

    public void creationRobot(int countPart) {
        countRobot = countPart / 5;
        System.out.println("Было создано " + countRobot + " роботов");
    }

    public void setCountPart(int countPart) {
        this.countPart = countPart;
    }

    public int getCountPart() {
        return countPart;
    }
}
