package com.kda.Multithreading.DZ2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MagesAir magesAir = new MagesAir();
        MageFire mageFire = new MageFire();

        PlanetCrystals planetCrystals = new PlanetCrystals(mageFire, magesAir);

        mageFire.setPlanetCrystalsAndMage(planetCrystals, magesAir);
        magesAir.setPlanetCrystalsAndMage(planetCrystals, mageFire);

        Thread comandFair = new Thread(mageFire);
        Thread planets = new Thread(planetCrystals);
        Thread comandAir = new Thread(magesAir);

        planets.start();
        comandFair.start();
        comandAir.start();

        planets.join();
        comandFair.join();
        comandAir.join();

        System.out.println(mageFire.getRedCrystal());
        System.out.println(mageFire.getWhiteCrystal());

        System.out.println("Маги Воздуха");

        System.out.println(magesAir.getRedCrystal());
        System.out.println(magesAir.getWhiteCrystal());
    }
}
