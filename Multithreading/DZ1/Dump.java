package com.kda.Multithreading.DZ1;

import java.util.Random;

public class Dump extends Thread {

    private int numberOfSpareParts = 20;
    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 4;

    public synchronized void addParts() {
        numberOfSpareParts += RANDOM.nextInt(DEFAULT);
    }

    public int getNumberOfSpareParts() {
        return numberOfSpareParts;
    }

    public synchronized void setNumberOfSpareParts(int parts) {
        this.numberOfSpareParts -= parts;
    }
}
