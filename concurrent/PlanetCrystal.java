package com.kda.concurrent;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PlanetCrystal implements Runnable {

    AtomicInteger redCrystal = new AtomicInteger();
    AtomicInteger whiteCrystal = new AtomicInteger();
    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 6;
    private final Lock lock = new ReentrantLock();
    MageFire mageFire;
    MageAir mageAir;


    @Override
    public void run() {

        while (mageFire.redCrystal.get() < 500 && mageFire.whiteCrystal.get() < 500 && mageAir.redCrystal.get() < 500 && mageAir.whiteCrystal.get() < 500) {
            appearanceOfCrystal();
            System.out.println("Камней на планете " + redCrystal.get() + " " + whiteCrystal.get());
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Состязание магов окончено");

    }


    private void appearanceOfCrystal() {
        int countRed = RANDOM.nextInt(DEFAULT);
        int countWhite = RANDOM.nextInt(DEFAULT);
        redCrystal.addAndGet(countRed);
        whiteCrystal.addAndGet(countWhite);

    }

    public Lock getLock() {
        return lock;
    }

    public AtomicInteger getRedCrystal() {
        return redCrystal;
    }

    public void setRedCrystal(AtomicInteger redCrystal) {
        this.redCrystal = redCrystal;
    }

    public AtomicInteger getWhiteCrystal() {
        return whiteCrystal;
    }

    public void setWhiteCrystal(AtomicInteger whiteCrystal) {
        this.whiteCrystal = whiteCrystal;
    }

    public MageFire getMageFire() {
        return mageFire;
    }

    public void setMageFire(MageFire mageFire) {
        this.mageFire = mageFire;
    }

    public MageAir getMageAir() {
        return mageAir;
    }

    public void setMageAir(MageAir mageAir) {
        this.mageAir = mageAir;
    }
}
