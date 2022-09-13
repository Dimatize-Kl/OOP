package com.kda.concurrent;

import com.kda.Multithreading.DZ2.MagesAir;
import com.kda.Multithreading.DZ2.PlanetCrystals;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        MageFire mageFire = new MageFire();
        MageAir mageAir = new MageAir();
        PlanetCrystal planetCrystal = new PlanetCrystal();
        planetCrystal.setMageFire(mageFire);
        planetCrystal.setMageAir(mageAir);

        mageFire.setMageAir(mageAir);
        mageFire.setPlanetCrystal(planetCrystal);

        mageAir.setPlanetCrystal(planetCrystal);
        mageAir.setMageFire(mageFire);

        Thread threadOne = new Thread(planetCrystal);
        Thread threadTwo = new Thread(mageFire);
        Thread threadThree = new Thread(mageAir);

        threadOne.start();
        threadTwo.start();
        threadThree.start();


        threadOne.join();
        threadTwo.join();
        threadThree.join();


    }
}
