package com.kda.Multithreading.DZ2;

import java.util.Random;

public class MageFire implements Runnable {

    private int redCrystal;
    private int whiteCrystal;
    private PlanetCrystals planetCrystals;
    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 6;


    @Override
    public void run() {
        while (redCrystal < 500 || whiteCrystal < 500) {
            checkCrystals();
        }
        System.out.println("Маги Огня собрали кристаллы");
    }

    public void increaseCrystals(int redCrystal, int whiteCrystal) {
        this.redCrystal += redCrystal;
        this.whiteCrystal += whiteCrystal;
    }

    public void checkCrystals() {
        if (PlanetCrystals.getRedCrystal() == 0 && PlanetCrystals.getWhiteCrystal() == 0) {
            System.out.println("Маги огня возвращаются ни с чем");
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

    public void setPlanetCrystals(PlanetCrystals planetCrystals) {
        this.planetCrystals = planetCrystals;
    }

    public int getRedCrystal() {
        return redCrystal;
    }

    public int getWhiteCrystal() {
        return whiteCrystal;
    }
}
