package com.kda.Multithreading.DZ1;

import java.util.Random;

public class Minion implements Runnable {

    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 4;
    private int countParts;
    private Dump dump;
    private Scientist scientist;

    public Minion(Dump dump , Scientist scientist) {
        this.dump = dump;
        this.scientist = scientist;

    }

    @Override
    public void run() {

        synchronized (dump) {
            int days = 0;
            while (days <=30) {
                dump.addParts();
                while (true) {
                    int random = RANDOM.nextInt(DEFAULT);
                    if (dump.getNumberOfSpareParts() >= random) {
                        dump.setNumberOfSpareParts(random);
                        countParts += random;
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("На свалке было найдено - " + random + " деталей");
                    } else if (dump.getNumberOfSpareParts() <= random && dump.getNumberOfSpareParts() != 0) {
                        countParts += dump.getNumberOfSpareParts();
                        dump.setNumberOfSpareParts(dump.getNumberOfSpareParts());
                        System.out.println("На свалке было найдено - " + dump.getNumberOfSpareParts() + " деталей");
                        System.out.println(Thread.currentThread().getName());
                    } else {
                        System.out.println(Thread.currentThread().getName());
                        System.out.println("Деталей нет");
                    }
                    scientist.setCountPart(countParts);
                    scientist.creationRobot(scientist.getCountPart());
                    try {
                        Thread.sleep(100);
                        dump.wait(100);
                        break;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                days++;
            }
        }
    }
}
