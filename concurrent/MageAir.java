package com.kda.concurrent;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;


public class MageAir implements Runnable {

    AtomicInteger redCrystal = new AtomicInteger();
    AtomicInteger whiteCrystal = new AtomicInteger();
    PlanetCrystal planetCrystal;
    MageFire mageFire;
    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 6;


    @Override
    public void run() {

        while (redCrystal.get() < 500 && whiteCrystal.get() < 500) {
            locking();
            collectionOfCrystals();
            planetCrystal.getLock().unlock();
            System.out.println("У магов воздуха " + redCrystal.get() + " " + whiteCrystal.get() + " камней");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (mageFire.redCrystal.get() >= 500 || mageFire.whiteCrystal.get() >= 500) {
                System.out.println("Маги воздуха проиграли");
                break;
            }
        }
    }

    private void locking() {
        while (true) {
            boolean planetLock = planetCrystal.getLock().tryLock();
            if (planetLock) {
                break;
            }
        }
    }


    private void collectionOfCrystals() {
        int countRed = RANDOM.nextInt(DEFAULT);
        int countWhite = RANDOM.nextInt(DEFAULT);
        if (planetCrystal.redCrystal.get() < countRed && planetCrystal.whiteCrystal.get() < countWhite) {
            redCrystal.addAndGet(planetCrystal.redCrystal.getAndSet(0));
            whiteCrystal.addAndGet(planetCrystal.whiteCrystal.getAndSet(0));
        } else if (planetCrystal.redCrystal.get() < countRed) {
            redCrystal.addAndGet(planetCrystal.redCrystal.getAndSet(0));
            planetCrystal.whiteCrystal.set(planetCrystal.whiteCrystal.get() - countWhite);
            whiteCrystal.addAndGet(countWhite);
        } else if (planetCrystal.whiteCrystal.get() < countWhite) {
            whiteCrystal.addAndGet(planetCrystal.whiteCrystal.getAndSet(0));
            planetCrystal.redCrystal.set(planetCrystal.redCrystal.get() - countRed);
            redCrystal.addAndGet(countRed);
        } else {
            planetCrystal.redCrystal.set(planetCrystal.redCrystal.get() - countRed);
            planetCrystal.whiteCrystal.set(planetCrystal.whiteCrystal.get() - countWhite);
            redCrystal.addAndGet(countRed);
            whiteCrystal.addAndGet(countWhite);
        }
    }

    public void setPlanetCrystal(PlanetCrystal planetCrystal) {
        this.planetCrystal = planetCrystal;
    }

    public AtomicInteger getRedCrystal() {
        return redCrystal;
    }

    public AtomicInteger getWhiteCrystal() {
        return whiteCrystal;
    }

    public PlanetCrystal getPlanetCrystal() {
        return planetCrystal;
    }

    public MageFire getMageFire() {
        return mageFire;
    }

    public void setMageFire(MageFire mageFire) {
        this.mageFire = mageFire;
    }
}

