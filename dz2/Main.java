package com.kda.dz2;

public class Main {
    public static void main(String[] args) {
        Planet planetOne = new Earth(40000, "Земля", 40, 7000000);
        Planet planetTwo = new Earth(50000, "ЗемляДва", 50, 500000);
        planetOne.getInformationShow();
        System.out.println(planetOne.diameterCalculation(planetOne.getRadius()));
        ((Earth) planetOne).rain();
        ((Earth) planetOne).wind();
        planetOne.planetComparison(planetTwo);

        Star star = new Sun("Солнце", 1000);

        SpaceUtils.objectDefinition(planetOne);
        SpaceUtils.objectDefinition(star);


    }

}
