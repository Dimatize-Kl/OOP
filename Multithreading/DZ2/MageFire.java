package com.kda.Multithreading.DZ2;

import java.util.Random;

public class MageFire implements Runnable {

    private volatile int redCrystal;
    private volatile int whiteCrystal;
    private PlanetCrystals planetCrystals;
    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 6;
    private MagesAir magesAir;


    @Override
    public void run() {
        synchronized (planetCrystals) {
            while (redCrystal < 500 && whiteCrystal < 500) {
                if (magesAir.getRedCrystal() < 500 && magesAir.getWhiteCrystal() < 500) {
                    try {
                        checkCrystals();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        planetCrystals.wait(50);
                        planetCrystals.notifyAll();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("Маги огня проиграли");
                    break;
                }
            }
        }
    }

    public void increaseCrystals(int redCrystal, int whiteCrystal) {
        this.redCrystal += redCrystal;
        this.whiteCrystal += whiteCrystal;
    }

    public void checkCrystals() throws InterruptedException {
        if (PlanetCrystals.getRedCrystal() == 0 && PlanetCrystals.getWhiteCrystal() == 0) {
            System.out.println("Маги огня возвращаются ни с чем");
            Thread.sleep(100);
        } else {
            int countRedCrystal = RANDOM.nextInt(DEFAULT);
            int countWhiteCrystal = RANDOM.nextInt(DEFAULT);
            if (countRedCrystal > PlanetCrystals.getRedCrystal()) {
                countRedCrystal = PlanetCrystals.getRedCrystal();
            }
            if (countWhiteCrystal > PlanetCrystals.getWhiteCrystal()) {
                countWhiteCrystal = PlanetCrystals.getWhiteCrystal();
            }
            planetCrystals.minusCrystal(countRedCrystal, countWhiteCrystal);
            increaseCrystals(countRedCrystal, countWhiteCrystal);
        }
    }

    public void setPlanetCrystalsAndMage(PlanetCrystals planetCrystals, MagesAir magesAir) {
        this.planetCrystals = planetCrystals;
        this.magesAir = magesAir;
    }

    public int getRedCrystal() {
        return redCrystal;
    }

    public int getWhiteCrystal() {
        return whiteCrystal;
    }
}
