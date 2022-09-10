package com.kda.Multithreading.DZ2;

import java.util.Random;

public class PlanetCrystals implements Runnable {

    private static int redCrystal;
    private static int whiteCrystal;
    private MageFire mageFire;
    private MagesAir magesAir;

    private static final Random RANDOM = new Random();
    private static final int DEFAULT = 6;

    public PlanetCrystals(MageFire mageFire, MagesAir magesAir) {
        this.mageFire = mageFire;
        this.magesAir = magesAir;
    }

    @Override
    public void run() {
        while (((mageFire.getRedCrystal() <= 500) || (mageFire.getWhiteCrystal() <= 500))) {
            while ((((magesAir.getRedCrystal() <= 500) || (magesAir.getWhiteCrystal() <= 500)))) {
                crystalGrowth();
                System.out.println(redCrystal + " " + whiteCrystal);
            }
        }
    }

    public void crystalGrowth() {
        int countRedCrystal = RANDOM.nextInt(DEFAULT);
        int countWhiteCrystal = RANDOM.nextInt(DEFAULT);
        if (countRedCrystal + countWhiteCrystal > 5) {
            if (countRedCrystal >= countWhiteCrystal) {
                countRedCrystal = countRedCrystal - (countRedCrystal + countWhiteCrystal - 5);
                redCrystal += countRedCrystal;
                whiteCrystal += countWhiteCrystal;
            } else {
                countWhiteCrystal = countWhiteCrystal - (countRedCrystal + countWhiteCrystal - 5);
                redCrystal += countRedCrystal;
                whiteCrystal += countWhiteCrystal;
            }
        } else {
            redCrystal += countRedCrystal;
            whiteCrystal += countWhiteCrystal;
        }
    }

    public void minusCrystal(int redCrystal1, int whiteCrystal1) {
        redCrystal -= redCrystal1;
        whiteCrystal -= whiteCrystal1;
    }

    public static int getRedCrystal() {
        return redCrystal;
    }

    public static int getWhiteCrystal() {
        return whiteCrystal;
    }
}
